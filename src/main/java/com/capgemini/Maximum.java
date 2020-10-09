package com.capgemini;

public class Maximum {

	public static void main(String[] args) {
		Float a = (float) 10.23, b = (float) 20.324, c = (float) 30.324;
		Maximum max = new Maximum();
		Float d = max.getMax(a, b, c);
		System.out.println(d);
	}
	
	public Float getMax(Float a, Float b, Float c) {
		Float d;
		if (a.compareTo(b) > 0) {
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
