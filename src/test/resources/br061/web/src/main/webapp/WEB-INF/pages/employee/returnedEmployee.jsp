<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="returnedEmployee.title" /></title>
<meta name="menu" content="EmployeeMenu" />

<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", -1);
%>





</head>
<div class="col-sm-3">
	<h2>
		<fmt:message key="returnedEmployee.heading" />
	</h2>
	<p>
		<fmt:message key="returnedEmployee.message" />
	</p>
</div>
<!-- <div class="col-sm-7"> -->
<%--  <spring:bind path="employee.*">
    </spring:bind> --%>



<br>
<div class="row">



	<display:table name="${newuserrun.newhirelogs}" 
	
		class="table table-condensed table-hover
		" 
		requestURI=""
		id="list" export="true" pagesize="25">
		<c:set var="tableClass" value="success"></c:set>
<c:if test="${list.googleClientId != list.ssoClientId }">
		
		<c:set var="ssoClass" value="danger"></c:set>
		</c:if>

		
		<display:column property="newuserrun.date" sortable="false" titleKey="returnedEmployee.createdTime" class="${tableClass}"/>
		<display:column property="name" sortable="false" titleKey="returnedEmployee.name" class="${tableClass}"
		url="/employee/ultiPro" paramId="empID" paramProperty="employeeID"/>
		<display:column property="primaryEmail" sortable="false" titleKey="returnedEmployee.primaryEmail" class="${tableClass}"
		url="/employee/googleInit" paramId="id"
			paramProperty="primaryEmail" />
		<display:column property="sso" sortable="false" titleKey="returnedEmployee.ssocreate" class="${ssoClass}" />
		
		
		<display:column property="emailAddress" sortable="false" titleKey="returnedEmployee.emailCreate" class="${tableClass}" />
		<display:column property="welcomeEmail" sortable="false" titleKey="returnedEmployee.welcomeEmailSent" class="${tableClass}"/>
		
		

	</display:table>

</div>

