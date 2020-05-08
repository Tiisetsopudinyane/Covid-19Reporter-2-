$( document ).ready(function() {	

	$.ajax({
		
		url : "/drawchart",
		success : function(results) {
			var newCases = JSON.parse(results).newCases;
			var reportDate = JSON.parse(results).reportDate;
				drawLineChart(newCases, reportDate);
		}
		
	});


	function drawLineChart(newCases,reportDate){
	
		Highcharts.chart('chart1',{
			chart:{
				type:'line',
				width:'600'
			},
			title:{
				text:"Line Graph of New Cases"
			},
			 subtitle: {
			        text: 'Reported on daily basis'
			    },
			
			xAxis:{
				categories:reportDate
			},
		    yAxis: {
		        title: {
		            text: 'Number of Cases'
		        }
		    },
			tooltip:{
				formatter: function(){
					
					return '<strong>'+this.x +': </strong>'+this.y;
				}
			},
			series:[{
				name: 'National',
				data: newCases
			}]	
		});
		
	}
	
});
