package com.rendre.monnaie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestMonnaie extends HttpServlet {

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("Debut du change");
		
		Monnaie change = new Monnaie();
		out.println("Vide");
		out.println(change.toString());
		
		Monnaie change2 = new Monnaie(10);
		out.println("10");
		out.println(change2.toString());
		
		Monnaie change3 = new Monnaie(48);
		out.println("48");
		out.println(change3.toString());
		
	}

}
