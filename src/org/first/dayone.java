package org.first;


public final class dayone {
	
	static int i = 0;				//static variable
	
	  public void apple() {
		  
		  int i = 5;
		  
		  System.out.println(i);

	}
	  	  public static void ball() {
		  
		  i= 10;
		  
		  System.out.println("static method");

		}
	  	  public void cat() {
			
		}
	 public static void main(String [] args) {
		 
		 ball();
		 System.out.println(i);
		
	 }

}