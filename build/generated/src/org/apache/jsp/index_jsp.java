package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("<title>Curfew E-Pass Travelling System</title>\r\n");
      out.write("<meta content=\"\" name=\"description\">\r\n");
      out.write("<meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("<!-- Favicons -->\r\n");
      out.write("<!-- <link href=\"assets/img/favicon.png\" rel=\"icon\">\r\n");
      out.write("<link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Vendor CSS Files -->\r\n");
      out.write("<link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/icofont/icofont.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/boxicons/css/boxicons.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/venobox/venobox.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assets/vendor/owl.carousel/assets/owl.carousel.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"assets/vendor/bootstrap-datepicker/css/bootstrap-datepicker.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Template Main CSS File -->\r\n");
      out.write("<link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ======= Top Bar ======= -->\r\n");
      out.write("\t<div id=\"topbar\" class=\"d-none d-lg-flex align-items-center fixed-top\">\r\n");
      out.write("\t\t<div class=\"container d-flex\">\r\n");
      out.write("\t\t\t<div class=\"contact-info mr-auto\">\r\n");
      out.write("\t\t\t\t<i class=\"icofont-envelope\"></i> <a href=\"mailto:contact@epass.com\">contact@epass.com</a>\r\n");
      out.write("\t\t\t\t<i class=\"icofont-phone\"></i> 9484798210 <i\r\n");
      out.write("\t\t\t\t\tclass=\"icofont-google-map\"></i> Uttarpradesh, India.\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ======= Header ======= -->\r\n");
      out.write("\t<header id=\"header\" class=\"fixed-top\">\r\n");
      out.write("\t\t<div class=\"container d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h2 class=\"logo mr-auto\">\r\n");
      out.write("\t\t\t\t<a href=\"index.jsp\">E-Pass Travelling System</a>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<!-- Uncomment below if you prefer to use an image logo -->\r\n");
      out.write("\t\t\t<!-- <a href=\"index.html\" class=\"logo mr-auto\"><img src=\"assets/img/logo.png\" alt=\"\" class=\"img-fluid\"></a>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<nav class=\"nav-menu d-none d-lg-block\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#about\">About</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"drop-down\"><a href=\"\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"patient-sign-in.jsp\">Patient Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"admin-login.jsp\">Doctor/Admin Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<!-- .nav-menu -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- ======= Hero Section ======= -->\r\n");
      out.write("\t<section id=\"hero\" class=\"d-flex align-items-center\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<strong><font color=\"white\">Welcome To E-Pass\r\n");
      out.write("\t\t\t\t\t\tTravelling System</font></strong>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- End Hero -->\r\n");
      out.write("\t<main id=\"main\">\r\n");
      out.write("\t\t<!-- ======= Counts Section ======= -->\r\n");
      out.write("\t\t<section id=\"counts\" class=\"counts\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                                            \r\n");
      out.write("\t\t\t\t\t\t");

							int approvedApplications = 0;
							ResultSet resultsetApprovedApplications = DatabaseConnection.getResultFromSqlQuery("Select count(*) from tblpatient where e_pass_status='Approved'");
							resultsetApprovedApplications.next();
							approvedApplications = resultsetApprovedApplications.getInt(1);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"count-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icofont-doctor-alt\"></i> <span data-toggle=\"counter-up\">");
      out.print(approvedApplications );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Approved E-Pass</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6 mt-5 mt-md-0\">\r\n");
      out.write("\t\t\t\t\t\t");

							int rejectedApplications = 0;
							ResultSet resultsetRejectedApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient tp where e_pass_status='Rejected'");
							resultsetRejectedApplications.next();
							rejectedApplications = resultsetRejectedApplications.getInt(1);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"count-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icofont-patient-bed\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"counter-up\">");
      out.print(rejectedApplications );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Rejected E-Pass</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6 mt-5 mt-lg-0\">\r\n");
      out.write("\t\t\t\t\t\t");

							int allApplications = 0;
							ResultSet resultsetApplications = DatabaseConnection.getResultFromSqlQuery("select count(*) from tblpatient");
							resultsetApplications.next();
							allApplications = resultsetApplications.getInt(1);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"count-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icofont-laboratory\"></i> <span data-toggle=\"counter-up\">");
      out.print(allApplications );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Total E-Pass Applications</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6 mt-5 mt-lg-0\">\r\n");
      out.write("\t\t\t\t\t\t");

							int alldoctor = 0;
							ResultSet resultDoctor = DatabaseConnection.getResultFromSqlQuery("select count(*) from tbladmin");
							resultDoctor.next();
							alldoctor = resultDoctor.getInt(1);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"count-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icofont-award\"></i> <span data-toggle=\"counter-up\">");
      out.print(alldoctor);
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Admin/Doctor</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<!-- End Counts Section -->\r\n");
      out.write("\t\t<!-- ======= about Section ======= -->\r\n");
      out.write("\t\t<section id=\"about\" class=\"about\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"section-title\">\r\n");
      out.write("\t\t\t\t\t<h2>About</h2>\r\n");
      out.write("\t\t\t\t\t<p>E-Pass Management system is a web-based technology that will\r\n");
      out.write("\t\t\t\t\t\tmanage the records of pass which issue by administrative. E-Pass\r\n");
      out.write("\t\t\t\t\t\tManagement System is an automatic system that delivers data\r\n");
      out.write("\t\t\t\t\t\tprocessing at a very high speed in a systematic manner.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\tclass=\"col-lg-6 col-md-6 d-flex align-items-stretch mt-4 mt-md-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"icon-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">Patient</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Patient submit his own details and documents for e-pass.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-md-6 d-flex align-items-stretch\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"icon-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"admin-login.jsp\">Admin/Doctor</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Admin can briefly view the total number of category and\r\n");
      out.write("\t\t\t\t\t\t\t\thow many pass will be generated in a day.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<!-- End about Section -->\r\n");
      out.write("\t\t<!-- ======= Contact Section ======= -->\r\n");
      out.write("\t\t<section id=\"contact\" class=\"contact\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"section-title\">\r\n");
      out.write("\t\t\t\t\t<h2>Contact</h2>\r\n");
      out.write("\t\t\t\t\t<p>For more details, Please contact with us.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row mt-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icofont-google-map\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Location:</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Uttarpradesh, India</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icofont-envelope\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Email:</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>info@e-pass.com</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"phone\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icofont-phone\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Call:</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>+91-0000000000</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                    <div class=\"col-lg-8 mt-5 mt-lg-0\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"AddContacts\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Your Name\" data-rule=\"minlen:4\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-msg=\"Please enter at least 4 chars\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"validate\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6 form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"email\" placeholder=\"Your Email\" data-rule=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-msg=\"Please enter a valid email\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"validate\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"subject\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"subject\" placeholder=\"Subject\" data-rule=\"minlen:4\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-msg=\"Please enter at least 8 chars of subject\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"validate\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control\" name=\"message\" rows=\"5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-rule=\"required\" data-msg=\"Please write something for us\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Message\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"validate\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\">Send Message</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<!-- End Contact Section -->\r\n");
      out.write("\r\n");
      out.write("\t</main>\r\n");
      out.write("\t<!-- End #main -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- ======= Footer ======= -->\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\t\t<div class=\"container d-md-flex py-4\">\r\n");
      out.write("\t\t\t<div class=\"mr-md-auto text-center text-md-left\">\r\n");
      out.write("\t\t\t\t<div class=\"copyright\">&copy 2020 E-Pass Travelling System.</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"social-links text-center text-md-right pt-3 pt-md-0\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a> <a\r\n");
      out.write("\t\t\t\t\thref=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a> <a\r\n");
      out.write("\t\t\t\t\thref=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a> <a\r\n");
      out.write("\t\t\t\t\thref=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a> <a\r\n");
      out.write("\t\t\t\t\thref=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"preloader\"></div>\r\n");
      out.write("\t<a href=\"#\" class=\"back-to-top\"><i class=\"icofont-simple-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Vendor JS Files -->\r\n");
      out.write("\t<script src=\"assets/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/vendor/jquery.easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("\t<script src=\"assets/vendor/venobox/venobox.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/vendor/waypoints/jquery.waypoints.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/vendor/counterup/counterup.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/vendor/owl.carousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"assets/vendor/bootstrap-datepicker/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Template Main JS File -->\r\n");
      out.write("\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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