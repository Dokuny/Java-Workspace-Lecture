package kr.co.ezen.practice.dimension;

import java.util.*;

public class Practice {

	public void practice1() {
		String[][] a = new String[3][3];
		
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				a[i][j] ="("+ i +", "+ j + ")";
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] a = new int[4][4];
		
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				a[i][j] = i*a.length + j + 1;
				System.out.print(a[i][j]+" " );
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] a = new int[4][4];
		
		int b = a.length * a[0].length;
		
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				a[i][j] = b--;
				
				System.out.print(a[i][j]+" " );
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		
		int[][] a = new int[4][4];
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			if(i<a.length-1) {
				int sum2=0;
				for(int j =0; j<a[i].length;j++) {
					if(j<a[i].length-1) {
						a[i][j] = (int)(Math.random()*10+1);
						sum2 += a[i][j];	
					}else {
						a[i][j] = sum2;
						sum1 += sum2;
					}	
				}
			}else {
				for(int j = 0; j<a.length;j++) {
					if(j<a.length-1) {
						int sum2 = 0;
						
						for(int k =0; k<a.length-1;k++) {
							sum2 += a[k][j];
							a[i][j] = sum2;
						}
						
						sum1 += sum2;
					}else {
						a[i][j] = sum1;
					}
				}
			}	
			
			for(int j = 0; j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("행크기 : ");
			int line = sc.nextInt();
			
			System.out.print("열크기 : ");
			int	row = sc.nextInt();
			
			if(line<0 || line>11 || row<0|| row>11) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다");
				continue;
			}
			
			char [][] arr = new char[line][row];
			
			//65~90이 영어 대문자
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					arr [i][j] = (char)(int)(Math.random()*26+65);
					System.out.printf("%-2c ",arr[i][j]);
				}
				System.out.println();
			}
			break;
		}
	}
	
	public void practice6() {
		String[][] strArr = new String [][]{{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", "열",
			"니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열","히", "!", "더", "!! "}};
		//5,5배열
			for(int i =0; i<strArr.length; i++) {
				for(int j =0; j<strArr[i].length;j++) {
					System.out.print(strArr[j][i]+" ");
				}
				
			}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int n = sc.nextInt();
		
		int count = 0;
		
		char[][] arr = new char[n][];
		
		for(int i =0;i<arr.length;i++) {
			System.out.printf("%d열의 크기: ",i);
			n = sc.nextInt();
			arr[i] = new char[n];
		}
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j] = (char)('a' + count);
				count++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			}
	}
	
	public void practice8() {
		String[] all = new String[] {"강건강","남나나","도대담", "류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][][] area1 = new String[2][3][2];
		
		int count=0;
		for(int i =0; i<area1.length;i++) {
			System.out.printf("== %d분단 ==\n",i+1);
			for(int j=0;j<area1[i].length;j++) {
				for(int k=0;k<area1[i][j].length;k++) {
					area1[i][j][k] = all[count++];
					System.out.print(area1[i][j][k]+ " ");
				}
				System.out.println();
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] all = new String[] {"강건강","남나나","도대담", "류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][][] area1 = new String[2][3][2];
		
		int count=0;
		for(int i =0; i<area1.length;i++) {
			System.out.printf("== %d분단 ==\n",i+1);
			for(int j=0;j<area1[i].length;j++) {
				for(int k=0;k<area1[i][j].length;k++) {
					area1[i][j][k] = all[count++];
					System.out.print(area1[i][j][k]+ " ");
				}
				System.out.println();
			}
		}
		
		System.out.println("=============================");
		System.out.print("검색할 학생이름을 입력하세요 : ");
		String name = sc.next();

		String a;
		String b;
		
		for(int i =0; i<area1.length;i++) {
			for(int j=0;j<area1[i].length;j++) {
				for(int k=0;k<area1[i][j].length;k++) {
					if(name.equals(area1[i][j][k])) {
						a= k==0? "왼":"오";
						b= j==0? "첫": j==1? "두" :"세";
						System.out.printf("검색하신 %s 학생은 %d분단 %s번째줄 %s쪽에 있습니다.",area1[i][j][k],i+1,b,a);
					}
				}
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 선택하세요.");
		System.out.print("행 크기>");
		int num1 = sc.nextInt();
		System.out.print("열 크기>");
		int num2 = sc.nextInt();
		String[][] strArr = new String[num1+2][num2+2];
		
		for(int i =0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++){
				strArr[i][j]=" ";
				}
			if(i!=0) {
				strArr[0][i] = Integer.toString(i-1);
				strArr[i][0] = Integer.toString(i-1);
			}
		}
		
		System.out.println("X를 표시할 인덱스를 입력해주세요");
		System.out.print("행 인덱스 입력: ");
		int line = sc.nextInt();
		System.out.print("열 인덱스 입력: ");
		int row = sc.nextInt();
		strArr[line+1][row+1] = "X";
		
		for(int i =0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				System.out.printf("%-2s",strArr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 선택하세요.");
		System.out.print("행 크기>");
		int num1 = sc.nextInt();
		System.out.print("열 크기>");
		int num2 = sc.nextInt();
		String[][] strArr = new String[num1+2][num2+2];
		
		for(int i =0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++){
				strArr[i][j]=" ";
				}
			if(i!=0) {
				strArr[0][i] = Integer.toString(i-1);
				strArr[i][0] = Integer.toString(i-1);
			}
		}
		while(true) {
			System.out.println("X를 표시할 인덱스를 입력해주세요");
			System.out.print("행 인덱스 입력: ");
			int line = sc.nextInt();
			if(line==99) {
				System.out.println("프로그램종료");
				break;
			}
			System.out.print("열 인덱스 입력: ");
			int row = sc.nextInt();
			strArr[line+1][row+1] = "X";
		
			for(int i =0;i<strArr.length;i++) {
				for(int j=0;j<strArr[i].length;j++) {
					System.out.printf("%-2s",strArr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
