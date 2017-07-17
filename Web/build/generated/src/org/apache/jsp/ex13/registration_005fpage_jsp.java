package org.apache.jsp.ex13;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        <section class=\"wrap\">\n");
      out.write("            <header><h1 class=\"title_pos\">空売り残高を知ろう</h1></header>\n");
      out.write("            <nav>\n");
      out.write("                <h2 class=\"title_pos\">メニュー</h2>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"registration_page.jsp\">銘柄登録</a></li>\n");
      out.write("                    <li><a href=\"info_detail.jsp\">登録情報</a></li>\n");
      out.write("                    <li><a href=\"delete.jsp\">登録削除</a></li>\n");
      out.write("                    <li><a href=\"all_page.jsp\">一覧表示</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"wrap2\">\n");
      out.write("            <h2 class=\"title_pos\">銘柄登録</h2>\n");
      out.write("            <article>\n");
      out.write("                <form action=\"code_check.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"mdl-textfield mdl-js-textfield\">\n");
      out.write("                        <input class=\"mdl-textfield__input\" type=\"text\" id=\"boxsize\" size=\"60\" name=\"code\">\n");
      out.write("                        <label class=\"mdl-textfield__label\" for=\"boxsize\">銘柄コード</label>\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect\" type=\"submit\"><i class=\"material-icons\">送信</i></button></br>\n");
      out.write("                </form>\n");
      out.write("            </article>\n");
      out.write("        </section>\n");
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
