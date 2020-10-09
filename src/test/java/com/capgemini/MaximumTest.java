package com.capgemini;
import org.junit.*;
import org.junit.Assert;
public class MaximumTest {
	@Test
	public static void validateMaxMethod_whenGivenThreeIntegers_ShouldReturnMax() {
		String a1 = "Apple", b1 = "Banana", c1 = "Peach";
		Integer a2= 10,b2=20,c2=30;
		Float a3 =(float)10.23,b3=(float)20.23,c3=(float)30.23;
		String d1 = "Peach";
		Integer d2=30;
		Float d3 = (float) 30.23;
		Assert.assertTrue((d1.equals(Maximum.getMax(a1, b1, c1))&&(d2.equals(Maximum.getMax(a2, b2, c2)))
				&&(d3.equals(Maximum.getMax(a3, b3, c3)))));
	} 
}
