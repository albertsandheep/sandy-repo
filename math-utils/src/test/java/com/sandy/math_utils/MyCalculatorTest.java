package com.sandy.math_utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class MyCalculatorTest {

	@Test
	void testAdd()
	{
		MyCalculator sc=new MyCalculator();
		assertEquals(21, sc.add(10, 11));
	}
	
	@Test
	void testSub()
	{
		MyCalculator sc=new MyCalculator();
		assertEquals(2, sc.subtract(12, 10));
	}
}
