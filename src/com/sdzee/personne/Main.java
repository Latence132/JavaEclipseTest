package com.sdzee.personne;
//Et une classe de test : 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{


				List<Personne> listP = Arrays.asList(
						new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
						new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
						new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
						new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
						new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
						new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
						new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
				);
				PrintWriter out = response.getWriter();
				
				Stream<Personne> sp = listP.stream();
				
				sp.forEach(out::println);
				
				out.println("\nAprès le filtre (poid > 50)");
				sp = listP.stream();
				sp.	filter(x -> x.getPoids() > 50)
					.forEach(out::println);
				
				out.println("\nAprès le filtre (poid > 50) et le map (getPoids())");
				sp = listP.stream();
				sp.	filter(x -> x.getPoids() > 50)
					.map(x -> x.getPoids())
					.forEach(out::println);
				
				out.println("\nAprès le filtre et le map et reduce");
				sp = listP.stream();

				Double sum = sp	.filter(x -> x.getPoids() > 50)
								.map(x -> x.getPoids())
								.reduce(0.0d, (x,y) -> x+y);
				out.println(sum);
				
				out.println("\nAprès map et Collectors.toList()");
				sp = listP.stream();

				List<Double> ld = sp.filter(x -> x.getPoids() > 50)
									.map(x -> x.getPoids())
									.collect(Collectors.toList());
				out.println(ld);

	

	}
}
