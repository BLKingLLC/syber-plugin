<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="home.title"/></title>
    <meta name="menu" content="Home"/>
</head>
<body class="home">

<h2><fmt:message key="home.heading"/></h2>
<p><fmt:message key="home.message"/></p>

<ul class="glassList">
    <li>
        <a href="<c:url value='/userform'/>"><fmt:message key="menu.user"/></a>
    </li>
    <li>
        <a href="<c:url value='/payroll/payroll'/>"><fmt:message key="menu.selectFile"/></a>
    </li>
</ul>

<a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/payroll/payroll" role="button">Payroll Transformer</a>
</body>
