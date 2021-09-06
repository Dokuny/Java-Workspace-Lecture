package chapter5;

import java.util.*;

public class Main implements Comparable{
	char gender;
	String name;
	
	
	Main(char gender,String name) {
		this.gender =gender;
		this.name = name;		
	}
	
	
	
	
	
	@Override
	public int compareTo(Object arg0) {
		Main a = (Main)arg0;
		
		if(this.gender==a.gender) {
			return 0;
		}else if(this.gender <a.gender) {
			return -1;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Main[] mArr = new Main[] {new Main('M',"도훈"),new Main('W',"지희"),new Main('M',"기종"),new Main('A',"철수")};
		
		Main[] copy = mArr.clone();
		
		Arrays.sort(copy);
		
		for(int i=0;i<mArr.length;i++) {
			System.out.println(mArr[i].name);
		}
		System.out.println();
		for(int i=0;i<mArr.length;i++) {
			System.out.println(copy[i].name);
		}
		
	}
	
}