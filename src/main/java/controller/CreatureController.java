package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DataStorage;
import model.Creature;

public class CreatureController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static String ADD = "/addCreature.jsp";
    private static String SHOW_ALL = "/showAll.jsp";
    private static String HOME = "/home.jsp";
    private static String EDIT = "/editCreature.jsp";
    private DataStorage db;
    
    public CreatureController() {
        super();
        db = new DataStorage();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String forward="";
        String action = request.getParameter("action");

        if(action.equalsIgnoreCase("home")){
        	forward = HOME;
        	
        } else if (action.equalsIgnoreCase("showAll")){
        	
        	forward = SHOW_ALL;
            request.setAttribute("creatures", db.getAllCreatures());
        
        } else if (action.equalsIgnoreCase("delete")){
        	
            forward = SHOW_ALL;
        	String name = request.getParameter("name");
            db.delete(name);
            request.setAttribute("creatures", db.getAllCreatures());
            
        } else if (action.equalsIgnoreCase("edit")){
        	
                forward = EDIT;
                String name = request.getParameter("name");
                Creature Creature = db.getByName(name);
                request.setAttribute("creature", Creature);
                
        } else {
            forward = ADD;
            
        }

        /*if (action.equalsIgnoreCase("showAll")){
            forward = SHOW_ALL;
            request.setAttribute("creatures", db.getAllCreatures());
        } else {
            forward = ADD;
        }*/

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Creature creature = new Creature();
        creature.setName(request.getParameter("name"));
        creature.setType(request.getParameter("type"));
        creature.setPower(request.getParameter("power"));
        
    	String creatureName = request.getParameter("name");
        
        if(creatureName == null || creatureName.isEmpty()){
        	db.add(creature);
        }else{
        	db.delete(creatureName);
        	db.add(creature);
        }
        
       RequestDispatcher view = request.getRequestDispatcher(SHOW_ALL);
       request.setAttribute("creatures", db.getAllCreatures());
       //request.getRequestDispatcher("showAll.jsp").
       //forward(request, response);
       view.forward(request, response);
    }
}