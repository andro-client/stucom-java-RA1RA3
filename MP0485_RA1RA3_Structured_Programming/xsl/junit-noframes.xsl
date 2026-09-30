<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                xmlns:str="http://exslt.org/strings" 
                exclude-result-prefixes="str">
	<xsl:output method="html" indent="yes"/>

	<xsl:template match="/">
		<!-- Aggregate Variables -->
		<xsl:variable name="totalTests" select="sum(//testsuite/@tests)"/>
		<xsl:variable name="totalFailures" select="sum(//testsuite/@failures)"/>
		<xsl:variable name="totalErrors" select="sum(//testsuite/@errors)"/>
		<xsl:variable name="totalSkipped" select="sum(//testsuite/@skipped)"/>
		<xsl:variable name="totalPassed" select="$totalTests - $totalFailures - $totalErrors - $totalSkipped"/>
		<html>
			<head>
				<meta charset="UTF-8"/>
				<title>JUnit Test Report</title>
				<style>
          body { font-family: Arial, sans-serif; padding: 2em; background: #f7f7f7; }
          h1 { color: #333; }
          table { border-collapse: collapse; width: 100%; background: white; }
          th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
          th { background-color: #4CAF50; color: white; }
          tr:nth-child(even) { background-color: #f2f2f2; }
          .pass { color: green; }
          .fail { color: red; }

          #chart-container {
            width: 50vw;        /* 50% of viewport width */
            max-width: 400px;   /* max width */
            margin: 2em auto;   /* center horizontally with margin top-bottom */
          }
          #resultChart {
            display: block;
            margin: 0 auto;
            width: 100% !important;   /* fill container width */
            height: auto !important;  /* auto height */
          }
        </style>
				<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
			</head>
			<body>
				<h1>JUnit Test Report Summary</h1>
				<p>
					<strong>Total:</strong> <xsl:value-of select="$totalTests"/> |
					<strong>Passed:</strong> <xsl:value-of select="$totalPassed"/> |
					<strong>Failures:</strong> <xsl:value-of select="$totalFailures"/> |
					<strong>Errors:</strong> <xsl:value-of select="$totalErrors"/> |
					<strong>Skipped:</strong> <xsl:value-of select="$totalSkipped"/>
				</p>

        <div id="chart-container">
          <canvas id="resultChart" width="400" height="400"></canvas>
        </div>

				<table>
					<tr>
					    <th>Package</th>
						<th>Test Suite</th>
						<th>Tests</th>
						<th>Failures</th>
						<th>Errors</th>
						<th>Skipped</th>
						<th>Success Rate</th>
						<th>Time (s)</th>
					</tr>
					<xsl:for-each select="testsuites/testsuite">
						<tr>
						    <td><xsl:value-of select="@package"/></td>
							<td><xsl:value-of select="@name"/></td>
							<td><xsl:value-of select="@tests"/></td>
							<td class="fail"><xsl:value-of select="@failures"/></td>
							<td class="fail"><xsl:value-of select="@errors"/></td>
							<td><xsl:value-of select="@skipped"/></td>
							<td>
								<xsl:variable name="success" select="@tests - @failures - @errors"/>
								<xsl:variable name="rate" select="round(($success div @tests) * 10000) div 100"/>
								<xsl:value-of select="$rate"/>%
							</td>
							<td><xsl:value-of select="@time"/></td>
						</tr>
					</xsl:for-each>
				</table>

				<script type="text/javascript">
          const ctx = document.getElementById('resultChart').getContext('2d');
          const resultChart = new Chart(ctx, {
            type: 'pie',
            data: {
              labels: ['Passed', 'Failures', 'Errors', 'Skipped'],
              datasets: [{
                label: 'Test Results',
                data: [
                  <xsl:value-of select="$totalPassed"/>,
                  <xsl:value-of select="$totalFailures"/>,
                  <xsl:value-of select="$totalErrors"/>,
                  <xsl:value-of select="$totalSkipped"/>
                ],
                backgroundColor: ['#4CAF50', '#f44336', '#ff9800', '#9e9e9e'],
                borderWidth: 1
              }]
            },
            options: {
              responsive: true,
              maintainAspectRatio: true,
              aspectRatio: 1,
              plugins: {
                legend: { position: 'bottom' }
              }
            }
          });
        </script>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
