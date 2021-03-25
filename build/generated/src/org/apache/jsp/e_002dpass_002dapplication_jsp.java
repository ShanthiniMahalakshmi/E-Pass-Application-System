package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.*;
import java.sql.*;

public final class e_002dpass_002dapplication_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from p.w3layouts.com/demos/easy_admin_panel/web/tables.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 14 Aug 2020 14:24:15 GMT -->\r\n");
      out.write("<!-- Added by HTTrack -->\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" />\r\n");
      out.write("<!-- /Added by HTTrack -->\r\n");
      out.write("<head>\r\n");
      out.write("<title>Curfew E-Pass Travelling System</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"Easy Admin Panel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Graph CSS -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<!-- lined-icons -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icon-font.min.css\" type='text/css' />\r\n");
      out.write("<!-- //lined-icons -->\r\n");
      out.write("<!-- chart -->\r\n");
      out.write("<script src=\"js/Chart.js\"></script>\r\n");
      out.write("<!-- //chart -->\r\n");
      out.write("<!--animate-->\r\n");
      out.write("<link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\">\r\n");
      out.write("<script src=\"js/wow.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tnew WOW().init();\r\n");
      out.write("</script>\r\n");
      out.write("<!--//end-animate-->\r\n");
      out.write("<!----webfonts--->\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Cabin:400,400italic,500,500italic,600,600italic,700,700italic'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<!---//webfonts--->\r\n");
      out.write("<!-- Meters graphs -->\r\n");
      out.write("<script src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<!-- Placed js at the end of the document so the pages load faster -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"sticky-header left-side-collapsed\" onload=\"initMap()\">\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc='../../../../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>\r\n");
      out.write("\t<script src=\"../../../../m.servedby-buysellads.com/monetization.js\"\r\n");
      out.write("\t\ttype=\"text/javascript\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t(function() {\r\n");
      out.write("\t\t\tif (typeof _bsa !== 'undefined' && _bsa) {\r\n");
      out.write("\t\t\t\t// format, zoneKey, segment:value, options\r\n");
      out.write("\t\t\t\t_bsa.init('flexbar', 'CKYI627U', 'placement:w3layoutscom');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})();\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t(function() {\r\n");
      out.write("\t\t\tif (typeof _bsa !== 'undefined' && _bsa) {\r\n");
      out.write("\t\t\t\t// format, zoneKey, segment:value, options\r\n");
      out.write("\t\t\t\t_bsa.init('fancybar', 'CKYDL2JN', 'placement:demo');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})();\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t(function() {\r\n");
      out.write("\t\t\tif (typeof _bsa !== 'undefined' && _bsa) {\r\n");
      out.write("\t\t\t\t// format, zoneKey, segment:value, options\r\n");
      out.write("\t\t\t\t_bsa.init('stickybox', 'CKYI653J', 'placement:w3layoutscom');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})();\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--<script>(function(v,d,o,ai){ai=d.createElement(\"script\");ai.defer=true;ai.async=true;ai.src=v.location.protocol+o;d.head.appendChild(ai);})(window, document, \"//a.vdo.ai/core/w3layouts_V2/vdo.ai.js?vdo=34\");</script>-->\r\n");
      out.write("\t<div id=\"codefund\">\r\n");
      out.write("\t\t<!-- fallback content -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"https://ethicalads.io/?ref=codefund\" async=\"async\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Global site tag (gtag.js) - Google Analytics -->\r\n");
      out.write("\t<script async\r\n");
      out.write("\t\tsrc='https://www.googletagmanager.com/gtag/js?id=UA-149859901-1'></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\twindow.dataLayer = window.dataLayer || [];\r\n");
      out.write("\t\tfunction gtag() {\r\n");
      out.write("\t\t\tdataLayer.push(arguments);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tgtag('js', new Date());\r\n");
      out.write("\r\n");
      out.write("\t\tgtag('config', 'UA-149859901-1');\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\twindow.ga = window.ga || function() {\r\n");
      out.write("\t\t\t(ga.q = ga.q || []).push(arguments)\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tga.l = +new Date;\r\n");
      out.write("\t\tga('create', 'UA-149859901-1', 'demo.w3layouts.com');\r\n");
      out.write("\t\tga('require', 'eventTracker');\r\n");
      out.write("\t\tga('require', 'outboundLinkTracker');\r\n");
      out.write("\t\tga('require', 'urlChangeTracker');\r\n");
      out.write("\t\tga('send', 'pageview');\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script async src='../../../js/autotrack.js'></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\t<meta name=\"robots\" content=\"noindex\">\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
	
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../../../images/demobar_w3_4thDec2019.css\">\r\n");
      out.write("\t<!-- Demo bar start -->\r\n");
      out.write("\r\n");
      out.write("\t<section>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admin-side-header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- main content start-->\r\n");
      out.write("\t\t<div class=\"main-content main-content4\">\r\n");
      out.write("\t\t\t<!-- header-starts -->\r\n");
      out.write("\t\t\t<div class=\"header-section\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--toggle button start-->\r\n");
      out.write("\t\t\t\t<a class=\"toggle-btn  menu-collapsed\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("\t\t\t\t<!--toggle button end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--notification menu start -->\r\n");
      out.write("\t\t\t\t<div class=\"menu-right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"user-panel-top\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_details_left\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>E-Pass Generation System</span> | <strong> E-Pass\r\n");
      out.write("\t\t\t\t\t\t\t\tApplications</strong>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_details\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown profile_details_drop\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"dropdown-toggle\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"profile_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(session.getAttribute("uname"));
      out.write("<span>Administrator</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"lnr lnr-chevron-down\"></i> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"lnr lnr-chevron-up\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu drp-mnu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"admin-change-own-password.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-cog\"></i> Settings</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"admin-logout.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-sign-out\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--notification menu end -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //header-ends -->\r\n");
      out.write("\t\t\t<div id=\"page-wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"graphs\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"blank1\">E-Pass Applications</h4>\r\n");
      out.write("\t\t\t\t\t");

						String success = (String) session.getAttribute("success");
					if (success != null) {
						session.removeAttribute("success");
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"alert success\" id=\"success\">Your medical\r\n");
      out.write("\t\t\t\t\t\tprescription data matched hence your application have approved.</div>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						String fail = (String) session.getAttribute("fail");
					if (fail != null) {
						session.removeAttribute("fail");
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-danger\" id=\"danger\">Your medical\r\n");
      out.write("\t\t\t\t\t\tprescription data not matched hence your application have\r\n");
      out.write("\t\t\t\t\t\trejected.</div>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"xs tabls\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bs-example4\" data-example-id=\"contextual-table\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Patient Id</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Patient Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Email Id</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Mobile No</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Address</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Disease</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Source</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Destination</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Status</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Action</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									ResultSet resultset = DatabaseConnection
										.getResultFromSqlQuery("select * from tblpatient where e_pass_status='Pending'");
								while (resultset.next()) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">");
      out.print(resultset.getString("patient_id"));
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(resultset.getString("patient_full_name"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(resultset.getString("patient_email"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(resultset.getString("Patient_mobile"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(resultset.getString("patient_address"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(resultset.getString("patient_disease"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(resultset.getString("source_city"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(resultset.getString("destination_city"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><span class=\"label btn_6 label-info\">");
      out.print(resultset.getString("e_pass_status"));
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"check-patient-epass-application.jsp?patientId=");
      out.print(resultset.getString("patient_id"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn_5 btn-lg btn-warning\">Check Application</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--footer section start-->\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t&copy 2020 E-Pass Travelling System.</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t<!--footer section end-->\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");

	} else {
response.sendRedirect("index.jsp");
}

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#success').delay(3000).show().fadeOut('slow');\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#danger').delay(3000).show().fadeOut('slow');\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
