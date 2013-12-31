package org.blenderhead.chapter11;

//Use the built-in enumeration methods. 

//An enumeration of apple varieties. 
enum Apples {  
	Jonathan, GoldenDel, RedDel, Winesap, Cortland 
} 

public class EnumDemo2 {

	public static void main(String[] args) {

		Apples ap; 
		 
	    System.out.println("Here are all Apple constants"); 
	 
	    // use values() 
	    Apples allapples[] = Apples.values(); 
	    for(Apples a : allapples) 
	      System.out.println(a); 
	 
	    System.out.println(); 
	    
	    // use valueOf() 
	    ap = Apples.valueOf("Winesap"); 
	    System.out.println("ap contains " + ap); 

	}

}
