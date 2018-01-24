package com.odysystems.breerabit.webapp.controller;

import com.odysystems.Constants;
import com.odysystems.breerabit.webapp.util.PayrollMapInterface;
import com.odysystems.breerabit.webapp.util.PayrollPreProcessor;


import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Controller class to upload Files.
 * <p/>
 * <p>
 * <a href="FileUploadFormController.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
@Controller
@RequestMapping("/payroll/payroll*")
public class PayRollController extends BaseFormController {

    public PayRollController() {
        setCancelView("redirect:/home");
        setSuccessView("/payroll/payrollDisplay");
    }

    @ModelAttribute
    @RequestMapping(method = RequestMethod.GET)
    public PayrollUpload showForm() {
    	PayrollUpload form = new PayrollUpload();
    	
        return form;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(PayrollUpload fileUpload, BindingResult errors, HttpServletRequest request)
            throws Exception {

        if (request.getParameter("cancel") != null) {
            return getCancelView();
        }

        if (validator != null) { // validator is null during testing
            validator.validate(fileUpload, errors);

            if (errors.hasErrors()) {
                return "payroll";
            }
        }

        // validate a file was entered
        if (fileUpload.getFile().length == 0) {
            Object[] args =
                    new Object[]{getText("uploadForm.file", request.getLocale())};
            errors.rejectValue("file", "errors.required", args, "File");

            return "fileupload";
        }

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest.getFile("file");

        // the directory to upload to
        String uploadDir = getServletContext().getRealPath("/resources");

        // The following seems to happen when running jetty:run
        if (uploadDir == null) {
            uploadDir = new File("src/main/webapp/resources").getAbsolutePath();
        }
        uploadDir += "/" + request.getRemoteUser() + "/";

        // Create the directory if it doesn't exist
        File dirPath = new File(uploadDir);

        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }

        //retrieve the file data
        InputStream stream = file.getInputStream();
        
        // Strip lines that include an exclamation mark
        // file utils requires a file... I want to strip it before it becomes a file
        // or... maybe we don't alter the input file here.  Store it to disk, 
        //then prior to running translator we strip it from the file.
        // but translator should be standalone, so we should do the stripping in the controller.
        

        //write the file to the file specified
        OutputStream bos = new FileOutputStream(uploadDir + file.getOriginalFilename());
        int bytesRead;
        byte[] buffer = new byte[8192];

        while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        bos.close();

        //close the stream
        stream.close();
        
        // Strip all the lines that contain an ! 
        //TODO:  The file storage should be more secure and/or relative
        //PayrollPreProcessor strip = new PayrollPreProcessor();
        String fileName = file.getOriginalFilename();
        String path = dirPath.getAbsolutePath();
        String fileAndPath = (path + Constants.FILE_SEP + fileName);
        
        //log.debug("Sending " + fileName + " and " + dirPath + "to PayrollPreProcessor");

        //PayrollPreProcessor.payrollStripper(fileName, path);
        
        
        
        //Send the file over to Altova to be 
        PayrollMapInterface map = new PayrollMapInterface();
        String payrollDate = fileUpload.getDate();
        String payrollType = fileUpload.getType();
        String outFile = map.transform(fileAndPath, fileName, path, payrollDate, payrollType);
        
        //MappingMapToUTM_Input mapp = new MappingMapToUTM_Input();
        //mapp.run()
        
        // place the data into the request for retrieval on next page
        request.setAttribute("friendlyName", fileUpload.getName());
        request.setAttribute("date", fileUpload.getDate());
        request.setAttribute("fileName", file.getOriginalFilename());
        request.setAttribute("contentType", file.getContentType());
        request.setAttribute("size", file.getSize() + " bytes");
        // TODO:  Change location to a relative URL so that the new file can be downloaded if neccesary
        request.setAttribute("location", dirPath.getAbsolutePath() + Constants.FILE_SEP + file.getOriginalFilename());

        String link = request.getContextPath() + "/resources" + "/" + request.getRemoteUser() + "/";
        request.setAttribute("link", link + outFile);

        return getSuccessView();
    }
    

}
