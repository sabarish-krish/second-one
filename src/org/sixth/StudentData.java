package org.sixth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentData {
	
	public static void main(String[] args) {
		
		Students s = new Students();
		s.setId(21);
		s.setName("sabari");
		s.setFee(10000);
		
		Students s1 = new Students();
		s1.setId(22);
		s1.setName("karthi");
		s1.setFee(20000);
		
		Set<Students> j = new HashSet<Students>();		//user defined Set
		j.add(s);
		j.add(s1);
		
		for (Students x : j) {
			
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getFee());
			
		}
		
		Map<Integer, Students> m = new HashMap<Integer, Students>();	//user defined Map
		m.put(1, s);
		m.put(2, s1);
		
		Set<Entry<Integer, Students>> entrySet = m.entrySet();
		for (Entry<Integer, Students> x : entrySet) {
			
			System.out.println(x.getKey());
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getName());
			System.out.println(x.getValue().getFee() );
			
		}
		
		
		
	}

}
