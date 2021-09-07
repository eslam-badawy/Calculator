package com.Calculator.test;

import com.Calculator.base.calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestCases extends calculator {
	
	
	@Test
	public void sumTest() {
		int a = 4;
		int b = 2;
		int ActualResult = a+b;
		int ExpectedResult = sum(a,b);
		assertEquals(ActualResult, ExpectedResult, "error in sum function");
		
	}
	
	@Test
	public void subTest() {
		int a = 4;
		int b = 2;
		int ActualResult = a-b;
		int ExpectedResult = sub(a,b);
		assertEquals(ActualResult, ExpectedResult, "error in sub function");
		
	}
	
	@Test
	public void multTest() {
		int a = 4;
		int b = 2;
		int ActualResult = a*b;
		int ExpectedResult = mult(a,b);
		assertEquals(ActualResult, ExpectedResult, "error in mult function");
		
	}
	
	@Test
	public void divTest() {
		double a = 4;
		double b = 2;
		double ActualResult = a/b;
		double ExpectedResult = div(a,b);
		assertEquals(ActualResult, ExpectedResult, "error in div function");
		
	}

}
