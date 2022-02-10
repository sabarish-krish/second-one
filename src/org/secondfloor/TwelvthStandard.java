package org.secondfloor;

import org.first.dayone;

public class TwelvthStandard {			
												
	public void sabarishBabu(){
		//No access to outside package(using private class)
			
		System.out.println("Hi this is sabarish");
	}
	
	public void thinesh(){
		
		//print
		System.out.println("Hi this is thinesh");
	}
	
	public static void main(String[] args) {
		
		TwelvthStandard s = new TwelvthStandard();
		s.sabarishBabu();
		s.thinesh();
		

	}
	
}
