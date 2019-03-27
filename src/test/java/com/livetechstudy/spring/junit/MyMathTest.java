package com.livetechstudy.spring.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest {
	@Test
	public void testSum() {
		MyMath myMath = new MyMath();
		assertEquals(8, myMath.sum(new int[] { 1, 5, 2 }));
	}
}
