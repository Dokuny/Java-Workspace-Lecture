package kr.co.ezen.variable;

public class E_Printf {
	
	public void printMethod() {
		System.out.println('a');
		
		// c언어식 문자넣기는 "%(서식지정자) ", 넣을 글자  -> 즉 ""안에 그냥 쓸수도 있지만 출력서식을 적용해주기위해 서식지정자를 따옴표안에 넣고 뒤에 넣을 내용을 적는것
		// %[플래그][자리수][.정밀도][서식]
		System.out.printf("%c\n",'a'); //언어의 표준 출력 함수로, 여러 종류의 데이터(data)를 다양한 서식에 맞춰 출력할 수 있게 해준다 \n은 줄바꿈(이스케이프시퀀스중 하나)
		System.out.printf("%c %c\n",'a','b'); //%c는 하나문자
		System.out.printf("%3c %5c",'a','b'); //3c는 3번째 칸 마지막부터 앞쪽으로 작성이 된다.즉 3칸 할당한 것 중에 뒤에서 부터 글자를 채워넣음,자리수 지정해주는거(오른쪽정렬)
		//System.out.println();
		System.out.printf("\n%10s %5d %5d %5d\n", "abc",15,15,15);// %s 는 문자열 %d는 십진수(정수)-> %d = %i 
	                                                              // 따옴표하고 쉼표 후에 나오는 것들을 ""안에 넣어주는거임.
		System.out.printf("표시할 수 있는 글자 : %10s %d %5d %f %10.2f\n","★dsa",53,53,10.95,10.234); // ""안에 넣고싶은것도 넣을 수 있음
	}
	
}
