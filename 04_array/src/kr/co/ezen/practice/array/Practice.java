package kr.co.ezen.practice.array;

import java.util.*;

public class Practice {
	
	public void practice1() {
		int[] a = new int[10];
		
		for(int i=0; i<a.length;i++) {
			a[i] = i+1;
			System.out.print(a[i]+" ");
		}
	}
	
	public void practice2() {
		int[] a = new int[10];
		
		for(int i=0; i<a.length;i++) {
			a[i] = a.length-i;
			System.out.print(a[i]+" ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i <a.length; i++) {
			a[i] = i+1;
			System.out.print(a[i]+" ");
		}
	}
	
	public void practice4() {
		String[] a = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.next();
		}
		
		System.out.println(a[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		System.out.println("문자열 입력");
		String a = sc.next();
		char[] b = a.toCharArray();
		
		System.out.println("검색할 문자입력:");
		char c= sc.next().charAt(0);
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",a,c);
		for(int i=0;i<b.length;i++) {
			if(b[i] == c) {
				System.out.print(i+" ");
				num++;	
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : %d",c,num);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String[] month = {"월","화","수","목","금","토","일"};
		
		System.out.print("0~6사이의 숫자입력 : ");
		int input = sc.nextInt();
		if(input>6 || input<0) {
			System.out.println("잘못 입력하셨습니다");
		}else {
			System.out.println(month[input]+"요일");	
		}
	}
	
	public void pratice7() {
		Scanner sc =new Scanner(System.in);
		System.out.println("정수입력");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();	
		}
		int sum=0;
		for(int i = 0; i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);
		sc.close();
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수:");
			int input = sc.nextInt();
			
			if(input %2 != 0 && input>=3) {
				int[] arr = new int[input];
					
				for(int i=0;i<arr.length;i++) {
					if(i<=arr.length/2) {
						arr[i] = i+1;
						System.out.print(arr[i]+", ");
					}else if(i==arr.length-1){
						arr[i] = arr[i-1]-1;
						System.out.print(arr[i]);
					}else {
						arr[i] = arr[i-1]-1;
						System.out.print(arr[i]+", ");
					}
				}
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] kinds = {"후라이드","양념","간장","갈릭","불닭","뿌링클"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.next();
		
		for(int i = 0; i<kinds.length;i++) {
			if(chicken.equals(kinds[i])) {
				System.out.printf("%s치킨 배달가능",chicken);
				return;
			}
			
		}
		System.out.printf("%s치킨은 없는 메뉴입니다",chicken);
		sc.close();
	}
	
	public void practice10() {
		
		String a = "123456-1234567";
		char[] b = a.toCharArray();
		char[] c = b.clone();
		for(int i = 8; i<c.length;i++) {
			c[i] = '*';
		}
			
		String d = String.valueOf(c);
	
		System.out.println("주민등록번호(-포함) : " + a);
		System.out.printf("%s",d);
	}
	
	public void practice11() {
		int[] a = new int[10];
		for(int i=0; i<a.length;i++) {
			a[i] = (int)(Math.random()*10+1);
			System.out.print(a[i] + " ");
		}
		
	}
	
	public void practice12() {
		int[] a = new int[10];
		for(int i=0; i<a.length;i++) {
			a[i] = (int)(Math.random()*10+1);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int max =0;
		int min = a[0];
		
		for(int i = 0;i <a.length;i++) {
			if(min > a[i]) {
				min = a[i];
			}
			if(max < a[i]) {
				max = a[i];
				}		
		}
		
		System.out.println("최대값 " + max);
		System.out.println("최소값 " + min);
	}
	
	public void practice13() {
		int[] a = new int[10];
		boolean run = true;
		
		while(run) {
			boolean b = false;
			
			for(int i=0; i<a.length;i++) {
				a[i] = (int)(Math.random()*10+1);
			}
			
			for(int i=0;i<a.length-1;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i] == a[j]) {
						b = true;
						break;
					}
				}
			}		
			
			if(b==true) {
				continue;
			}else {
				for(int i = 0;i<a.length;i++) {
					System.out.print(a[i]+" ");
					run = false;
				}	
			}
		}
	}
	
	public void practice14() {
		int[] a = new int[6];
		boolean run = true;
		
		while(run) {
			boolean b = false;
			
			for(int i=0; i<a.length;i++) {
				a[i] = (int)(Math.random()*45+1);
			}
			
			for(int i=0;i<a.length-1;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i] == a[j]) {
						b = true;
						break;
					}
				}
			}		
			
			if(b==true) {
				continue;
			}else {
				Arrays.sort(a);
				for(int i = 0;i<a.length;i++) {
					System.out.print(a[i]+" ");
					run = false;
				}	
			}
		}	
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		char[] a = input.toCharArray();
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i =0;i<a.length; i++) {
			for(int j = i+1; j<a.length;j++) {
				
		}
				
	}
	
	}
	
	public static void test01() {
		Scanner sc = new Scanner(System.in);

        System.out.print("문자열 :");
        String str =sc.next();

        char [] chArr=new char [str.length()];
        chArr[0]=str.charAt(0);
        
        boolean check=false;
        
        int count =1;
       
        for(int i=1;i<str.length();i++) {
            for(int j=0;j<chArr.length;j++) {
                if(str.charAt(i)==chArr[j]) {
                    check=true;
                    break;
                }
            }
            if(!check) {      
                    chArr[count]=str.charAt(i);
                    count++;
            }
            check=false;
        }

        System.out.print("문자열에 있는 문자:");
        for(int i=0;i<chArr.length;i++) {
            System.out.print(chArr[i]);
            
        }
        System.out.println("문자 개수:"+(count));
    }
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int n = sc.nextInt();
		
		String[] strArr = new String[n];
		sc.nextLine();
		
		int sum=n;
		int num =0;
		
		while(true) {
			if(num <sum-1) {	
			System.out.printf("%d번째 문자열 : ",num+1);	
			strArr[num] = sc.nextLine();  
			num++;
			
			}else if(num == sum-1) {
				System.out.printf("%d번째 문자열 : ",num+1);
				strArr[num] = sc.nextLine();
				num++;
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char input = sc.nextLine().charAt(0);
				
				if(input == 'y' || input == 'Y') {
					System.out.print("더 입력하고 싶은 개수 : ");
					int c = sc.nextInt();
					sc.nextLine();
					sum += c;
					
					String[] strArr1 = strArr.clone();
					strArr = new String[sum];
					System.arraycopy(strArr1, 0, strArr, 0, strArr1.length);
				}else {
					System.out.println(Arrays.toString(strArr));
					return;
				}
			}
		}
	}
}
