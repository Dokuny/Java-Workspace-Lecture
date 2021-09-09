package chap11.DataStructur_01;

import java.util.*;

public class PrimitiveCollection_08 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
		
		
	}

	
}
