package com.odysystems.breerabit.webapp.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

	@RequestMapping("/")
	public String testHome(Model model) {
		ArrayList<String> message = new ArrayList<String>();
		message.add("Hello");
		message.add("World");
		model.addAttribute("message", message);
		return "test-home";
	}
	
	@RequestMapping("one")
	public String testOne(Model model) {
		ArrayList<String> message = new ArrayList<String>();
		message.add("One");
		message.add("Two");
		model.addAttribute("message", message);
		
		try {
			Thread.sleep(new Long(5000));
			System.out.println("Sleep For 5000ms");
		} catch (InterruptedException e) {
			System.out.println("Trying to sleep");
			e.printStackTrace();
		}
		
		return "test-one";
	}
	
	
}
