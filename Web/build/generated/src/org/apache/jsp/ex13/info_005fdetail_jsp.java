package org.apache.jsp.ex13;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("         <article>\n");
      out.write("            データ件数：");
      out.print( info.getNum());
      out.write("\n");
      out.write("            <div id=\"map_canvas\" style=\"float:right; width:500px; height: 300px\"></div>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr><th>cam_id</th><th>registration_date</th></tr>\n");
      out.write("                        ");
 for (int i = 0; i < info.getNum(); i++) {
      out.write("\n");
      out.write("                <tr><td><a href=\"/Web/infomation?code=");
      out.print( info.getComid(i));
      out.write('"');
      out.write('>');
      out.print( info.getComid(i));
      out.write("</a></td><td><a href=\"/Web/infomation?code=");
      out.print( info.getDate(i));
      out.write('"');
      out.write('>');
      out.print( info.getDate(i));
      out.write("</a></td></tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("         </article>\n");
      out.write("    </body>\n");
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
