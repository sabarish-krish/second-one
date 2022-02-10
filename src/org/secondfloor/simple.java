package org.secondfloor;

import org.first.dayone;

public class simple {
			//global variable
			int id1;
			String name1;
			char ch;
	
		public void studentName(){
			
			String name = "sabarish";
			int id = 4552;
			long ph = 9047152312l;
			String mail = "sabarish97@gmail.com";
			float yfee = 1000;
			double cfee = 500000;
			char gender = 'M';
			boolean alive = true;
			
			System.out.println("Name"+"        "+"ID"+"         "+"mobile");
			System.out.println(name+"    "+id+"     "+ph);
		}
		public static void main(String[] args) {
		simple j = new simple();
		j.studentName();
	
		dayone.ball();
	}
	
}
