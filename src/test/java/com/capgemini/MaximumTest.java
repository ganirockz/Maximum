package com.capgemini;
import org.junit.*;
import org.junit.Assert;
public class MaximumTest {
	@Test
	public static void validateMaxMethod_whenGivenThreeIntegers_ShouldReturnMax() {
		Maximum m = new Maximum();
		Float a1=(float) 10.23,a2=(float)10.23,a3=(float)30;
		Float b1=(float)20,b2=(float)30,b3=(float)10;
		Float c1=(float)30,c2=(float)20,c3=(float)20;
		Float d = (float)30;
		Assert.assertTrue((d.equals(m.getMax(a1, b1, c1))&&(d.equals(m.getMax(a2, b2, c2)))
				&&(d.equals(m.getMax(a3, b3, c3)))));
	} 
}
