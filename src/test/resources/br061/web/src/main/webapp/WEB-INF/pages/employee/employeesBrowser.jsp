<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="userProfile.title" /></title>
<meta name="menu" content="UserMenu" />

<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", -1);
%>

</head>
<c:set var="now" value="<%=new java.util.Date()%>" />
<div class="col-sm-3">
	<h2>
		<fmt:message key="employees.heading" />
	</h2>
	<p>
		<fmt:message key="employees.message" />
	</p>
</div>
<!-- <div class="col-sm-7"> -->
<%--  <spring:bind path="employee.*">
    </spring:bind> --%>



<br>
<div class="row">

	<form method="get" action="${ctx}/employee/employeesBrowser"
		id="searchForm" class="form-inline">
		<div id="search" class="text-right">
			<span id="EmployeeNumber" class="col-sm-9"> <input type="text"
				size="20" name="empId" id="query" value="${requestParams.empId}"
				placeholder="<fmt:message key="employee.employeeNumber"/>"
				class="form-control input-sm">
			</span> <span id="EmployeeLastName" class="col-sm-9"> <input
				type="text" size="20" name="lastName" id="query"
				value="${requestParams.lastName}"
				placeholder="<fmt:message key="employee.lastName"/>"
				class="form-control input-sm">
			</span> <span id="EmployeeFirstName" class="col-sm-9"> <input
				type="text" size="20" name="firstName" id="query"
				value="${requestParams.firstName}"
				placeholder="<fmt:message key="employee.firstName"/>"
				class="form-control input-sm">
			</span> <span id="HiredRange" class="col-sm-9"> <input type="date"
				size="20" name="beginDate" id="query"
				value="${requestParams.beginDate}"
				placeholder="<fmt:message key="employee.beginDate"/>"
				class="form-control input-sm"> <input type="date" size="20"
				name="endDate" id="query" value="${requestParams.endDate}"
				placeholder="<fmt:message key="employee.endDate"/>"
				class="form-control input-sm">
			</span>
			<div class="form-group" id="buttons">
				<button id="button.search" class="btn btn-default btn-sm"
					type="submit">
					<i class="icon-search"></i>
					<fmt:message key="button.search" />
				</button>
			</div>
		</div>
	</form>

</div>
<div class="row">
	<form:form commandName="create" method="post" action="employeesBrowser"
		id="employeeBrowser" autocomplete="off"
		onsubmit="return validateUser(this)">
		<button type="submit" class="btn btn-primary" name="create"
			onclick="bCancel=false">
			<i class="icon-ok icon-white"></i>
			<fmt:message key="button.create" />
		</button>
	</form:form>
	
	<c:out value="${returnedUser}"/>
	
	<display:table name="employeeList.employees"
		class="table table-condensed table-striped table-hover" requestURI=""
		id="list" export="true" pagesize="25">
		<%-- 		<display:column property="employeePList.index" /> --%>
		<display:column property="employee.employeeNumber.value"
			sortable="false" titleKey="person.employeeNumber"
			url="/employee/ultiPro" paramId="empID" paramProperty="employee.employeeNumber.value" />
		<display:column property="person.firstName.value" sortable="false"
			titleKey="person.firstName" />
		<display:column property="person.lastName.value" sortable="false"
			titleKey="person.familyName" />
			<display:column property="person.emailAddress.value" sortable="false"
			titleKey="person.primaryEmailAddress" url="/employee/googleInit" paramId="id"
			paramProperty="person.emailAddress.value" />
			<display:column property="person.alternateEmailAddress.value" sortable="false"
			titleKey="person.alternateEmailAddress" />
			<display:column value="Create" class="btn btn-default btn-lg btn-block" url="/employee/returnedEmployee" paramId="empID" paramProperty="employee.employeeNumber.value"/>

	</display:table>





</div>

