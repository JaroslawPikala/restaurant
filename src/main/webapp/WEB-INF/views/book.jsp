<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>J:</title>
    <script src="<c:url value="/webjars/jquery/3.0.0/jquery.min.js"/>"></script>
    <script src="<c:url value="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"/>"></script>
    <link href="<c:url value="/webjars/bootstrap/4.3.1/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">

    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>

</head>
<body>
<div class="back">
<%@include file="/WEB-INF/views/header.jspf" %>
<%--<p>--%>
<%--    <p
<%--    --%>
<%--    </p>--%>

<%--<%@include file="/WEB-INF/views/footer.jspf" %>--%>

<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <h3> <a href="https://www.empik.com/jedz-smiej-sie-i-walcz-paszkowski-janek-jedrzejczyk-joanna,p1221126430,ksiazka-p">
                <img src="/resources/img/ksiazka1.jpg" class="rounded float-left" width="350" height="450" ></a></h3>
                <p id="ksiazka"> Najmłodszy uczestnik i wielkie odkrycie pierwszej edycji MasterChefa, Jan Paszkowski – przepisy.
                    Joanna Jędrzejczyk – polska bokserka z międzynarodowymi sukcesami – część motywacyjna.
                    A całość dedykowana mamie Janka, która niedawno przegrała walkę z chorobą.
                    O tym, jak walczyć ze sobą i o siebie i nie dać sobie odebrać radości – w książce tego niecodziennego duetu. A do tego 60 przepisów na kolorowe dania poprawiające humor.</p>
        </div>
        <div class="col-sm-4">
            <h3></h3>
            <p></p>
        </div>
        <div class="col-sm-4">
            <h3><a href="https://www.empik.com/raw-food-czyli-surowa-dieta-opierajaca-sie-na-produktach-nieprzetworzonych-glownie-warzywach-owoca-paszkowski-janek,p1117475448,ksiazka-p">
                <img src="/resources/img/ksiazka2.jpg"  width="300" height="400"></a></h3>
            <p id="ksiazka2">Janek Paszkowski to młody kucharz i pasjonat zdrowego jedzenia, jeden z finalistów polskiej edycji telewizyjnego konkursu „Master Chef”. W jego przepisach widać to, co w ku hni kocha najbardziej: kolory, zabawę smakami i aromatami. Często proponuje zaskakujące połączenia, które okazują się prawdziwym strzałem w dziesiątkę.
                W swojej książce bierze pod nóż kuchnię skomponowaną w większości z surowych warzyw i owoców. Przeprowadza czytelnika przez swój kulinarny świat, który stał się jego receptą na zdrowie, pogodę ducha i dobry humor.</p>
        </div>
    </div>
</div>
</div>
</body>
</html>
