package org.fourth;

public class ClassC {

	public ClassC() {
		this(1234);
		System.out.println("Super Class Default Constructor");
	}
	
	public ClassC(int id) {
		System.out.println("Super Class Arg based Constructor :"+id);
	}
}
