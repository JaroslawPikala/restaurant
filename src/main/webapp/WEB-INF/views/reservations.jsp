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

    <form:form method="post" modelAttribute="reservation">

        <div class="container">

            <header>Rezerwacje</header>

            <div class ="row">
                <div class="form-group col-md-4">
                    <label for="startDateId">Data rezerwacji</label>
                    <form:input type="date" path="startDate" class="form-control" id="startDateId"/>
                    <form:errors path="startDate" element="div" cssClass="error"/>
                </div>
                <div class="form-group col-md-4">
                <label for="startTimeId">Godzina rezerwacji</label>
                <form:input type="time" path="startTime" min="08:00" max="17:00" class="form-control" id="startTimeId"/>
                <form:errors path="startTime" element="div" cssClass="error"/>
            </div>
                <div class="form-group col-md-4">
                    <label for="endTimeId">Koniec rezerwacji</label>
                    <form:input type="time" path="endTime" min="09:00" max="18:00" class="form-control" id="endTimeId"/>
                    <form:errors path="endTime" element="div" cssClass="error"/>
                </div>
                <div class="form-group col-md-4">
                    <label for="nameId">Imie/nazwisko:</label>
                    <form:input type="text" path="name" id="nameId"/>
                    <form:errors path="name" element="div" cssClass="error"/>
                </div>
                <div class="form-group col-md-4 ">
                    <label for="phoneNumberId">Numer telefonu:</label>
                    <form:input type="tel" path="phoneNumber" pattern="[0-9]{3}-[0-9]{3}-[0-9]{3}" id="phoneNumberId"/>
                    <span class="note">Format: 123-456-789</span>
                    <form:errors path="phoneNumber" element="div" cssClass="error"/>
                </div>
            </div>
            <!-- Button trigger modal -->
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalLong">
                Dodaj rezerwację:
            </button>

            <!-- Modal -->
            <div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLongTitle">Potwierdzenie rezerwacji</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            Czy chcesz zrobic rezerwację?
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Zamknij</button>
                            <button type="submit" class="btn btn-primary">Wyślij</button>
                        </div>
                    </div>
                </div>
            </div>

<%--            <input type="submit" value="Zapisz">--%>
        </div>
        <div class="card-body">
            <a href="/reservation/list" class="btn btn-primary">Powrot</a>
        </div>
    </form:form>

    <%@include file="footer.jspf" %>
</body>
</html>
