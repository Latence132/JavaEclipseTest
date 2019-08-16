package com.rendre.monnaie;

import java.io.PrintWriter;

public class Monnaie {
 public Integer dix = 0;  
 public Integer cinq = 0;
 public Integer deux = 0; 
 
 
 public Monnaie() { }
 
 public Monnaie(Integer change) {
	 

     System.out.println("Change :" + change); 
	 

		 dix = change / 10 ;
		 change = change -  (10 * dix);
	 

		 cinq = change / 5 ;
		 change = change -( cinq * 5);

		 deux = change/2;
		 change = change -( deux * 2);
	 
 }
 
	 public String toString() {
		 return "Dix: " +  dix + " cinq: " + cinq + " deux: " + deux;
	 }

}
