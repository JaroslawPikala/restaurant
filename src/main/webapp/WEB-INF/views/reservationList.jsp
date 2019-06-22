<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Rezerwacje:</title>
    <script src="<c:url value="/webjars/jquery/3.0.0/jquery.min.js"/>"></script>
    <script src="<c:url value="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"/>"></script>
    <link href="<c:url value="/webjars/bootstrap/4.3.1/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
    <script>
        function confirmDelete(id, name) {
            if (confirm("Czy chcesz usunac rezerwacje \"" + name + "\"?")) {
                window.location.href = "/panel/delete/" + id;
            }
        }
    </script>
</head>
<body>
<%@include file="/WEB-INF/views/header.jspf" %>

<div class="card mt-4">
    <div class="card-body">
        <table class="table table-hover">
            <tr>
                <th>Imie:</th>
                <th>Numer telefonu:</th>
                <th>Czas rezerwacji:</th>
            </tr>
            <c:forEach items="${reservations}" var="reservation">
                <tr>
                    <td>${reservation.name}</td>
                    <td>${reservation.phoneNumber}</td>
                    <td>${reservation.startDate}</td>
                    <td>
                        <a href="#" onclick="confirmDelete(${reservation.id}, '${reservation.name}')"
                           class="btn btn-danger">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</div>

</body>
</html>
