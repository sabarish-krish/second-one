package org.three;

public class AxisLocal extends Axis{
	//partial abstract
	@Override
	public void fixedDeposit() {
		
		System.out.println("Fixed Deposit");
		
	}

	@Override
	public void recurringDeposit() {
		
		System.out.println("Recurring Deposit");
		
	}

		public static void main(String[] args) {
			
			AxisLocal j = new AxisLocal();
			j.fixedDeposit();
			j.recurringDeposit();
			j.savingsAcc();
		}
}
