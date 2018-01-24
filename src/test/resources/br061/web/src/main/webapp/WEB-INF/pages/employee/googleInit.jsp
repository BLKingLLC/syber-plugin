<%@ include file="/common/taglibs.jsp"%>

<head>
<title><fmt:message key="googUser.title" /></title>
<meta name="menu" content="EmployeesMenu" />
</head>

<c:set var="delObject" scope="request"><fmt:message key="googUser.users"/></c:set>
<script type="text/javascript">var msgDelConfirm =
   "<fmt:message key="delete.confirm"><fmt:param value="${delObject}"/></fmt:message>";
</script>

<div class="row">

</div>
<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-5"></div>
	<div class="col-md-3">
	<br>
		<form method="get" action="${ctx}/employee/googleInit" id="searchForm"
			class="form-inline">
			<div id="search" class="text-right">
				<span id="id" class="col-sm-9"> <input type="text" size="20"
					name="id" id="query" placeholder="<fmt:message key="user.email"/>"
					class="form-control input-sm">
				</span>

				<button id="button.search" class="btn btn-default btn-sm"
					type="submit">
					<i class="icon-search"></i>
					<fmt:message key="button.search" />
				</button>

			</div>
		</form>
	</div>
	<div class="col-md-1">
	<a href="${ctx}/employee/googleInit"><button id="button.new" class="btn btn-primary btn-sm"><fmt:message key="button.new" /></button></a>
	</div>
</div>



<div class="row">
	<div class="col-md-4">
		<h2>
			<fmt:message key="googleinit.heading" />
		</h2>
		<p>
			<fmt:message key="googleinit.message" />
		</p>
	</div>
	<div class="col-md-4">
		<form:errors path="googUser.*" cssClass="alert alert-danger alert-dismissable"
			element="div" />
		<form:form commandName="googUser" method="post" action="googleInit"
			cssClass="well" id="googUser" name="googUser"
			onsubmit="return validateGoogUser(this)">


			<spring:bind path="id">
				<appfuse:label key="user.id" styleClass="control-label" />
				<form:input cssClass="form-control" path="id" id="id" maxlength="45" readonly="true" />
			</spring:bind>




			<spring:bind path="primaryEmail">
			<div class="form-group${(not empty status.errorMessage) ? ' has-error' : ''}">
			</spring:bind>
			<appfuse:label key="user.primaryEmail" styleClass="control-label" />
			<form:input cssClass="form-control" path="primaryEmail"
				id="primaryEmail" maxlength="45" />
			<form:errors path="primaryEmail" cssClass="help-block" />
			</div>





			<spring:bind path="name.givenName">
			</spring:bind>
			<appfuse:label key="user.givenName" styleClass="control-label" />
			<form:input cssClass="form-control" path="name.givenName"
				id="givenName" maxlength="45" />
			<form:errors path="name.givenName" cssClass="help-block" />

			<spring:bind path="name.familyName">
			</spring:bind>
			<appfuse:label key="user.familyName" styleClass="control-label" />
			<form:input cssClass="form-control" path="name.familyName"
				id="familyName" maxlength="45" />
			<form:errors path="name.familyName" cssClass="help-block" />

			<spring:bind path="orgUnitPath">
				<appfuse:label key="user.orgUnitPath" styleClass="control-label" />
				<form:input cssClass="form-control" path="orgUnitPath"
					id="orgUnitPath" maxlength="45" />
			</spring:bind>

		
		<div class="row">
			
			<div class="col-md-3" id="add-reset">

			<c:choose>
				<c:when test="${googUser.id == null }"	>		
		        <button type="submit" class="btn btn-default" id="add" name="add" onclick="bCancel=false">
		            <i class="icon-ok icon-white"></i> <fmt:message key="button.add"/>
		        </button>
		        </c:when>
		        <c:when test="${googUser.id != null }">
		        <button type="submit" class="btn btn-default" id="reset" name="reset" onclick="bCancel=false">
		            <i class="icon-ok icon-white"></i> <fmt:message key="button.reset"/>
		        </button>
		        </c:when>
		        </c:choose>
			</div>
			<div class="col-md-3" id="update">
			
		        <button type="submit" class="btn btn-primary" id="update" name="update" onclick="bCancel=false">
		            <i class="icon-ok icon-white"></i> <fmt:message key="button.update"/>
		        </button>
		        
			</div>
			<div class="col-md-3" id="delete">
			
		        <button type="submit" class="btn btn-danger" id="delete" name="delete" 
		        		onclick="bCancel=true;return confirmMessage(msgDelConfirm)">
		            <i class="icon-ok icon-white"></i> <fmt:message key="button.delete"/>
		        </button>
		        
			</div>
			<div class="col-md-3" id="cancel">
			
		        <button type="submit" class="btn btn-warning" id="cancel" name="cancel" onclick="bCancel=true">
		            <i class="icon-ok icon-white"></i> <fmt:message key="button.cancel"/>
		        </button>
		        
			</div>

		</div>

</form:form>

	</div>
</div>
<v:javascript formName="googUser" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<c:url value='/scripts/validator.jsp'/>"></script>

<script type="text/javascript">
    $(document).ready(function() {
        $("input[type='text']:visible:enabled:first", document.forms['googUser']).focus();
    });
</script>
