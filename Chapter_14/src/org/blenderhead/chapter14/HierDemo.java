package org.blenderhead.chapter14;

//A subclass can add its own type parameters. 
class GenA<T> {  
	T ob; // declare an object of type T  
	 
	// Pass the constructor a reference to   
	// an object of type T.  
	GenA(T o) {  
	 ob = o;  
	}  
	
	// Return ob.  
	T getob() {  
	 return ob;  
	}  
}  

//A subclass of Gen that defines a second 
//type parameter, called V. 
class GenB<T, V> extends GenA<T> { 
	V ob2; 
	
	GenB(T o, V o2) { 
	 super(o); 
	 ob2 = o2; 
	} 
	
	V getob2() { 
	 return ob2; 
	} 
} 

public class HierDemo {

	public static void main(String[] args) {

		// Create a Gen2 object for String and Integer. 
	    GenB<String, Integer> x = new GenB<String, Integer>("Value is: ", 99);  
	 
	    System.out.print(x.getob()); 
	    System.out.println(x.getob2()); 

	}

}
