package org.three;

public class HDFCLocal implements HDFC,HDFC2 {
	
	//Full Abstraction or Interface
	@Override
	public void withdrawlAmt() {
		
		System.out.println("Withdrawl Amount");
	}

	@Override
	public void currentBal() {
		
		System.out.println("Current Balance");
	}

	public static void main(String[] args) {
		
		HDFCLocal s = new HDFCLocal();
		s.withdrawlAmt();
		
	}
}
