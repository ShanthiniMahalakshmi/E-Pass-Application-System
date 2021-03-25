<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from demo.w3layouts.com/demosWTR/Freedom/19-02-2020/traveling-freedom-demo_Free/1171185230/web/signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 17 Oct 2020 04:37:51 GMT -->
<!-- Added by HTTrack -->
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<!-- /Added by HTTrack -->
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Curfew E-Pass Travelling System</title>
<link rel="stylesheet" href="assets/css/style-freedom.css">
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

	<meta name="robots" content="noindex">
<body>
	<link rel="stylesheet"
		href="../../../../../../images/demobar_w3_4thDec2019.css">

	<div class="w3l-headers-9">
		<header>
			<div class="wrapper">
				<div class="header">
					<div>
						<h1>
							<a href="index.jsp" class="logo">E-Pass Travelling System</a>
							<!-- if logo is image enable this   
						<a class="logo" href="index.html">
							<img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
						</a> -->
						</h1>
					</div>
					<div class="bottom-menu-content">
						<input type="checkbox" id="nav" /> <label for="nav"
							class="menu-bar"></label>
						<nav>
							<ul class="menu">
								<li><a href="index.jsp" class="link-nav">Home</a></li>
								<li><a href="patient-sign-in.jsp" class="link-nav">Patient
										Sign In</a></li>

							</ul>
						</nav>
					</div>
				</div>
			</div>
		</header>
		<!-- //header -->
	</div>
	<!-- form 34-2 -->
	<section class="w3l-form-34-main">
		<div class="w3l-book-9">
			<div class="main-top">
				<div class="wrapper padding-bord">
					<p class="form-para">
						<strong>Create Your Patient Account.</strong>
					</p>
					<%
						String credential = (String) session.getAttribute("credential");
					if (credential != null) {
						session.removeAttribute("credential");
					%>
					<div class="alert alert-info" id="info">
						Your Account Created Successfully. Your Patient Id Is
						<%=session.getAttribute("pid")%></div>
					<%
						}
					%><br><br>
					<form action="PatientAccountRegister" method="post">
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-head">Patient Id</p>
								<input type="text" name="pid" class="input"
									placeholder="Patiet Id" required />
							</div>
							<div class="ele-9its_grid">
								<p class="text-head">Patient Full Name</p>
								<input type="text" name="pname" class="input"
									placeholder="Full Name" required />
							</div>
						</div>
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-head">Email</p>
								<input type="email" name="pemail" class="input"
									placeholder="Your Email" required />
							</div>
							<div class="ele-9its_grid">
								<p class="text-head">Mobile No</p>
								<input type="text" name="pmobile" class="input"
									placeholder="Your Mobile No" required />
							</div>
						</div>
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-head">Disease</p>
								<input type="text" name="disease" class="input"
									placeholder="Your Disease" required />
							</div>
							<div class="ele-9its_grid">
								<p class="text-head">Address</p>
								<input type="text" name="paddress" class="input"
									placeholder="Your Address" required />
							</div>
						</div>
						<div class="d-grid grid-col-2">
							<div class="ele-9its_grid">
								<p class="text-head">User Name</p>
								<input type="text" name="uname" class="input"
									placeholder="User Name" required />
							</div>
							<div class="ele-9its_grid">
								<p class="text-head">Password</p>
								<input type="password" name="upass" class="input"
									placeholder="Password" required />
							</div>
						</div>
						<button type="submit" class="buttonbg signinbutton">Sign
							Up</button>
						<p class="signup">
							Already have an account?<a href="patient-sign-in.jsp"
								class="signuplink">Sign In</a>
						</p>
					</form>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="patient-side-footer.jsp"></jsp:include>
</body>
<script type="text/javascript">
	$(function() {
		$('#info').delay(6000).show().fadeOut('slow');
	});
</script>
</html>