package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/quiz")

public class QuizServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+"<head>"
				+ "<title>Quiz</title>"
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
				+ "<body><h2>Gatunki stworzen</h2>"
				+ "<form action='result'>"
				+ "Wybierz moc, ktora chcialbys posiadac? <br><br />"
				+ "<input type='radio' name='power' value='a' checked='checked'/> Umiejetnosc czarowania <br />"
				+ "<input type='radio' name='power' value='c' /> Niesmiertelnosc <br />"
				+ "<input type='radio' name='power' value='b' /> Wyostrzone zmysly <br><br />"
				+ "Wybierz miejsce? <br><br />"
				+ "<input type='radio' name='place' value='b' checked='checked'/> Mroczny las <br />"
				+ "<input type='radio' name='place' value='c' /> Transylwania <br />"
				+ "<input type='radio' name='place' value='a' /> Kraina Oz <br><br />"
				+ "Wybierz kolor? <br><br />"
				+ "<input type='radio' name='color' value='c' checked='checked'/> Czerwony <br />"
				+ "<input type='radio' name='color' value='b' /> Szary <br />"
				+ "<input type='radio' name='color' value='a' /> Zielony <br><br />"
				+ "<input type='submit' value=' OK '>"
				+ "</form>" 
				+ "</body></html>");
		out.close();
		
	}

}