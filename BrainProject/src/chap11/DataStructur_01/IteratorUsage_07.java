package chap11.DataStructur_01;

import java.util.*;

public class IteratorUsage_07 {

	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("First");
	list.add("Second");
	list.add("Third");
	list.add("Fourth");
	Iterator<String> itr = list.iterator();
	System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
	
	while(itr.hasNext()) {
		String curStr = itr.next();
		System.out.println(curStr);
		if(curStr.equals("Third")) {
			itr.remove();
		}
	}
		System.out.println("중간 ");
		
		for(String a : list) {
			System.out.println(a);
		}
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	

}
