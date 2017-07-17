package org.apache.jsp.ex13;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      ex13.FileDB info = null;
      synchronized (session) {
        info = (ex13.FileDB) _jspx_page_context.getAttribute("info", PageContext.SESSION_SCOPE);
        if (info == null){
          info = new ex13.FileDB();
          _jspx_page_context.setAttribute("info", info, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>空売り残高を知ろう</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/material.min.css\">\n");
      out.write("        <script src=\"js/material.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.teal-green.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"back\">\n");
      out.write("        <div class=\"pos\">\n");
      out.write("            <!-- Wide card with share menu button -->\n");
      out.write("            <div class=\"demo-card-wide mdl-card mdl-shadow--2dp\">\n");
      out.write("                <div class=\"mdl-card__title\">\n");
      out.write("                    <h2 class=\"mdl-card__title-text\">ようこそ</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-card__supporting-text\">\n");
      out.write("                    個人的な趣味で作りたかったものの実装を目指したもののいろいろな弊害があり普通なものになったHP\n");
      out.write("                    にようこそ\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mdl-card__actions mdl-card--border\">\n");
      out.write("                    <a href=\"registration_page.jsp\" class=\"mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect\">\n");
      out.write("                        メインページへ\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
