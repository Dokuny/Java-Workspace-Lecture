package chap08.basicClass_01;

public class StringExample_01 {

	public static void main(String[] args) {
		String str = "자바 커피";
		int len = str.length();
		
		for(int cnt=0; cnt<len;cnt++) {
			char ch= str.charAt(cnt);
			if(ch!=' ') {
			System.out.println(ch);
			}
			}

	}

}
