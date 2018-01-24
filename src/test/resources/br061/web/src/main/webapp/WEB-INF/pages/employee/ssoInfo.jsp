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



   
    
    
    <form method="get" action="${ctx}/employee/ssoInfo" id="searchForm" class="form-inline">
    <div id="search" class="text-right">
        <span id="UserEmail" class="col-sm-9">
            <input type="text" size="20" name="email" id="query" value="${requestParams.email}"
                   placeholder="<fmt:message key="ssoInit.userEmail"/>" class="form-control input-sm">
        </span>
                
        <button id="button.search" class="btn btn-default btn-sm" type="submit">
            <i class="icon-search"></i> <fmt:message key="button.search"/>
        </button>
    </div>
    </form>
    

	
    <div class="row">

				<display:table name="userInfo" class="table table-condensed table-striped table-hover" requestURI="" id="list" export="false" pagesize="25">
					
					<display:column property="id" sortable="false" titleKey="ssoInit.id"/>
					<display:column property="primaryEmail" sortable="false" titleKey="ssoInit.primaryEmail"/>
					
				</display:table>
			</div>

		