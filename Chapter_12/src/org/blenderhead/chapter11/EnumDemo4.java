package org.blenderhead.chapter11;

//Demonstrate ordinal(), compareTo(), and equals(). 

//An enumeration of apple varieties. 
enum Apple3 {  
	Jonathan, GoldenDel, RedDel, Winesap, Cortland 
} 

public class EnumDemo4 {

	public static void main(String[] args) {

		Apple3 ap, ap2, ap3; 
		 
	    // Obtain all ordinal values using ordinal(). 
	    System.out.println("Here are all apple constants" + 
	                       " and their ordinal values: "); 
	    for(Apple3 a : Apple3.values()) 
	      System.out.println(a + " " + a.ordinal()); 
	 
	    ap =  Apple3.RedDel; 
	    ap2 = Apple3.GoldenDel; 
	    ap3 = Apple3.RedDel; 
	 
	    System.out.println(); 
	 
	    // Demonstrate compareTo() and equals() 
	    if(ap.compareTo(ap2) < 0) 
	      System.out.println(ap + " comes before " + ap2); 
	 
	    if(ap.compareTo(ap2) > 0) 
	      System.out.println(ap2 + " comes before " + ap); 
	 
	    if(ap.compareTo(ap3) == 0) 
	      System.out.println(ap + " equals " + ap3); 
	   
	    System.out.println(); 
	 
	    if(ap.equals(ap2)) 
	      System.out.println("Error!"); 
	 
	    if(ap.equals(ap3)) 
	      System.out.println(ap + " equals " + ap3); 
	 
	    if(ap == ap3) 
	      System.out.println(ap + " == " + ap3); 

	}

}
