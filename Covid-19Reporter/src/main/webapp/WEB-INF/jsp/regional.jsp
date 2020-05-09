<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="javatime" uri="http://sargue.net/jsptags/time"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Regional Stats</title>
<link href="/css/region.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" />

</head>

<body class="body"><header class="headerB">
<div>
		<h1>
			<span class="flag"><img src="/img/iflag.png" width="70"
				height="60"></span>Italy C<span><img src="/img/Corona.png"
				width="30" height="25"></span>VID-19 Statistic
		</h1>
		</div>
	</header>
	<h2 style="text-align: center;">RegionalData</h2>
	<div class="notification2">
		<h4>Back to National</h4>
		<a href="http://localhost:8080/"><img style="height: 50px"
			alt="Go to regional" src="/img/back.jpg"></a>
	</div>
<div>
	<form:form method="post" action="/reload" modelAttribute="theCity">
		<form:select id="city" path="cityID">
			<c:forEach items="${regional}" var="item">
				<option value="${item.rcode}">${item.rname}</option>	
			</c:forEach>

		</form:select> 
		<input type="submit" id="button" value="View INFO">
	</form:form>
</div>

<article>
<aside class="asi">
	<section >
		<h2>Statistics for ${first.rname} region</h2>
		<div id="piechart"></div>
	</section>
	<section>
		<div id="linechart"></div>
	</section>
	
	</aside></article>
<section class="table">
		<div id="table-display">
			<table>
				<tr>
					<th>Region Code</th>
					<th>Region Name</th>
					<th>Date</th>
					<th>Confirmed Cases</th>
					<th>Recovered</th>
					<th>Deaths</th>
					<th>Hospitalized</th>
					<th>New Cases</th>
				</tr>
				<c:forEach items="${regional}" var="item" varStatus="i">
					<tr>
						<td>${item.rcode}</td>
						<td>${item.rname}</td>
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
	<!--<script type="text/javascript" src="js/region.js"></script>  -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://code.highcharts.com/highcharts.js"></script>
	<script src="https://code.highcharts.com/modules/exporting.js"></script>


	<script type="text/javascript"> 
	
	Highcharts.chart('piechart', {
	    chart: {
	        plotBackgroundColor: null,
	        plotBorderWidth: null,
	        plotShadow: false,
	        type: 'pie',
	        width:'600'
	    },
	    title: {
	        text: ''
	    },
	    tooltip: {
	        pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
	    },
	    accessibility: {
	        point: {
	            valueSuffix: '%'
	        }
	    },
	    plotOptions: {
	        pie: {
	            allowPointSelect: true,
	            cursor: 'pointer',
	            dataLabels: {
	                enabled: true
	            },
	            showInLegend: false
	        }
	    },
	    series: [{
	        name: 'Percentage',
	        colorByPoint: true,
	        data: [{
	            name: 'Total Infected',
	            y: ${first.confirmed_cases},
	            sliced: true,
	            selected: true
	        }, {
	            name: 'Recovered',
	            y: ${first.recovered}
	        }, {
	            name: 'Deaths',
	            y: ${first.deaths}
	        }, {
	            name: 'New Cases',
	            y: ${first.new_cases}
	        }, {
	            name: 'Hospitalised',
	            y: ${first.hospitalized}
	        }]
	    }]
	});
	</script>
</body>
</html>