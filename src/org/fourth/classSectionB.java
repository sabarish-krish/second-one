package org.fourth;

public class classSectionB extends ClassSectionA{
		
	@Override
	public void studentName(String name) {

		super.studentName(name);
		System.out.println("This student belongs to ClassB");
	}
	
	public static void main(String[] args) {
		
		classSectionB a = new classSectionB();		
		a.studentName("sabarish");
	}

}
