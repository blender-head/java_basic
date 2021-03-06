package org.blenderhead.chapter8;

//Demonstrate when constructors are called.

//Create a super class.
class E {
	E() { 
		System.out.println("Inside E's constructor.");
	}
}

//Create a subclass by extending class E.
class F extends E {
	F() {
		System.out.println("Inside F's constructor.");
	}
}

//Create another subclass by extending F.
class G extends F {
	G() {
		System.out.println("Inside G's constructor.");
	}
}

public class CallingCons {

	public static void main(String[] args) {

		G g = new G();

	}

}
