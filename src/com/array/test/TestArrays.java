package com.array.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestArrays extends HttpServlet {
	
	static void findLargest(int[] numbers, PrintWriter out) {
		
		try {
			Arrays.parallelSort(numbers);
			out.println("sort method");
			for( int num : numbers) {
				out.print(" " + num+" " );
			}
			out.print("\n");
			out.println("findLargest: " + numbers[numbers.length - 1]);
//			return numbers[numbers.length - 1];
		  } catch (Exception e) {
		    out.println("Mauvais format");
		  }

	}
	
	public static int calc(int[] array, int n1, int n2, PrintWriter out) {

		out.println("calc method");
		//convert array to list
//		List<Integer> list = new ArrayList<>(); 
		  
        // Iterate through the array 
//        for (Integer t : array) { 
//            // Add each element into the list 
//            list.add(t); 
//            out.println(t);
//        }
        
//		Stream<Integer> stream = list.stream();
//		out.println("forEach method");
//		stream.forEach(out::println);

//		out.println("map method");
//		stream = list.stream();
//		stream.map( x -> x.getClass()).forEach(out::println);
		
		int sum = 0;
		try {
			for(int i = n1; i<=n2; i++) {
				
				sum+=array[i];
			}
			return sum;
		} catch(Exception e) {
			//
			out.println("exception ");
			return 0;

		}
		
	}

	

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		System.out.println("Arrays test");
		PrintWriter out = response.getWriter();
//		out.println("Arrays test doGet arrays send1: ");
//		//entier
		int[] numbers = {4,5,0,1,3};
		for( int num : numbers) {
			out.print(" " + num);
		}
		out.print("\n");
		findLargest(numbers,  out);
		
		//Integer.MIN_VALUE
		int[] min = {Integer.MIN_VALUE};
//		findLargest(min,  out);
		
		//Mauvais format
//		String  str[] = {"poum","papoum","lalère","lala"};
//		findLargest(String.valueOf(str),  out);
		
		out.println("calc test  ,numbers 0,2 resultat:" + calc(numbers,0,2,out));
//		int res3 = calc(numbers,0,2,out);
		out.println("calc test  ,numbers 1,3 resultat:" + calc(numbers,1,3,out));
//		int res3 = calc(numbers,1,3,out);
		out.println("calc test  ,numbers 1,8 resultat:" + calc(numbers,1,8,out));
	}
}