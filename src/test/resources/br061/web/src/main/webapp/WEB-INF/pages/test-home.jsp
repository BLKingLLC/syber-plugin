<%@ include file="/common/taglibs.jsp"%>

<head>
    <title><fmt:message key="home.title"/></title>
    <meta name="menu" content="Home"/>
</head>
<body class="home">

<h2><fmt:message key="home.heading"/></h2>
<p><fmt:message key="home.message"/></p>


<div id="navbar">
  <ul class="dropdown">
    <li><a href="<c:out value="one?param=value" />">Link Text</a></li>
  </ul>
</div>

<ul>
    <li><button class="btn primary btn-primary">Any Button</button></li>
    <li><a href="<c:url value="${pageContext.request.contextPath}/test/one?param=value" />" class="btn primary btn-primary">Any Link</a></li>
</ul>

</body>