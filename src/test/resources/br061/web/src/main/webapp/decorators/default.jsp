<!DOCTYPE html>
<%@ include file="/common/taglibs.jsp"%>
<html lang="en">
<head>
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="<c:url value="/images/favicon.ico"/>"/>
    <title><decorator:title/> | <fmt:message key="webapp.name"/></title>
    <t:assets type="css"/>
    
    <script src="https://use.fontawesome.com/0b8321873a.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.js" integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE=" crossorigin="anonymous"></script>

    <decorator:head/>


    <script type="text/javascript">
      $(document).ready(function() {
    	  $('#myModal').modal("hide");
    
    	  $("#navbar a:not('.dropdown-toggle')").on("click", function(event) {
              console.log("Clicked Detected:" + event );
              $('#myModal').modal("show");
          });
    	  
          $("#button").on("click", function(event) {
              console.log("Clicked Detected:" + event );
              $('#myModal').modal("show");
          });
          
          $(".btn-default").on("click", function(event) {
              console.log("Clicked Detected:" + event );
              $('#myModal').modal("show");
          });
          
          
          
          $(".btn-primary").on("click", function(event) {
                //console.log("Clicked Detected:" + event );
                $('#myModal').modal("show");
          });
      });
    </script>
    
</head>
<body<decorator:getProperty property="body.id" writeEntireProperty="true"/><decorator:getProperty property="body.class" writeEntireProperty="true"/>>
    <c:set var="currentMenu" scope="request"><decorator:getProperty property="meta.menu"/></c:set>

    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value='/'/>"><fmt:message key="webapp.name"/></a>
        </div>

        <%@ include file="/common/menu.jsp" %>
        <c:if test="${pageContext.request.locale.language != 'en'}">
            <div id="switchLocale"><a href="<c:url value='/?locale=en'/>">
                <fmt:message key="webapp.name"/> in English</a>
            </div>
        </c:if>
    </div>

    <div class="container" id="content">
        <%@ include file="/common/messages.jsp" %>
        <div class="row">
            <decorator:body/>

            <c:if test="${currentMenu == 'AdminMenu'}">
                <div class="col-sm-2">
                <menu:useMenuDisplayer name="Velocity" config="navlistMenu.vm" permissions="rolesAdapter">
                    <menu:displayMenu name="AdminMenu"/>
                </menu:useMenuDisplayer>
                </div>
            </c:if>
        </div>
    </div>

    <div id="footer" class="container navbar-fixed-bottom">
        <span class="col-sm-6 text-left"><fmt:message key="webapp.version"/>
            <c:if test="${pageContext.request.remoteUser != null}">
            | <fmt:message key="user.status"/> ${pageContext.request.remoteUser}
            </c:if>
        </span>
        <span class="col-sm-6 text-right">
            &copy; <fmt:message key="copyright.year"/> <a href="<fmt:message key="company.url"/>"><fmt:message key="company.name"/></a>
        </span>
    </div>
    
    <div id="myModal" class="modal fade" role="dialog">
      <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" 
            data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Processing....</h4>
          </div>
          <div class="modal-body">
            <i class="fa fa-spinner fa-spin fa-3x fa-fw"></i>
            <span class="sr-only">Loading...</span>
          </div>
          <div class="modal-footer">
          </div>
        </div>
      </div>
    </div>
    
    
<t:assets type="js"/>    
<%= (request.getAttribute("scripts") != null) ?  request.getAttribute("scripts") : "" %>
</body>
</html>
