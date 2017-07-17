package org.apache.jsp.ex13;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      ex13.FileDB2 reg = null;
      synchronized (session) {
        reg = (ex13.FileDB2) _jspx_page_context.getAttribute("reg", PageContext.SESSION_SCOPE);
        if (reg == null){
          reg = new ex13.FileDB2();
          _jspx_page_context.setAttribute("reg", reg, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      ex13.GetTag rig = null;
      synchronized (session) {
        rig = (ex13.GetTag) _jspx_page_context.getAttribute("rig", PageContext.SESSION_SCOPE);
        if (rig == null){
          rig = new ex13.GetTag();
          _jspx_page_context.setAttribute("rig", rig, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
 /* エンコード */

    request.setCharacterEncoding("UTF-8");
    /* 変数の宣言　*/
    String code = "";
    String name = "";
    String date = "";
    int code1 = 0;

    /* パラメータの取得 */
    if (request.getParameter("code") != null) {
        code1 = Integer.parseInt(request.getParameter("code"));
        reg.dataload(code1);
    } else if (request.getParameter("name") != null) {
        name = request.getParameter("name");
        reg.dataload(name);
    } else if (request.getParameter("date") != null) {
        date = request.getParameter("date");
        reg.dataload2(date);
    }

    /* データ一覧の取得メソッド */


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
      out.write("    <section class=\"wrap\">\n");
      out.write("        <header><h1 class=\"title_pos\">空売り残高を知ろう</h1></header>\n");
      out.write("        <nav>\n");
      out.write("            <h2 class=\"title_pos\">メニュー</h2>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"registration_page.jsp\">銘柄登録</a></li>\n");
      out.write("                <li><a href=\"code_check.jsp\">登録情報</a></li>\n");
      out.write("                <li><a href=\"delete_check.jsp\">登録削除</a></li>\n");
      out.write("                <li><a href=\"all_check.jsp\">銘柄一覧</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"wrap2\">\n");
      out.write("        <h2 class=\"title_pos\">空売り情報</h2>\n");
      out.write("        <div>データ件数：");
      out.print( reg.getNum());
      out.write("</div>\n");
      out.write("        <article class=\"art_pos\">\n");
      out.write("            <table class=\"mdl-data-table mdl-js-data-table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr class=\"column_pos\">\n");
      out.write("                        <th class=\"mdl-data-table__cell--non-numeric-center\">銘柄コード</th>\n");
      out.write("                        <th>銘柄名</th>\n");
      out.write("                        <th>空売り機関</th>\n");
      out.write("                        <th>空売り残高割合</th>\n");
      out.write("                        <th>空売り残高数</th>\n");
      out.write("                        <th>空売り日</th>\n");
      out.write("                        <th>備考</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody class=\"text_pos2\">\n");
      out.write("                    ");
 for (int i = 0; i < reg.getNum(); i++) {
      out.write("\n");
      out.write("                    <tr class=\"column_pos\"><td><a href=\"/Web/ex13/information.jsp?code=");
      out.print( reg.getCamId(i));
      out.write('"');
      out.write('>');
      out.print( reg.getCamId(i));
      out.write("</a></td>\n");
      out.write("                        <td><a href=\"http://stocks.finance.yahoo.co.jp/stocks/detail/?code=");
      out.print( reg.getCamId(i));
      out.write('"');
      out.write('>');
      out.print( reg.getCamName(i));
      out.write("</a></td>\n");
      out.write("                        <td><div><a href=\"/Web/ex13/information.jsp?name='");
      out.print( reg.getSsCam(i));
      out.write("'\">");
      out.print( reg.getSsCam(i));
      out.write("</a></div></td>\n");
      out.write("                        <td>");
      out.print( reg.getSsRate(i));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( reg.getSsCount(i));
      out.write("</td>\n");
      out.write("                        <td><a href=\"/Web/ex13/information.jsp?date=");
      out.print( reg.getDate(i));
      out.write('"');
      out.write('>');
      out.print( reg.getDate(i));
      out.write("</a></td>   \n");
      out.write("                        <td>");
      out.print( rig.data(reg.getSsCam(i)) );
      out.write("</td ></tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </article>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
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
