/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-10-26 22:32:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBConnect.dbconnect.*;
import java.sql.*;

public final class reports_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.html", Long.valueOf(1666744508529L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("DBConnect.dbconnect");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("      label{\n");
      out.write("        font-weight: 500;\n");
      out.write("        font-size: 20px;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("    <title>Header</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .head {\r\n");
      out.write("          margin: auto;\r\n");
      out.write("          width: 60%;\r\n");
      out.write("          padding: 10px;\r\n");
      out.write("          align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        a{\r\n");
      out.write("            margin-left: 80px;\r\n");
      out.write("            font-size: 40px;\r\n");
      out.write("        }\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"head\">\r\n");
      out.write("       <center><h1>RAMANA FERTILIZERS</h1></center>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <a href=\"home.jsp\"><i class=\"fa-solid fa-house\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\n');

String from = request.getParameter("from");
String to = request.getParameter("to");
ResultSet pr = DBConnect.dbconnect.productWise(from,to);
ResultSet cstr = DBConnect.dbconnect.customerWise(from, to);

      out.write("\n");
      out.write("  <center><label>From :");
      out.print(from );
      out.write("  To :");
      out.print(to );
      out.write("  </label> </center>\n");
      out.write(" \n");
      out.write("   <div class=\"container\">\n");
      out.write("     <center><h3>Product-wise Transaction Details</center></h3>\n");
      out.write("    <table class=\"table table-striped\">\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th scope=\"col\">Fertilizer</th>\n");
      out.write("            <th scope=\"col\">Date</th>\n");
      out.write("            <th scope=\"col\">Nos</th>\n");
      out.write("            <th scope=\"col\">Price</th>\n");
      out.write("            <th scope=\"col\">Total(Rs)</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("\n");
      out.write("            ");

            double prTotal=0;
       
            
            while(pr.next()){
            	double sum=pr.getInt("qty")*pr.getFloat("sp");
            	prTotal+=sum;
            
      out.write("\n");
      out.write("          <tr>\n");
      out.write("            <td>");
      out.print(pr.getString("fertilizer"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(pr.getDate("s_date") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(pr.getInt("qty"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(pr.getFloat("sp"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(Math.round(sum));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          ");
} 
      out.write("\n");
      out.write("          <tr>\n");
      out.write("          <th>TOTAL</th><th>");
      out.print(Math.round(prTotal) );
      out.write("</th>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("        \n");
      out.write("      </table><br><br>\n");
      out.write("\n");
      out.write("      <center><h3>Customer-wise Transaction Details</center></h3>\n");
      out.write("      <table class=\"table table-striped\">\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"col\">Transaction ID</th>\n");
      out.write("              <th scope=\"col\">Customer Name</th>\n");
      out.write("              <th scope=\"col\">Date</th>\n");
      out.write("              <th scope=\"col\">Total(Rs)</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody>\n");
      out.write("          \n");
      out.write("          ");

          double ctotal=0;
          while(cstr.next()){ 
          ctotal+=cstr.getFloat("total");
          
      out.write("\n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"row\">1</th>\n");
      out.write("              <td>RMNF");
      out.print(cstr.getInt("tid") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print(cstr.getString("c_name") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print(cstr.getDate("t_date") );
      out.write("</td>\n");
      out.write("              <td>");
      out.print(cstr.getFloat("total") );
      out.write("<td>\n");
      out.write("              \n");
      out.write("            </tr>\n");
      out.write("            ");
} 
      out.write("\n");
      out.write("             <tr>\n");
      out.write("          <th>TOTAL</th><th>");
      out.print(Math.round(ctotal) );
      out.write("</th>\n");
      out.write("          </tr>\n");
      out.write("          </tbody>\n");
      out.write("        </table>\n");
      out.write("        <center><button class=\"btn btn-success\" onclick=\"Print()\">Print</button></center>\n");
      out.write("   </div>\n");
      out.write("   <script>\n");
      out.write("     function Print()\n");
      out.write("     {\n");
      out.write("       window.print();\n");
      out.write("     }\n");
      out.write("   </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
