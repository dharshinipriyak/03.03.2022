package com.string;

public class Example2 {

	public static void main(String[] args) 
	{
		//Using literals
		//if values are same it will allocates in same memory
		String A="Cat";
		String B="Dog";
		String C="Cat";
		System.out.println(A == C);
		
		System.out.println("**********");
				//Using New Keyword
				//if values are same it will allocate in seprate memory
				String S1=new String("Cat");
				String S2=new String("Dog");
				String S3=new String("Cat");
				
				System.out.println(S1 == S3); 

	}

}
