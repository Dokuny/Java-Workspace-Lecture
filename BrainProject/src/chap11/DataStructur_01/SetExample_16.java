package chap11.DataStructur_01;

import java.util.*;

public class SetExample_16 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("자바");
		set.add("카푸치노");
		set.add("아메리카노");
		set.add("자바");
		
		System.out.println("저장된 데이터 수 : "+ set.size());
		
		for(String b :set) {
			System.out.println(b);
	
	
	}

}
