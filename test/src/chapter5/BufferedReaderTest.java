package chapter5;

import java.io.*;
import java.util.*;

public class BufferedReaderTest { //입력값이 많거나 처리해야 할 값이 많을때 버퍼를 통해 시간을 단축시킨다.

		
	public static void main(String[] args) throws IOException { // 메인메소드에 throws IOException처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //reader 생성 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//writer 생성
		
		String str = br.readLine(); //값 입력받기 = nextLine(); , 무조건 String으로만 받음
		int num = Integer.parseInt(str); // String으로만 받았기에 Integer.parseInt(s타입); 로 int타입 변환
			
		if(num<=1000000 && num>=1) {
			for(int i = 1;i <=num;i++) {
				String str1 = br.readLine(); // 값 읽기. 읽을때 1 3 5 이런식으로 공백 해놓고 계속해서 입력가능
				StringTokenizer st = new StringTokenizer(str1); // 대신 StringTokenizer(s타입)객체 생성해서
				int num1 = Integer.parseInt(st.nextToken()); // 이런식으로 변수마다 값을 저장해줘야함
				int num2 = Integer.parseInt(st.nextToken()); // 방법은 Integer.parseInt(st.nextToken());
					if(num1>=1 && 1000>=num1 && num2>=1 && 1000>=num2) {
							bw.write(num1 + num2+"\n"); //그리고 출력은 write 로 -> 바로 출력 안되고
					}
			}
		}
			bw.flush();	 //flush();를 통해서 출력 
			bw.close(); // 종료. 출력안한 값이 있다면 출력해주면서 종료
	}

}

// 배열의 경우 String s = br.readLine();
//         String[] arr = s.split(" ") -> split()메소드로 공백단위로 분할 후 문자열에 저장
//		int a = Integer.parseInt(arr[0]);
//      int b = Integer.parseInt(arr[1]); 이런식으로 인트타입으로 변환 후 저장

