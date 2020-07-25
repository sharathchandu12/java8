package com.epam.java8features;

import java.util.stream.Collectors;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;

public class Lamda8javaMethods {
	
	Scanner s=new Scanner(System.in);
	
	double AvgOfListInterger()
	{
		
		System.out.println("enter nth value");
		int n=s.nextInt();
		List<Integer> ele = new ArrayList<Integer>();
		
		System.out.println("enter integers to add them into list");

       for(int i=0;i<n;i++)
			
		{
			ele.add(s.nextInt());
			
		}
		
		System.out.println("\bnumbers in the list are ="+ele);
		IntSummaryStatistics crunchifyStats = ele.stream().mapToInt((x) -> x).summaryStatistics();
		 return(crunchifyStats.getAverage());
		}
		}

	 class LetterStartsWith_A extends Lamda8javaMethods 
	{
	 List<String> search() {
		 
		 System.out.println("enter nth value");
		 String n2;
		 n2=s.nextLine();
		 int n1=Integer.parseInt(n2);
		 
		 List<String> list = new ArrayList<String>();
		 System.out.println("enter string elements to be scan");
		 for(int i=0;i<n1;i++)
			{
				list.add(s.nextLine());
				
			}
		 System.out.println("elements in list are ="+list);
		
		return(list.stream().filter(x -> x.startsWith("a"))
				  .filter(x -> x.length() == 3)
				  .collect(Collectors.toList()));
		 
	 }
	}