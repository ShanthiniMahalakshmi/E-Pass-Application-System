<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">

<meta http-equiv="content-type" content="text/html;charset=UTF-8" />

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Curfew E-Pass Travelling System</title>
<link rel="stylesheet" href="assets/css/style-freedom.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body>
	<script
		src='../../../../../../../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>
	<script
		src="../../../../../../../m.servedby-buysellads.com/monetization.js"
		type="text/javascript"></script>
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('flexbar', 'CKYI627U', 'placement:w3layoutscom');
			}
		})();
	</script>
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('fancybar', 'CKYDL2JN', 'placement:demo');
			}
		})();
	</script>
	<script>
		(function() {
			if (typeof _bsa !== 'undefined' && _bsa) {
				// format, zoneKey, segment:value, options
				_bsa.init('stickybox', 'CKYI653J', 'placement:w3layoutscom');
			}
		})();
	</script>
	<!--<script>(function(v,d,o,ai){ai=d.createElement("script");ai.defer=true;ai.async=true;ai.src=v.location.protocol+o;d.head.appendChild(ai);})(window, document, "//a.vdo.ai/core/w3layouts_V2/vdo.ai.js?vdo=34");</script>-->
	<div id="codefund">
		<!-- fallback content -->
	</div>
	<script src="https://ethicalads.io/?ref=codefund" async="async"></script>

	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async
		src='https://www.googletagmanager.com/gtag/js?id=UA-149859901-1'></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag() {
			dataLayer.push(arguments);
		}
		gtag('js', new Date());

		gtag('config', 'UA-149859901-1');
	</script>

	<script>
		window.ga = window.ga || function() {
			(ga.q = ga.q || []).push(arguments)
		};
		ga.l = +new Date;
		ga('create', 'UA-149859901-1', 'demo.w3layouts.com');
		ga('require', 'eventTracker');
		ga('require', 'outboundLinkTracker');
		ga('require', 'urlChangeTracker');
		ga('send', 'pageview');
	</script>
	<script async src='../../../../../../js/autotrack.js'></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<meta name="robots" content="noindex">
<body>
	<%
		if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
	%>
	<link rel="stylesheet"
		href="../../../../../../images/demobar_w3_4thDec2019.css">
	<!-- Demo bar start -->
	<div class="w3l-headers-9">
		<jsp:include page="patient-side-header.jsp"></jsp:include>
	</div>
	<section class="w3l-timeline-9">
		<!-- timeline -->
		<div class="quest-wthree py-5">
			<form action="AddPrescription" method="post"
				enctype="multipart/form-data">
				<div class="wrapper py-xl-5 py-lg-3">
					<h3 class="title-main">Apply E-Pass Here</h3>
					<p class="sub-title">Upload Your Medical Prescription For
						E-Pass Here.</p>
						<%
							String message = (String) session.getAttribute("message");
							if (message != null) {
							session.removeAttribute("message");
						%>
						<div class="alert alert-info" id="info">Prescription added successfully.</div>
						<%
							}
						%>
						<%
							String fail = (String) session.getAttribute("fail");
							if (fail != null) {
							session.removeAttribute("fail");
						%>
						<div class="alert alert-danger" id="danger">source and destination city can not be same, please choose different cities.</div>
						<%
							}
						%><br>
					<div class="comments">
						<div class="time-grids">
							<div class="form-group">
								<label for="sel1">Source.:</label> <select class="form-control"
									name="source">
									<option>Select Source City</option>
									<option>Ahmedabad</option>
							                <option>Bengaluru/Bangalore</option>
									<option>Chandigarh</option>
                                                                        <option>Coimbatore</option>
									<option>Chennai</option>
									<option>Delhi</option>
									<option>Gurgaon</option>
									<option>Hyderabad/Secunderabad</option>
									<option>Kolkatta</option>
									<option>Mumbai</option>
                                                                        <option>Noida</option>
									<option>Pune</option>
                                                                        <option>Anantapur</option>
									<option>Guntakal</option>
									<option>Guntur</option>
									<option>Hyderabad/Secunderabad</option>
									<option>kakinada</option>
									<option>kurnool</option>
									<option>Nellore</option>
									<option>Nizamabad</option>
									<option>Rajahmundry</option>
									<option>Tirupati</option>
									<option>Vijayawada</option>
									<option>Visakhapatnam</option>
									<option>Warangal</option>
                                                                        <option>Guwahati</option>
									<option>Silchar</option>
                                                                        <option>Bhagalpur</option>
									<option>Patna</option>
                                                                        <option>Bhillai</option>
									<option>Bilaspur</option>
									<option>Raipur</option>
								</select> <br> <label for="sel1">Destination.:</label> <select
									class="form-control" name="destination">
									<option>Select Destination City</option>
									<option>Ahmedabad</option>
							                <option>Bengaluru/Bangalore</option>
									<option>Chandigarh</option>
									<option>Chennai</option>
									<option>Coimbatore</option>
                                                                        <option>Delhi</option>
									<option>Gurgaon</option>
									<option>Hyderabad/Secunderabad</option>
									<option>Kolkatta</option>
									<option>Mumbai</option>
                                                                        <option>Noida</option>
									<option>Pune</option>
                                                                        <option>Anantapur</option>
									<option>Guntakal</option>
									<option>Guntur</option>
									<option>Hyderabad/Secunderabad</option>
									<option>kakinada</option>
									<option>kurnool</option>
									<option>Nellore</option>
									<option>Nizamabad</option>
									<option>Rajahmundry</option>
									<option>Tirupati</option>
									<option>Vijayawada</option>
									<option>Visakhapatnam</option>
									<option>Warangal</option>
                                                                        <option>Guwahati</option>
									<option>Silchar</option>
                                                                        <option>Bhagalpur</option>
									<option>Patna</option>
                                                                        <option>Bhillai</option>
									<option>Bilaspur</option>
									<option>Raipur</option>
								</select>
							</div>
						</div>
						<h5>Upload Your Medical Prescription</h5>
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<input class="file" name="prescription" type="file"
									placeholder="Choose File" required="">
							</div>
							<br> <input type="submit" class="buttonbg"
								style="width: 120px; height: 42px;" value="Upload">
						</div>
					</div>
				</div>
			</form>
		</div>
		</div>
		<!-- //timeline -->
	</section>
	<jsp:include page="patient-side-footer.jsp"></jsp:include>
	<%
		} else {
	response.sendRedirect("index.jsp");
	}
	%>
</body>
<script type="text/javascript">
	$(function() {
		$('#info').delay(3000).show().fadeOut('slow');
	});
</script>
<script type="text/javascript">
	$(function() {
		$('#danger').delay(3000).show().fadeOut('slow');
	});
</script>
</html>