<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="<c:url value="/webjars/jquery/3.0.0/jquery.min.js"/>"></script>
    <script src="<c:url value="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"/>"></script>
    <link href="<c:url value="/webjars/bootstrap/4.3.1/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">

    <title>Rezerwacje</title>

</head>
<body>
<%@include file="header.jspf" %>


<form:form method="post">

    <div class="container">

        <div id="stoliki" class="col-xs-2">
            <a id="stolikDuzy" a href="http://localhost:8080/reservation/stolikDuzy/add">
            <img src="/resources/img/stolikKawowy2.jpg" alt="stolik" width="538" height="338">
            </a>
            <a id="stolik" a href="http://localhost:8080/reservation/stolik/add">
                <img src="/resources/img/stolikmały1.png" alt="stolik" width="308" height="230">
            </a>
            <a id="stolik1" a href="http://localhost:8080/reservation/stolik1/add">
                <img src="/resources/img/stolikmały1.png" alt="stolik" width="308" height="230">
            </a>
            <a id="stolik2" a href="http://localhost:8080/reservation/stolik2/add">
                <img src="/resources/img/stolikmały1.png" alt="stolik" width="308" height="230">
            </a>
            <a id="stolik3" a href="http://localhost:8080/reservation/stolik3/add">
                <img src="/resources/img/stolikmały1.png" alt="stolik" width="308" height="230">
            </a>
        </div>

</form:form>

</body>
</html>
