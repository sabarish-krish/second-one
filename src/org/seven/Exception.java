package org.seven;

public class Exception {

	public static void main(String[] args) {
		
		/*int[] x = new int[4];		//ArrayIndexOutOfBoundsException
		x[4] = 20;
		System.out.println(x);*/
		
		/*String s = "Hello";
		char c = s.charAt(5);		//StringIndexOutOfBoundsException
		System.out.println(c);*/
		
		 try  
	        {  
	        int data=50/0; //may throw exception   
	  
	        }  
	            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");          
		
	}
}

