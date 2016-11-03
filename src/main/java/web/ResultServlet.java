package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/result")

public class ResultServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String selectedAnswer = "";
		String creature;
		int result = 0;
		for (String answer : request.getParameterValues("power")) {
			selectedAnswer = answer;
		}
		
		switch(selectedAnswer){
			case "a":
				result = result + 0;
				break;
			case "b":
				result = result + 1;
				break;
			case "c":
				result = result +2;
				break;
		}
		
		for (String answer : request.getParameterValues("place")) {
			selectedAnswer = answer;
		}
		
		switch(selectedAnswer){
			case "a":
				result = result + 0;
				break;
			case "b":
				result = result + 1;
				break;
			case "c":
				result = result +2;
				break;
		}
		
		for (String answer : request.getParameterValues("color")) {
			selectedAnswer = answer;
		}
		
		switch(selectedAnswer){
			case "a":
				result = result + 0;
				break;
			case "b":
				result = result + 1;
				break;
			case "c":
				result = result +2;
				break;
		}
		
		if(result >= 0 && result <= 2){
			creature = "czarodziej";
		}else if(result >= 3 && result <= 4){
			creature = "wilkolak";
		}else{
			creature = "wampir";
		}
		
		out.println("<html>"
				+"<head>"
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
				+ "</style>"
				+ "</head>"
				+ "<body><h2>Wynik quizu</h2>"
				+ "<p>Istota, ktora najbardziej do Ciebie pasuje to: <b><i>" + creature + "</i></b><br><br />" 
				+ "<a href='home.jsp'><input type='button' value='Strona glowna'/></a>"
				+ "</body></html>");
		out.close();
		
	}

}