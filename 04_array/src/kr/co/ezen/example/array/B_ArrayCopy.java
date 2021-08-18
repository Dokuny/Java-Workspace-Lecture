package kr.co.ezen.example.array;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만 복사
	// 깊은 복사 : 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사.
	
	public void method1() {
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		
		String str = "";
		
		for(int i = 0; i<originArr.length;i++) {
			copyArr[i]= originArr[i];
		}
		
		System.out.println(originArr);
		System.out.println(copyArr);
	}
	 public void method3() {
		 int[] originArr = {1,2,3,4,5};
			int[] copyArr = new int[10];
			
			//System.arraycopy(원본배열명, 원본에서 복사해올 시작위치,복사배열명,복사배열에 원본에서 복사한걸 붙여넣기 시작할 위치,얼마만큼 복사할건지)
			//Arrays.toString(해당배열명) -> 배열을 스트링값으로 리턴
	 }
}


