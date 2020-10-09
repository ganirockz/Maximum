package com.capgemini;

public class Maximum {

	public static void main(String[] args) {
		Integer a = 10, b = 20, c = 30;
		Maximum max = new Maximum();
		Integer d = max.getMax(a, b, c);
		System.out.println(d);
	}
	
	public Integer getMax(Integer a, Integer b, Integer c) {
		Integer d;
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
