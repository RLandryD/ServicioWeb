package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv= \"Content-Type\"\n");
      out.write("\t\t\tcontent = \"text/html; charset = UTF-8\">\n");
      out.write("\t<Title> Conversion grados C <--> F </title>\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body> \n");
      out.write("\t<div align = \"center\">\n");
      out.write("\t<!-- Invocar al servicio web -->\n");
      out.write("        ");

        String sctGrados = request.getParameter("ctGrados");
        if (sctGrados != null && !sctGrados.isEmpty())
        {
           double nGrados = 0.0;
            }
        
      out.write("\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<form style = \"font-familly:arial\">\n");
      out.write("\t\t\tGrados: <br>\n");
      out.write("\t\t<input type = \"text\" name =\"ctGrados\" value =\"$(result)\"\n");
      out.write("\t\t\tstyle = \"text-align:right\" /> <br><br>\n");
      out.write("\n");
      out.write("\t\t<input type = \"submit\" value =\"Convertir\" name =\"btConvertir\" />\n");
      out.write("\t\t<br><br>\n");
      out.write("\n");
      out.write("\t\t<input type = \"radio\" name=\"bgGrados\" value=\"aFahr\" checked=\"true\" />\n");
      out.write("\n");
      out.write("\t\tCentigrados a Fahrenheit <br>\n");
      out.write("\n");
      out.write("\t\t<input type = \"radio\" name = \"bgGrados\" value =\"aCent\" />\n");
      out.write("\n");
      out.write("\t\tFahrenheit a Centigrados <br>\n");
      out.write("\n");
      out.write("\t</form>\n");
      out.write("\t<hr/>\n");
      out.write("\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
