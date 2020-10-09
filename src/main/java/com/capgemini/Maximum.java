package com.capgemini;

public class Maximum {

	public static void main(String[] args) {
		String a1 = "Apple", b1 = "Banana", c1 = "Peach";
		Integer a2= 10,b2=20,c2=30;
		Float a3 =(float)10.23,b3=(float)20.23,c3=(float)30.23;
		Maximum max = new Maximum();
		String d1 = max.getMax(a1, b1, c1);
		Integer d2 = max.getMax(a2, b2, c2);
		Float d3 = max.getMax(a3, b3, c3);
		System.out.println(d1+" "+d2+" "+d3);
		
	}
	
	public <E extends Comparable<E>> E getMax(E a, E b, E c) {
		E d;
		if (a.compareTo(b)>0) {
			if (a.compareTo(c) > 0) {
				d=a;
			} else {
				d=c;
			}
		} else {
			if (b.compareTo(c) > 0) {
				d=b;
			} else {
				d=c;
			}
		}
		return d;
	}

}
