package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/types")

public class TypesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+"<head>"
				+ "<title>Gatunki</title>"
				+ "<style>"
				+ "html,body{"
				+ "margin: 0;"
				+ "text-align: center;"
  				+ "padding: 2em;"
				+ "font-family: Verdana;"
				+ "font-size: 12px;"
				+ "background-color: #D3C9E0;"
				+ "color: #1E0340;"
				+ "}"	
				+ "table{"
				+ "	width: 10%;"
				+ "	margin: 0 auto;"
				+ " border: 1px solid;"
				+ " border-collapse: collapse;"
				+ "}"
				+ "td{"
				+ " border: 1px solid;"
				+ "}"
				+ "</style>"
				+ "</head>"
				+ "<body><h2>Gatunki stworzen</h2>"
				+ "<table> "
				+ "<tbody>"
				+ "<tr><td>wampir</td></tr>"
				+ "<tr><td>wilkolak</td></tr>"
				+ "<tr><td>strzyga</td></tr>"
				+ "<tr><td>mutant</td></tr>"
				+ "<tr><td>czarodziej</td></tr>"
				+ "<tr><td>czarownica</td></tr>"
				+ "<tr><td>wiedzma</td></tr>"
				+ "<tr><td>zombie</td></tr>"
				+ "<tr><td>duch</td></tr>"
				+ "<tr><td>wrozka</td></tr>"
				+ "<tr><td>smok</td></tr>"
				+ "<tr><td>nimfa</td></tr>"
				+ "<tr><td>widmo</td></tr>"
				+ "<tr><td>ogr</td></tr>"
				+ "<tr><td>olbrzym</td></tr>"
				+ "<tr><td>krasnoludek</td></tr>"
				+ "<tr><td>golem</td></tr>"
				+ "<tr><td>gnom</td></tr>"
				+ "<tr><td>elf</td></tr>"
				+ "</tbody>"
				+ "</table>"
				+ "<br><br><p><a href='home.jsp'>Strona glowna</a></p>"
				+ "</body></html>");
		out.close();
		
	}

}