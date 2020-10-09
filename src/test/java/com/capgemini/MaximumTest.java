package com.capgemini;
import org.junit.*;
import org.junit.Assert;
public class MaximumTest {
	@Test
	public static void validateMaxMethod_whenGivenThreeIntegers_ShouldReturnMax() {
		Maximum m = new Maximum();
		String a1 = "Apple", b1 = "Banana", c1 = "Peach";
		String a2 = "Banana", b2 = "Peach", c2 = "Apple";
		String a3 = "Peach", b3 = "Apple", c3 = "Banana";
		String d = "Peach";
		Assert.assertTrue((d.equals(m.getMax(a1, b1, c1))&&(d.equals(m.getMax(a2, b2, c2)))
				&&(d.equals(m.getMax(a3, b3, c3)))));
	} 
}
