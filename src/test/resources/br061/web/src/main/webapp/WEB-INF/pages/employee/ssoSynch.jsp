<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="ssoInit.title"/></title>
    <meta name="menu" content="UserMenu"/>
    
  
    
</head>
<div class="col-sm-3">
    <h2><fmt:message key="ssoInit.heading"/></h2>
    <p><fmt:message key="ssoInit.message"/></p>
    <br>
    <p>For help manually provisioning Ultipro User Accounts see 
    <a href="https://odysseysystems.atlassian.net/wiki/display/ES/Manually+provision+an+Ultipro+SSO+user">Confluence</a>
</div>
<!-- <div class="col-sm-7"> -->
   <%--  <spring:bind path="employee.*">
    </spring:bind> --%>

	
    <div class="row">

				<display:table name="userInfo" class="table table-condensed table-striped table-hover" requestURI="" id="list" export="false" pagesize="25">
					
					<display:column property="clientUserName" sortable="false" titleKey="ssoInit.id"/>
					<display:column property="activationKey" sortable="false" titleKey="ssoInit.primaryEmail"/>
					
				</display:table>
			</div>

		