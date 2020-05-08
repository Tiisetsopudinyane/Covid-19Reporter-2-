<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="javatime" uri="http://sargue.net/jsptags/time"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>COVID-19|Home</title>

  
<link href="/css/index.css" rel="stylesheet" type="text/css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" />




</head>
<body class="body">
<div>
	<header class="headerB">
		<h1>
			<span class="flag"><img src="/img/iflag.jpg" width="70"
				height="60"></span>Italy C<span><img src="/img/Corona.png"
				width="30" height="25"></span>VID-19 Statistic
		</h1>
	</header>
	</div>
	<section>
		<div class="notification">
			<h2>National Data</h2>
		</div>
		<div class="notification2">
			 <h4>View Regional Data</h4>
			 <a href="http://localhost:8080/regional"><img style="height: 50px" alt="Go to regional" src="/img/Forward.ico"></a>
		</div>
	</section>
	<section class="sideb">

		<article>
			<aside class="asi">
				<div id="chart1" style="height: 600px"></div>
			</aside>
		</article>
	</section>

	<section>
		<div id="status">
		<c:forEach items="${national}" var="item" varStatus="i">
				<c:set var="countCases" value="${item.confirmed_cases + 1}" scope="page" />
				<c:set var="countRecover" value="${item.recovered + 1}" scope="page" />
				<c:set var="countDeaths" value="${item.deaths + 1}" scope="page" /> 	
		</c:forEach>
			<h2>Confirmed Cases: ${ countCases}</h2>
			<h2>Recovered Cases: ${ countRecover}</h2>
			<h2>Deaths: ${ countDeaths}</h2>
		</div>
		
		<div class="box">
			<img src="/img/coronavirus-ITALY.jpg" width="600px" height="400">
		</div>
	</section>

	<section id="table-display">
	<div>
		<h2 style="margin-left: 150px">Table of Data</h2>
		<table>
			<tr>
				<th>#</th>
				<th>Date</th>
				<th>Confirmed Cases</th>
				<th>Recovered</th>
				<th>Deaths</th>
				<th>Hospitalized</th>
				<th>New Cases</th>
			</tr>
			<c:forEach items="${national}" var="item" varStatus="i">
				<tr>
					<td>${item.id}</td>
					<td>${item.rdate}</td>
					<td>${item.confirmed_cases}</td>
					<td>${item.recovered}</td>
					<td>${item.deaths}</td>
					<td>${item.hospitalized}</td>
					<td>${item.new_cases}</td>
				</tr>
			</c:forEach>
		</table>
		</div>
	</section>

	<footer>
		<p>Italy COVID-19 Stats, &copy:2020</p>
	</footer>

	<script type="text/javascript" src="js/jquery-3.5.0.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<script src="https://code.highcharts.com/modules/exporting.js"></script>
</body>
</html>