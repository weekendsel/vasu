package com.vasu.excel;

public class MethodsTest 
{
//
	public void add(int a,int b)
	{
		
		int sum=a+b;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) 
	{
		MethodsTest v=new MethodsTest();
		v.add(10,20);//calling a method with method name //it won't return a value
		/*int res=v.add();//calling a method with variable//it's return a value
		System.out.println(res);*/

	}

}
