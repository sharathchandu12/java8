package com.epam.java8features;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;
import java.util.List;


public class Java8Lamda {
	public static void main(String avrg[])
	{
		Lamda8javaMethods obj1=new Lamda8javaMethods();
		double avg=obj1.AvgOfListInterger();
		System.out.println("avg="+avg);
		LetterStartsWith_A obj2=new LetterStartsWith_A();
		List<String> list1 =obj2.search();
		
		
		System.out.println("Strings that starts with letter a and have exactly 3 letters="+list1);
		Scanner s=new Scanner(System.in);
		 List<String> words = new ArrayList<String>();
		
		 System.out.println("enter nth value ");
		 String n2;
		 n2=s.nextLine();
		 int n1=Integer.parseInt(n2);
		 System.out.println("enter pallindomes and non pallindromes");
		 for(int i=0;i<n1;i++)
		 {
			 words.add(s.nextLine());
		 }

		 Predicate<String> predicateE = str-> str != null && !str.equals("") ;
		 List<String> listofwords= filterStrings(words,predicateE);
		 System.out.println("elements in the list"+listofwords);

		 List<String> pallindromestrings = filterStrings(words,str->pall(str));
		 System.out.println("pallindrome Strings are :"+pallindromestrings);



		 
	}
	 public static boolean pall(String str)
	 {
	 return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	 }
	
	public static <E> List<E> filterStrings(List<E> list,Predicate<E> predicate)
	 {
	     List<E> result=new ArrayList<>();
	 for(E element:list)
	 if(predicate.test(element))
	 result.add(element);
	 return result;
	 }

}