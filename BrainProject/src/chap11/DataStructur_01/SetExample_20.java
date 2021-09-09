package chap11.DataStructur_01;

import java.util.*;

class SimpleNumber{
	int num;
	
	public SimpleNumber(int n) {
		num = n;
	}
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNumber) {
			SimpleNumber sn = (SimpleNumber)obj;
			return sn.num==num;
		}
		return false;
	}
	
	public int hashCode() {
		return num;
	}
	
	public String toString() {
		String.valueOf(num);
		return Integer.toString(num);
	}
}

public class SetExample_20 {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("저장된 데이터 수 :"+hSet.size());
		System.out.println();
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

	
}
