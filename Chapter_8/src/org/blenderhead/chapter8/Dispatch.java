package org.blenderhead.chapter8;

//Dynamic Method Dispatch
class J {
	void callme() {
		System.out.println("Inside A's callme method");
	}
}

class K extends J {
	// override callme()
	void callme() {
		System.out.println("Inside B's callme method");
	}
}

class L extends K {
	// override callme()
	void callme() {
		System.out.println("Inside C's callme method");
	}
}

public class Dispatch {

	public static void main(String[] args) {

		J j = new J(); // object of type J
	    K k = new K(); // object of type K
	    L l = new L(); // object of type L
	    J r; // obtain a reference of type J    

	    r = j; // r refers to an J object
	    r.callme(); // calls J's version of callme

	    r = k; // r refers to a K object
	    r.callme(); // calls K's version of callme

	    r = l; // r refers to a L object
	    r.callme(); // calls L's version of callme

	}

}
