package org.blenderhead.chapter8;

//A Simple demonstration of abstract.
abstract class M 
{
	abstract void callme();
	
	// concrete methods are still allowed in abstract classes
	void callmetoo() 
	{
		System.out.println("This is a concrete method.");
	}
}

class N extends M 
{
	void callme() 
	{
		System.out.println("N's implementation of callme.");
	}
}

public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		N n = new N();

	    n.callme();
	    n.callmetoo();

	}

}
