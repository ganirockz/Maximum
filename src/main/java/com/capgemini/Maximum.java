package com.capgemini;

public class Maximum <E extends Comparable<E>>{
	E x,y,z;
	public Maximum(E x,E y,E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static void main(String[] args) {
		String a1 = "Apple", b1 = "Banana", c1 = "Peach";
		Integer a2= 10,b2=20,c2=30;
		Float a3 =(float)10.23,b3=(float)20.23,c3=(float)30.23;
		new Maximum(a1,b1,c1).maximum();
		new Maximum(a2,b2,c2).maximum();
		new Maximum(a3,b3,c3).maximum();
	}
	public E maximum() {
		return  Maximum.getMax(x,y,z);
	}
	public static <E extends Comparable<E>> E getMax(E a, E b, E c) {
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
		printMax(a,b,c,d);
		return d;
	}
	public static <E> void printMax(E x,E y,E z,E max) {
		System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
	}

}
