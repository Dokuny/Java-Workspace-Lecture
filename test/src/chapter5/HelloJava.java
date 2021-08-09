package chapter5;

public class HelloJava {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) { // 이걸 지우면 밑에 system.in.read에서 엔터값\r 과 \n 두개를 인식해버림(두번에 걸쳐)
				System.out.println("--------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------");
				System.out.println("선택: ");
			}
			
			keyCode = System.in.read(); //그래서 저기 앞에다가 if 걸어서 해주던가 저값 2개를 중간에서 받아서 처리해주는 코드를 작성해야함
			//System.in.read();이거를 사용하던가 or 두번
			//System.in.skip(1);를 사용 해야함 -> 이 키보드읽는 변수가 앞에있으면 숫자2 해주면된다.(byte크기)제거해주는 코드임
			if(keyCode == 49) {
				speed++;
				System.out.println("현재속도= "+ speed);
			}else if(keyCode == 50) {
				speed--;
				System.out.println("현재속도= "+ speed);
			}else if(keyCode == 51) {
				run = false;
			}
			
		}
	}

}
