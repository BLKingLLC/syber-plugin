<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="newhirelogList.title" /></title>
<meta name="menu" content="NewhirelogMenu" />
</head>

<c:if test="{'$'}{not empty searchError}">
	<div class="alert alert-danger alert-dismissable">
		<a href="#" data-dismiss="alert" class="close">&times;</a>
		<c:out value="{'$'}{searchError}" />
	</div>
</c:if>

<h2>
	<fmt:message key="newhirelogList.heading" />
</h2>

<form method="get" action="${ctx}/employee/newhirelogs" id="searchForm"
	class="form-inline">
	<div id="search" class="text-right">
		<%-- <span class="col-sm-9"> <input type="text" size="20" name="q"
			id="query" value="${param.q}"
			placeholder="<fmt:message key="search.enterTerms"/>"
			class="form-control input-sm" />
		</span>  --%>
		
		<span id="HiredRange" class="col-sm-9"> 
		<input type="date"
			size="20" name="beginDate" id="query"
			value="${param.beginDate}"
			placeholder="<fmt:message key="employee.dateInPast"/>"
			class="form-control input-sm"/> 
			
			<input type="date" size="20"
			name="endDate" id="query" value="${param.endDate}"
			placeholder="<fmt:message key="employee.todayOrEarlier"/>"
			class="form-control input-sm"/>
		</span>
		
		
		<button id="button.search" class="btn btn-default btn-sm"
			type="submit">
			<i class="icon-search"></i>
			<fmt:message key="button.search" />
		</button>
	</div>
</form>

<p>
	<fmt:message key="newhirelogList.message" />
</p>



<display:table name="newhirelogList"
	class="table table-condensed table-striped table-hover" requestURI=""
	id="list" export="true" pagesize="25">


	<c:set var="tableClass" value="success"></c:set>
	<c:if test="${list.googleClientId != list.ssoClientId }">

		<c:set var="ssoClass" value="danger"></c:set>
	</c:if>
	<c:set var="tableClass" value="success"></c:set>
	<c:if test="${list.googleClientId == list.ssoClientId }">

		<c:set var="ssoClass" value="success"></c:set>

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


	<display:setProperty name="paging.banner.item_name">
		<fmt:message key="newhirelogList.newhirelog" />
	</display:setProperty>
	<display:setProperty name="paging.banner.items_name">
		<fmt:message key="newhirelogList.newhirelogs" />
	</display:setProperty>

	<display:setProperty name="export.excel.filename">
		<fmt:message key="newhirelogList.title" />.xls</display:setProperty>
	<display:setProperty name="export.csv.filename">
		<fmt:message key="newhirelogList.title" />.csv</display:setProperty>
	<display:setProperty name="export.pdf.filename">
		<fmt:message key="newhirelogList.title" />.pdf</display:setProperty>
    
</display:table>


