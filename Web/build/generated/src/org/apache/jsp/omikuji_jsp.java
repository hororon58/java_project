package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class omikuji_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>戦国IXA</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\">\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <section class=\"kuji_main\">\n");
      out.write("                <h2 class=\"title_small\">戦国IXAくじ</h2>\n");
      out.write("                <div class=\"column_pos\">\n");
      out.write("                    <article class=\"kuji_pos\">\n");
      out.write("                        <form id=\"kuji_ixa\" action=\"omikujiresult_ixa.jsp\" name=\"戦国くじ-戦\" onSubmit=\"return check(name)\">\n");
      out.write("                            <p>戦国くじ-戦</p>\n");
      out.write("                            <input class=\"button_kuji\" type=image src=\"img/kuji_ixa.jpg\" >\n");
      out.write("                        </form>\n");
      out.write("                    </article>\n");
      out.write("                    <article class=\"kuji_pos\">\n");
      out.write("                        <form id=\"kuji_gin\" action=\"omikujiresult_gin.jsp\" name=\"戦国くじ-銀\" onSubmit=\"return check(name)\"> \n");
      out.write("                            <p>戦国くじ-銀</p>\n");
      out.write("                            <input class=\"button_kuji\" type=image src=\"img/kuji_gin.jpg\">\n");
      out.write("                        </form>\n");
      out.write("                    </article>\n");
      out.write("                    <article class=\"kuji_pos\">\n");
      out.write("                        <form id=\"kuji_kin\" action=\"omikujiresult_kin.jsp\" name=\"戦国くじ-金\" onSubmit=\"return check(name)\">\n");
      out.write("                            <p>戦国くじ-金</p>\n");
      out.write("                            <input class=\"button_kuji\" type=image src=\"img/kuji_kin.jpg\">\n");
      out.write("                        </form>\n");
      out.write("                    </article> \n");
      out.write("                </div>\n");
      out.write("                <article class=\"rare\">\n");
      out.write("                    <h2 class=\"title_small\">レアリティ</h2>\n");
      out.write("                    <p class=\"rare_evaluation\">高　← ← ← ←　低</p>\n");
      out.write("                    <img class=\"rare_img\" src=\"img/ten.png\" >\n");
      out.write("                    <img class=\"rare_img\" src=\"img/kiwami.png\" >\n");
      out.write("                    <img class=\"rare_img\" src=\"img/toku.png\" >\n");
      out.write("                    <img class=\"rare_img\" src=\"img/jyou.png\" >\n");
      out.write("                    <img class=\"rare_img\" src=\"img/jyo.png\" >\n");
      out.write("                </article>\n");
      out.write("            </section>\n");
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
