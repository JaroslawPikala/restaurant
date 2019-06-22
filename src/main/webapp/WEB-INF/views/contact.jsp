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
    <title>Kontakt:</title>
    <script src="<c:url value="/webjars/jquery/3.0.0/jquery.min.js"/>"></script>
    <script src="<c:url value="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"/>"></script>
    <link href="<c:url value="/webjars/bootstrap/4.3.1/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">
</head>
<style>
    /* Set the size of the div element that contains the map */
    #map {
        height: 300px;  /* The height is 400 pixels */
        width: 100%; /* The width is the width of the web page */
        padding-top: auto;
        top: 508px;
    }
</style>

<body>
<%@include file="/WEB-INF/views/header.jspf" %>

    <h2 class="contact">
        Klimczaka 17<br>
        Wilanów, Warszawa, Poland<br>
        Zadzwoń 574 601 206<br>
        Godziny otwarcia: 7:30 - 18:00<br>
    </h2>
<div id="map" ></div>
<script>
    // Initialize and add the map
    function initMap() {
        // The location of Uluru
        var uluru = {lat: 52.160213, lng: 21.073666};
        // The map, centered at Uluru
        var map = new google.maps.Map(
            document.getElementById('map'), {zoom: 14, center: uluru});
        // The marker, positioned at Uluru
        var marker = new google.maps.Marker({position: uluru, map: map});
    }
</script>
<!--Load the API from the specified URL
* The async attribute allows the browser to render the page while the API loads
* The key parameter will contain your own API key (which is not needed for this tutorial)
* The callback parameter executes the initMap() function
-->
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDAtLvwj_HVpp6UpXZHHXUVwYNAXyikXXw&callback=initMap">
</script>
</body>
</html>
