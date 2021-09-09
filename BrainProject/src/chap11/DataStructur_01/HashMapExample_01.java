package chap11.DataStructur_01;

import java.util.*;

public class HashMapExample_01 {

	public static void main(String[] args) {
		HashMap<String,Integer> hashtable = new HashMap<String,Integer>();
		
		hashtable.put("해리", new Integer(95));
		hashtable.put("해르미온느", new Integer(25));
		hashtable.put("해르미온느", new Integer(50));
		hashtable.put("해리포터", new Integer(35));
		hashtable.put("김캐리", new Integer(44));
		hashtable.put("이상해씨", new Integer(52));
		
		Set<String> a = hashtable.keySet();
		Iterator<String> b = a.iterator();
		while(b.hasNext()) {
			String c = b.next();
			hashtable.get(c);
		}
		
		Integer num = hashtable.get("해르미온느");
		System.out.println(num);
	}

}
