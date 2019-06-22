<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: jarosaw
  Date: 04.06.19
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>O nas:</title>
    <script src="<c:url value="/webjars/jquery/3.0.0/jquery.min.js"/>"></script>
    <script src="<c:url value="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"/>"></script>
    <link href="<c:url value="/webjars/bootstrap/4.3.1/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">

</head>
<body>
<%@include file="/WEB-INF/views/header.jspf" %>
<div>
    <h3 class="about-us">

        MY: Restauracja J:<br><br>
        Powstaliśmy z potrzeby dzielenia się tym, co kochamy. <br>
        Tym, w co wkładamy 110% naszego serca. <br><br>
        Z dbałością o każdy detal. Od koloru, formy talerza, kształtu filiżanki aż po stopień wypalenia kawy i smak naszych potraw.<br><br>
    Serwujemy Wam nie tylko najlepsze i najbardziej wyjątkowe tosty francuskie z naturalnego, podwójnie maślanego chleba tostowego, ale i całodzienne śniadania, zdrowe dania główne, zupy i niedzielne, uwielbiane przez wszystkich brunche, które leniwie trwają od rana do późnego popołudnia.
    Z miską naszego rosołu.
    </h3>
</div>

</body>
</html>
