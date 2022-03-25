package com.string;

public class Example1 {

	public static void main(String[] args) {
		//string
		String Name="Java";
		System.out.println(Name);
		System.out.println("***********");
		
		//char sequence
		char ch[]= {'p','r','o','g','r','a','m'};
		System.out.println(ch);
		System.out.println(ch.length);
		System.out.println("***********");
		
		//cannot be modifiable
		String S1="Lap";
		System.out.println(S1);
		S1.concat("top");
		System.out.println(S1);
		System.out.println("**********");
		
		//two ways 1.literals, 2.new keyword
		//literal
		String fname="Arun";
		String lname="Dev";
		System.out.println(fname+" "+lname);
		System.out.println("**********");
		
		//new keyword
		String Firstname= new String("Lap");
		String Lastname= new String("top");
		System.out.println(Firstname+Lastname);
	}
}
