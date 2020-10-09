package com.capgemini;
import org.junit.*;
import org.junit.Assert;
public class MaximumTest {
	@Test
	public static void validateMaxMethod_whenGivenThreeIntegers_ShouldReturnMax() {
		Maximum m = new Maximum();
		Integer a1=10,a2=10,a3=30;
		Integer b1=20,b2=30,b3=10;
		Integer c1=30,c2=20,c3=20;
		Integer max = m.getMax(a2, b2, c2);
		Integer d = 30;
		Assert.assertTrue((d.equals(m.getMax(a1, b1, c1))&&(d.equals(max))
				&&(d.equals(m.getMax(a3, b3, c3)))));
	} 
}
