package org.apache.jsp.View.Timesheet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.beans.Beans;
import java.util.ArrayList;

public final class Timesheet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/View/Timesheet/../../header.jsp");
    _jspx_dependants.add("/View/Timesheet/../../Footer.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");

            /*if (request.getParameter("redirected") == null) {
            response.sendRedirect("../../TimesheetController?button=get_data");
            }*/



            if (request.getParameter("redirected") == null) {
                response.sendRedirect("../../TimesheetController?button=getdata");

            } else {
                boolean up = false;
                String employeedata = (String) session.getAttribute("EmployeeData");
                List data = (List) session.getAttribute("timesheet");
                //List d1 = (List) data.get(0);
                String button = "submit";
                if (request.getParameter("button") != null) {
                    button = request.getParameter("button");


                    if (button.equals("update_get_data")) {
                        up = true;
                        button = "update";

                    } else if (button.equals("delete_get_data")) {
                        up = true;

                        button = "Delete";
                    }


                }


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--Header File-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<title>PAYROLL MANAGEMENT SYSTEM </title>\n");
String path = request.getContextPath();
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<!-- Viewport metatags -->\n");
      out.write("<meta name=\"HandheldFriendly\" content=\"true\" />\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("\n");
      out.write("<!-- iOS webapp metatags -->\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\n");
      out.write("<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\" />\n");
      out.write("\n");
      out.write("<!-- iOS webapp icons -->\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"touch-icon-iphone.html\" />\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"touch-icon-ipad.html\" />\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"touch-icon-retina.html\" />\n");
      out.write("\n");
      out.write("<!-- CSS Reset -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/reset.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!--  Fluid Grid System -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/fluid.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Login Stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/login.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Theme Stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/dandelion.theme.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!--  Main Stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/dandelion.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Demo Stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/demo.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- jQuery JavaScript File -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- jQuery-UI JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/jui/js/jquery-ui-1.8.20.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/jui/js/jquery.ui.timepicker.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/jui/js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/jui/css/jquery.ui.all.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Plugin Files -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FileInput Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.fileinput.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Placeholder Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.placeholder.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Mousewheel Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.mousewheel.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Scrollbar Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.tinyscrollbar.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Tooltips Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/tipsy/jquery.tipsy-min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/tipsy/tipsy.css\" />\n");
      out.write("\n");
      out.write("<!-- DataTables Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("<!--<script type=\"text/javascript\" src=\"plugins/datatables/jquery.dataTables.min.js\"></script>-->\n");
      out.write("\n");
      out.write("<!--Demo JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.tables.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Demo JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.ui.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Spinner Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/jui/js/jquery.ui.spinner.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Validation Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/validate/jquery.validate.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Statistic Plugin JavaScript Files (requires metadata and excanvas for IE) -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.metadata.js\"></script>\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script type=\"text/javascript\" src=\"js/excanvas.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/plugins/dandelion.circularstat.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Wizard Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/plugins/dandelion.wizard.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Fullcalendar Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/fullcalendar/fullcalendar.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/fullcalendar/gcal.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"../../plugins/fullcalendar/fullcalendar.css\" media=\"screen\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"../../plugins/fullcalendar/fullcalendar.print.css\" media=\"print\" />\n");
      out.write("\n");
      out.write("<!-- Load Google Chart Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    // Load the Visualization API and the piechart package.\n");
      out.write("    google.load('visualization', '1.0', {'packages':['corechart']});\n");
      out.write("</script>\n");
      out.write("<!-- Debounced resize script for preventing to many window.resize events\n");
      out.write("      Recommended for Google Charts to perform optimally when resizing -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.debouncedresize.js\"></script>\n");
      out.write("<!-- Chosen Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/chosen/chosen.jquery.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/chosen/chosen.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Picklist Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/plugins/picklist/jquery.picklist.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/core/plugins/picklist/jquery.picklist.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Colorpicker Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/colorpicker/colorpicker.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/colorpicker/colorpicker.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- elRTE Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/elrte/js/elrte.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/elrte/css/elrte.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- elFinder Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/elfinder/js/elfinder.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/elfinder/css/elfinder.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Demo JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/elastic/jquery.elastic.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.form.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.validation.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/validate/jquery.validate.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Core JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/dandelion.core.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Customizer JavaScript File (remove if not needed) -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/dandelion.customizer.js\"></script>\n");
      out.write("<!-- Demo JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.dashboard.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Core JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/dandelion.core.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Customizer JavaScript File (remove if not needed) -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/dandelion.customizer.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!--<script>\n");
      out.write("        var e = document.getElementById(\"optionid\");\n");
      out.write("        var strUser = e.options[e.selectedIndex].value;\n");
      out.write("        </script>-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Main Menu File -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../mainmenu.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("attendance", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Main Content Wrapper -->\n");
      out.write("        <div id=\"da-content-wrap\" class=\"clearfix\">\n");
      out.write("\n");
      out.write("            <!-- Content Area -->\n");
      out.write("            <div id=\"da-content-area\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"grid_4\">\n");
      out.write("                    <div class=\"da-panel\">\n");
      out.write("                        <div class=\"da-panel-header\"\n");
      out.write("                             <span class=\"da-panel-title\">\n");
      out.write("\n");
      out.write("                               TimeSheet\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"da-panel-content\">\n");
      out.write("                            <form id=\"da-ex-reccuringscheduletemplate\" class=\"da-form\"action=\"../../TimesheetController\" >\n");
      out.write("                                <div id=\"da-ex-val1-error-reccuringscheduletemplate\" class=\"da-message error\" style=\"display:none;\"></div>\n");
      out.write("                                <div class=\"da-form-inline\">\n");
      out.write("\n");
      out.write("                                    <div class=\"da-form-row\">\n");
      out.write("                                        <label>Employees Name</label>\n");
      out.write("                                        <div class=\"da-form-item small\">\n");
      out.write("\n");
      out.write("                                            ");
      out.print( employeedata);
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"da-form-row\">\n");
      out.write("                                        <label>Attendence<span class=\"required\"></span></label>\n");
      out.write("                                        <div class=\"da-form-item large\">\n");
      out.write("                                            <ul class=\"da-form-list\">\n");
      out.write("                                                <li><input type=\"radio\" name=\"checkin\" /> <label>checkin</label></li>\n");
      out.write("                                                <li><input type=\"radio\" name=\"checkout\"  /> <label>checkout</label></li>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <label for=\"gender\" class=\"error\" generated=\"false\" style=\"\"></label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                   \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <input type=\"hidden\" name=\"hidid\" ></input>\n");
      out.write("                                <div class=\"da-button-row\" align=\"center\">\n");
      out.write("                                    <input type=\"reset\" value=\"Reset\" class=\"da-button gray left\" />\n");
      out.write("                                    <input type=\"submit\" name=\"button\" value=\"");
      out.print( button);
      out.write("\" align=\"center\" class=\"da-button green\" />\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"grid_4\">\n");
      out.write("                    <div class=\"da-panel collapsible\">\n");
      out.write("                        <div class=\"da-panel-header\">\n");
      out.write("                            <span class=\"da-panel-title\">\n");
      out.write("                                <img src=\"../../images/icons/black/16/list.png\" alt=\"\" />\n");
      out.write("                                Data Table with Numbered Pagination\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"da-panel-content\">\n");
      out.write("                            <table id=\"da-ex-datatable-numberpaging\" class=\"da-table\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Employee Name</th>\n");
      out.write("                                        <th>In</th>\n");
      out.write("                                        <th>Out</th>\n");
      out.write("                                        <th>TimeStamp</th>\n");
      out.write("                                        <th>Action</th>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        ");


                                                         for (int i = 0; i < data.size(); i++) {
                                                             out.println("<tr>");
                                                             ArrayList temp = (ArrayList) data.get(i);
                                                             for (int j = 1; j < temp.size(); j++) {
                                                                 out.println("<td>" + temp.get(j) + "</td>");

                                                             }


                                                             out.println("<td><a href='../../TimesheetController?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                             out.println("<a href='../../TimesheetController?id=" + temp.get(0) + "&button=delete_data'><img src=../../images/icons/color/cross.png /></a>");
                                                             out.println("</td>");
                                                             out.println("</tr>");
                                                         }
                                        
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("  <!-- Footer -->\n");
      out.write("<div id=\"da-footer\">\n");
      out.write("            <div class=\"da-container clearfix\">\n");
      out.write("                <p> All Rights Reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
}
      out.write('\n');
      out.write('\n');
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
