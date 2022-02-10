package org.fifth;

public class Control {
	
	public static void main(String[] args) {
		
		String a = "Welcome to SBI Bank";
		
		String a1 = a.substring(15, 19);
		System.out.println(a1);
		
		boolean a2 = a.startsWith("W");
		System.out.println(a2);
		
		boolean a3 = a.endsWith("k");
		System.out.println(a3);
}
	
}
