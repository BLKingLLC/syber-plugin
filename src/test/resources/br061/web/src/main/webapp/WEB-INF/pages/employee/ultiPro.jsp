<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="ssoInit.title" /></title>
<meta name="menu" content="UserMenu" />



</head>
<div class="col-sm-3">
	<h2>
		<fmt:message key="ultiPro.heading" />
	</h2>
	<p>
		<fmt:message key="ultiPro.message" />
	</p>
	<br>
</div>
<!-- <div class="col-sm-7"> -->
<%--  <spring:bind path="employee.*">
    </spring:bind> --%>





<br>
<form method="get" action="${ctx}/employee/ultiPro" id="searchForm"
	class="form-inline">
	<div id="search" class="text-right">
		<span id="empID" class="col-sm-9"> <input type="text" size="20"
			name="empID" id="query" value="${requestParams.empID}"
			placeholder="<fmt:message key="ultiPro.empID"/>"
			class="form-control input-sm">
		</span>

		<button id="button.search" class="btn btn-default btn-sm"
			type="submit">
			<i class="icon-search"></i>
			<fmt:message key="button.search" />
		</button>
	</div>
</form>



<div class="row">

	<div class="col-md-4">


		<form:form commandName="ultiUser" method="post" action="ultiPro"
			cssClass="well" id="ultiUser" name="ultiUser"
			onsubmit="return validateUltiPro(this)">
			<form:hidden path="formerLastName"/>
			<form:hidden path="middleName"/>
			<form:hidden path="preferredFirstName"/>
			<form:hidden path="prefix"/>
			<form:hidden path="ssn"/>
			<form:hidden path="suffix"/>
			<form:hidden path="companyCode"/>

			<form:input cssClass="form-control" path="firstName" id="firstName.value" maxlength="45" />
			<form:input cssClass="form-control" path="lastName" id="firstName.value" maxlength="45" />
			<form:input cssClass="form-control" path="emailAddress" id="firstName.value" maxlength="45" />
			<form:input cssClass="form-control" path="alternateEmailAddress" id="firstName.value" maxlength="45" />
			<form:input cssClass="form-control" path="employeeNumber" id="firstName.value" maxlength="45" />






			<div class="row">
				<div class="col-md-3" id="add">

					<button type="submit" class="btn btn-default" id="add" name="add"
						onclick="bCancel=false">
						<i class="icon-ok icon-white"></i>
						<fmt:message key="button.add" />
					</button>

				</div>
				<div class="col-md-3" id="update">

					<button type="submit" class="btn btn-primary" id="update"
						name="update" onclick="bCancel=false">
						<i class="icon-ok icon-white"></i>
						<fmt:message key="button.update" />
					</button>

				</div>
				<div class="col-md-3" id="delete">

					<button type="submit" class="btn btn-danger" id="delete"
						name="delete"
						onclick="bCancel=true;return confirmMessage(msgDelConfirm)">
						<i class="icon-ok icon-white"></i>
						<fmt:message key="button.delete" />
					</button>

				</div>
				<div class="col-md-3" id="cancel">

					<button type="submit" class="btn btn-warning" id="cancel"
						name="cancel" onclick="bCancel=true">
						<i class="icon-ok icon-white"></i>
						<fmt:message key="button.cancel" />
					</button>

				</div>

			</div>

		</form:form>

	</div>