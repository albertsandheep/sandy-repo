package com.sandy.math_utils;

import java.util.Arrays;

public class MyCalculator {

	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}	public int multiply(int a, int b) {
		return a*b;
	}
	public static void main( String[] args )
    {
		System.out.println(Arrays.toString(args));
        MyCalculator calc=new MyCalculator();
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String operation = args[2];
        if(operation.equalsIgnoreCase("sum")){
        	System.out.println("Sum of "+num1+" and "+ num2 +" is "+calc.add(num1, num2)); 
        }
        else if(operation.equalsIgnoreCase("diff")){
        	System.out.println("Difference of "+num1+" and "+ num2 +" is "+calc.subtract(num1, num2)); 
        }
        else {
        	System.out.println("Invalid operation");
        }
        //int a=10;
        //int b=20;
        //System.out.println("addition: "+a+ " + "+ b + "resul="+calc.add(a,b));
        //System.out.println("subtract: "+a+ " - "+ b + "resul="+calc.subtract(a,b));
        //System.out.println("multiply: "+a+ " * "+ b + "resul="+calc.multiply(a,b));
        //int a=args[0].to;
        //int a=args[0];
    }
}
