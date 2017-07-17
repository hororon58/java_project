package org.apache.jsp._12_002d3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      pr12.FileDB file = null;
      synchronized (session) {
        file = (pr12.FileDB) _jspx_page_context.getAttribute("file", PageContext.SESSION_SCOPE);
        if (file == null){
          file = new pr12.FileDB();
          _jspx_page_context.setAttribute("file", file, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./style.css\">\n");
      out.write("        <title>画像の表示</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <h1>画像の表示</h1>\n");
      out.write("        </header>\n");
      out.write("        <article>\n");
      out.write("            データ件数：");
      out.print( file.getNum());
      out.write("\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr><th>ファイル名</th><th>サムネイル</th><th>説明文</th><th>更新日</th></tr>\n");
      out.write("                        ");
 for (int i = 0; i < file.getNum(); i++) {
      out.write("\n");
      out.write("                <tr><td>");
      out.print( file.getName(i));
      out.write("</td><td><img src=\"");
      out.print( "./img/" + file.getName(i));
      out.write("\" alt=\"");
      out.print( file.getName(i));
      out.write("\" width=\"50\"/></td><td>");
      out.print( file.getDescription(i));
      out.write("</td><td>");
      out.print( file.getDate(i));
      out.write("</td></tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </article>\n");
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
