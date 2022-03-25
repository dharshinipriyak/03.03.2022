package com.stringBufferandStringBuilder;

public class Example2 {

	public static void main(String[] args) 
	{
		//String Buffer
		StringBuffer sb=new StringBuffer("Desk");
		System.out.println(sb);
		System.out.println("*********");
		
		//it can be modify
		sb.append("top");
		System.out.println(sb);
	}

}
