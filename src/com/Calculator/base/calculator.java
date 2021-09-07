package com.Calculator.base;

public class calculator {
	
	public int sum(int x, int y) {
		return x + y;
		
	}
	
	public int sub(int x, int y) {
		return x - y;
		
	}
	
	public int mult(int x, int y) {
		return x * y;
		
	}
	
	public double div(double x, double y) {
		if(y==0)
		{
			System.out.println("division can not be completed because the denominator is equal zero");
		
		}
		return x / y;
		
	}

}
