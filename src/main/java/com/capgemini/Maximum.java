package com.capgemini;

public class Maximum {

	public static void main(String[] args) {
		String a = "Apple", b = "Banana", c = "Peach";
		Maximum max = new Maximum();
		String d = max.getMax(a, b, c);
		System.out.println(d);
	}
	
	public String getMax(String a, String b, String c) {
		String d;
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
