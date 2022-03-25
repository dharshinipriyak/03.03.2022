package com.wrapperclass;

public class Example1 
{
	public static void main(String[] args) 
	{
		//AutoBoxing 
		//converting primitive Data Type into object type
		int a=4;
		Integer value=a; 
		System.out.println(value);
		System.out.println("***********");

		//AutoUnboxing
		//Converting Object type into Primitive data type
		Integer Student=new Integer(28);
		int std=Student;
		System.out.println(std);

	}

}
