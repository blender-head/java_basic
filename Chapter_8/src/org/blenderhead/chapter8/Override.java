package org.blenderhead.chapter8;

//Method overriding.
class H {
	int i, j;
	
	H(int a, int b) {
		 i = a;
		 j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class I extends H {
	int k;
	
	I(int a, int b, int c) {
		 super(a, b);
		 k = c;
	}
	
	// display k -- this overrides show() in A
	void show() {
		System.out.println("k: " + k);
	}
}

public class Override {

	public static void main(String[] args) {

		I subOb = new I(1, 2, 3);
		subOb.show(); // this calls show() in B

	}

}
