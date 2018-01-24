<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="userProfile.title"/></title>
    <meta name="menu" content="UserMenu"/>
    
    
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.13.0/css/ui.jqgrid.css">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/jq/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jq/js/jquery-ui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jq/js/i18n/grid.locale-en.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jq/js/jquery.jqGrid.min.js"></script>


  
<script type="text/javascript">
	$(function() {
		$("#tabs").tabs();
	});
</script>
    
</head>
<c:set var="now" value="<%=new java.util.Date()%>" />
<div class="col-sm-3">
    <h2><fmt:message key="employees.heading"/></h2>
    <p><fmt:message key="employees.message"/></p>
</div>
<!-- <div class="col-sm-7"> -->
   <%--  <spring:bind path="employee.*">
    </spring:bind> --%>



   
    
    
    <form method="get" action="${ctx}/employee/employeesCostpoint" id="searchForm" class="form-inline">
    <div id="search" class="text-right">
        <span id="EmployeeNumber" class="col-sm-9">
            <input type="text" size="20" name="empId" id="query" value="${requestParams.empId}"
                   placeholder="<fmt:message key="employee.employeeNumber"/>" class="form-control input-sm">
        </span>
        <span id="EmployeeLastName"class="col-sm-9">
            <input type="text" size="20" name="lastName" id="query" value="${requestParams.lastName}"
                   placeholder="<fmt:message key="employee.lastName"/>" class="form-control input-sm">
        </span>
        <span id="EmployeeFirstName" class="col-sm-9">
            <input type="text" size="20" name="firstName" id="query" value="${requestParams.firstName}"
                   placeholder="<fmt:message key="employee.firstName"/>" class="form-control input-sm">
        </span>
        <span id="HiredRange" class="col-sm-9">
            <input type="date" size="20" name="beginDate" id="query" value="${requestParams.beginDate}"
                   placeholder="<fmt:message key="employee.beginDate"/>" class="form-control input-sm">
            <input type="date" size="20" name="endDate" id="query" value="${requestParams.endDate}"
                   placeholder="<fmt:message key="employee.endDate"/>" class="form-control input-sm">
        </span>
        
        <button id="button.search" class="btn btn-default btn-sm" type="submit">
            <i class="icon-search"></i> <fmt:message key="button.search"/>
        </button>
    </div>
    </form>
    

	
    <div class="row">
		<div class="pre-scrollable" id="tabs">
			
			<ul>
				<li><a href="#tabs-1">Record 1</a></li>
				<li><a href="#tabs-2">Record 2</a></li>
				<li><a href="#tabs-3">Record 3</a></li>
			</ul>
			
			<div id="tabs-1">
				<display:table name="employeePList" class="table table-condensed table-striped table-hover" requestURI="" id="list" export="true" pagesize="25">
					<!-- First we set the transformation variables -->
					<!--Change Employee Type
					UltiPro returns REG CostPoint expects R
					  -->
					<c:if test="${list.employeeJob.employeeType.value eq 'REG'}">
						<c:set var="employeeType" value="R"/>
					</c:if>
					<!--Change Employment Status
					UltiPro Returns A
					Costpoint expects Value must be "ACT", "FML", "IAL", or "IN"
					  -->
					<c:if test="${list.employeeInformation.employmentStatus.value eq 'A'}">
						<c:set var="employmentStatus" value="ACT"/>
					</c:if>
					
					<!--The order of columns is set precisely for the CSV import of employees for CostPoint
					
					TODO:  Add a hide if null capability
					  -->
					
					<display:column value="1" sortable="false"  titleKey="RecordCode" media="csv"/>
					<display:column property="person.SSN.value" sortable="false" titleKey="person.ssn"/>
					<display:column property="employee.employeeNumber.value" sortable="false"  titleKey="person.employeeNumber"/>
					<display:column property="person.firstName.value" sortable="false"  titleKey="person.firstName"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column property="person.lastName.value" sortable="false" titleKey="person.lastName"/>
					<display:column property="employeeInformation.lastHire" sortable="false"  titleKey="employeeInformation.lastHire"/>
					<display:column value="${employmentStatus}" sortable="false"  titleKey="employeeInformation.employmentStatus"/>
					<display:column property="employeeJob.payFrequency.value" sortable="false"  titleKey="employeeJob.payFrequency"/>
					<display:column property="employeeJob.payFrequency.value" sortable="false"  titleKey="employeeJob.payFrequency"/>
					<display:column property="employeeJob.jobCode.value" sortable="false"  titleKey="employeeJob.jobCode"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="Y" sortable="false"  titleKey="FLSA Exempt" media="csv"/>
					<display:column value="${employeeType}" sortable="false"  titleKey="employeeJob.employeeType"> </display:column>
					<display:column property="employeeJob.hourlyOrSalaried.value" sortable="false"  titleKey="employeeJob.hourlyOrSalaried"/>
					<display:column property="employeeJob.orgLevel4.value" sortable="false"  titleKey="employeeJob.orgLevel4"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column property="address.stateOrProvince.value" sortable="false"  titleKey="address.stateOrProvidence"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
<%-- 					<display:column value="2016-12-22" sortable="false"  titleKey="employeeJob.effectiveDate"/> --%>
					<display:column sortable="false"  titleKey="RecordEffecitveDate"><fmt:formatDate pattern="yyyy-MM-dd" 
					            value="${now}" /></display:column>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column property="address.addressLine1.value" sortable="false"  titleKey="address.addressLine1"/>
					<display:column property="address.addressLine2.value" sortable="false"  titleKey="address.addressLine2 "/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column property="address.city.value" sortable="false"  titleKey="address.city"/>
					<display:column property="address.stateOrProvince.value" sortable="false"  titleKey="address.stateOrProvidence"/>
					<display:column property="address.country.value" sortable="false"  titleKey="address.country"/>
					<display:column property="address.zipOrPostalCode.value" sortable="false"  titleKey="address.zipOrPostalCode"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="1969-01-01" sortable="false"  titleKey="DateOfBirth" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="M" sortable="false"  titleKey="Gender" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="WHITE" sortable="false"  titleKey="Race/Ethnicity" media="csv"/>
					<display:column property="employeeJob.supervisor.value.supervisorEmpId.value" sortable="false"  titleKey="person.supervisorId"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
					<display:column value="" sortable="false"  titleKey="MiddleName" media="csv"/>
				</display:table>
			</div>
			<div id="tabs-2">
			
			<display:table name="employeePList" class="table table-condensed table-striped table-hover" requestURI="" id="tab2" export="true" pagesize="25">
					<!-- First we set the transformation variables -->
					
					<!--The order of columns is set precisely for the CSV import of employees for CostPoint
					
					TODO:  Add a hide if null capability
					  -->
					
					<display:column value="2" sortable="false"  titleKey="RecordCode" media="csv"/>
					<display:column property="employee.employeeNumber.value" sortable="false"  titleKey="person.employeeNumber"/>
					<display:column value="ODYSSEY" sortable="false"  titleKey="TaxableEntity" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column value="" sortable="false"  titleKey="Optional" media="csv"/>
					<display:column sortable="false"  titleKey="RecordEffecitveDate"><fmt:formatDate pattern="yyyy-MM-dd" 
            value="${now}" /></display:column>
				</display:table>
			</div>
			<div id="tabs-3">
			</div>
		</div>
	</div>

		