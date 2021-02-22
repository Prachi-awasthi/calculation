/**
 * 
 */
package com.prachiworkspace;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author prachiawasthi
 *
 */
 class firstclass {
	static Scanner x= new Scanner(System.in);
	static Scanner str= new Scanner(System.in);
	static int n = x.nextInt();
	 String[] itemname= new String[n];
	double[] quantity= new double[n];
	double[] price= new double[n];
static	double[] itemtotal= new double[n];
	firstclass() {
	for(int i=0;i<n;i++)
	{ 
		System.out.println("input name of item" + (i+1) + ":" + "\n");
		System.out.println("itemname:" + "\n");
		itemname[i]=str.nextLine();
		System.out.println("input quantity of item" + (i+1) + ":" + "\n");
		quantity[i]= x.nextDouble();
	
		System.out.println("input price of item" + (i+1) + ":" + "\n");
		price[i]= x.nextDouble();
		if( price[i]< 0) 
	    	 throw new ArithmeticException("price can not be negative." + "\n"); 
			
	System.out.println("itemprice:" + "\n" +	price[i]);
		itemtotal[i]= quantity[i] * price[i];
	 }
	}
	}
 class MyClass extends firstclass{
	private static final String[] itemtype = {"raw", "manufactured", "imported"};
	 static double salestax,total;
	 void tax() {
	for(int j=0;j<n;j++)
	{
		if(itemtype[j].equalsIgnoreCase("raw")) {
			salestax=0.125 * itemtotal[j];
			total=itemtotal[j] + salestax;
			System.out.println("salestax:" + salestax + "\n");
			System.out.println("totalprice:" + total + "\n");
		}
		else if(itemtype[j].equalsIgnoreCase("manufactured")) {
			salestax=0.145 * itemtotal[j];
			total=itemtotal[j] + salestax;
			System.out.println("salestax:" + salestax + "\n");
			System.out.println("totalprice:" + total + "\n");
		}
		else if(itemtype[j].equalsIgnoreCase("imported")) {
			salestax=0.125 * itemtotal[j];
			if(salestax<=100)
			{
			   salestax=salestax + 5;
			   total=itemtotal[j] + salestax;
			   System.out.println("salestax:" + salestax + "\n");
			   System.out.println("totalprice:" + total + "\n");
			}
			else if(salestax<=200) 
			{
				      salestax=salestax + 10;
			        	total=itemtotal[j] + salestax;	
			        	System.out.println("salestax:" + salestax + "\n");
			        	System.out.println("totalprice:" + total + "\n");
	      	}
			else {
				    salestax=salestax + 0.05;
				    total=itemtotal[j] + salestax;	
				    System.out.println("salestax:" + salestax + "\n");
				    System.out.println("totalprice:" + total + "\n");

		       	}
	}
	}
	}
	public static void main(String[] args) {
		MyClass obj= new MyClass();
		obj.tax();
		    }
		    
		  }
 
			   
 
 
		// TODO Auto-generated method stub

