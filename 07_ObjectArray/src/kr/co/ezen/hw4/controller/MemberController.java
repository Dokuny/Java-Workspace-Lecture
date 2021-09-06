package kr.co.ezen.hw4.controller;

import kr.co.ezen.hw4.model.vo.*;

public class MemberController {
	public static final int SIZE =10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	{
		mem[0]= new Member("user01","pass01","홍길동1",20,'M',"hong123@naver.com");
		mem[1]= new Member("user01","pass01","홍길동1",20,'M',"hong123@naver.com");
		mem[2]= new Member("user01","pass01","홍길동1",20,'M',"hong123@naver.com");
		mem[3]= new Member("user01","pass01","홍길동1",20,'M',"hong123@naver.com");
		mem[4]= new Member("user01","pass01","홍길동1",20,'M',"hong123@naver.com");
		memberCount =5;
	}
	
	public int getMemberCount() {
		return this.memberCount;
	}
	
}
