/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-10-27 00:30:08 UTC
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

public final class BIll_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Generate Bill</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"bill.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\">\r\n");
      out.write("    \r\n");
      out.write("	<script src=\"bill.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
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
      out.write("\r\n");
      out.write("<form action=\"sell.jsp\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h3>RAMANA FERTILEZERS</h3>\r\n");
      out.write("    <p>GSTIN : 29ANPPA3453P1ZF</p>\r\n");
      out.write("    <p>Phone : 9902985750</p>	\r\n");
      out.write("    <h3>Invoice</h3>\r\n");
      out.write("    ");

    long millis=System.currentTimeMillis();  
    // creating a new object of the class Date  
    java.sql.Date date = new java.sql.Date(millis);  
    
      out.write("\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td><b>Customer Name </b><input type=\"text\" placeholder=\"Name of the customer\" id=\"c_name\" name=\"c_name\" required=\"required\">\r\n");
      out.write("            </td>\r\n");
      out.write("            <td id=\"date\"><b>Date :</b>");
      out.print(date);
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <h3>Bill Details</h3>\r\n");
      out.write("    <table class=\"o-desc\" id=\"tbody\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th class=\"desc\">Item Name</th>\r\n");
      out.write("            <th class=\"desc\">Price</th>\r\n");
      out.write("            <th class=\"desc\">Quantity</th>\r\n");
      out.write("            <th class=\"desc\">Total</th>\r\n");
      out.write("            <th class=\"desc\"> Delete Item</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td class=\"item\">    <div class=\"form-group\">\r\n");
      out.write("               \r\n");
      out.write("                <select name=\"fname\"  id=\"itemName\" tabindex=\"1\" class=\"form-control\">\r\n");
      out.write("        <option selected=\"selected\" value=\"0\">--Select--</option>\r\n");
      out.write("        ");

        ResultSet rs = DBConnect.dbconnect.getFertilizers();
        //rs.next();
        while(rs.next())
        {
        	if(rs.getInt("qty")>0)
        	{
      out.write("\r\n");
      out.write("        	<option  value= \"");
      out.print(rs.getDouble("price") );
      out.write('"');
      out.write('>');
      out.print(rs.getString("name"));
      out.write("</option>\r\n");
      out.write("        	\r\n");
      out.write("      		");
}
        }
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        </select>\r\n");
      out.write("            </div></td>\r\n");
      out.write("            <td><input type=\"text\" class=\"form-control\" id=\"qty\" placeholder=\"Enter Quantity\" name=\"qty\"></td>\r\n");
      out.write("            <td class=\"btns\"><input type=\"button\" class=\" btn btn-primary\" value=\"Add Item\" onclick=\"getValues()\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <div>\r\n");
      out.write("    <label>Total : </label><input type=\"text\" id =\"sumTotal\" value=0 disabled name=\"amountTotal\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"hide\">\r\n");
      out.write("	    <input type=\"text\" id=\"fertilizers\" name = \"fertilizers\" class=\"totalvalues\">\r\n");
      out.write("	    <input type=\"text\" id=\"quantity\" name = \"quantity\" class=\"totalvalues\">\r\n");
      out.write("	    <input type=\"text\" id=\"price\" name = \"price\" class=\"totalvalues\">\r\n");
      out.write("	</div>\r\n");
      out.write("<div class=\"final\">\r\n");
      out.write("    <input type=\"button\" class=\"btn btn-info\" value=\"Preview Bill\" onclick=\"values()\">\r\n");
      out.write("    <input type=\"submit\" class=\"btn btn-success\" value=\"Print Bill\" >\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
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
