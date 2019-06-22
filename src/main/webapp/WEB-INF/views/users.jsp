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

<form:form method="post" modelAttribute="user">

    <div class="container">

        <header>Dodaj użytkownika</header>

        <div class ="row">
            <div class="form-group col-md-4">
                <label for="dateId">Początek rezerwacji</label>
                <form:input type="datetime" path="date" class="form-control" id="dateId"/>
                <form:errors path="date" element="div" cssClass="error"/>
            </div>
            <div class="form-group col-md-4">
                <label for="nameId">Name:</label>
                <form:input type="text" path="name" id="nameId"/>
                <form:errors path="name" element="div"/>
            </div>
            <div class="form-group col-md-4">
                <label for="phoneNumberId">Phone number:</label>
                <form:input type="number" path="phoneNumber" id="phoneNumberId"/>
                <form:errors path="phoneNumber" element="div"/>
            </div>
        </div>
        <input type="submit" value="Zapisz">
    </div>

</form:form>

<%@include file="footer.jspf" %>
</body>
</html>
