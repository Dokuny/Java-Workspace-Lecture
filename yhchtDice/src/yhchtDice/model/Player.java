package yhchtDice.model;

import java.util.*;

import yhchtDice.control.*;

public class Player {
	private String name;
	private int subTotal=0;
	public int replaceCount=0;
	public int bonus = 0;
	public ArrayList<Integer> scoreList = new ArrayList<Integer>();
	ArrayList<Integer> diceList = new ArrayList<Integer>();
	ArrayList<Integer> replaceList = new ArrayList<Integer>();

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Player(String name){
		this.name = name;
		for(int i=0;i<12;i++) {
			scoreList.add(0);
		}
	}
	
	public String getName() {
		return name;
	}

	
	//주사위 관련
	public void rollDice() {
		replaceCount=0;
		diceList.clear();
		for(int i=0;i<5;i++) {
			int dice = (int)(Math.random()*6+1);
			diceList.add(dice);	
		}
		
		diceInfo();
		
	}
	
	public void act() {
		System.out.print("입력>");
		int input1 =Controller.sc.nextInt();
		if(input1==1) {
			if(replaceCount==2) {
				System.out.println("-교체를 전부 사용하셨습니다-");
				return;
			}
			
			System.out.println("-교체방법: 교체할 주사위를 번호로 선택 (ex.1 3 4) 선택했으면 9입력-");
			System.out.print("교체할 주사위를 선택해주세요>");
		
			while(Controller.sc.hasNextInt()) {
				int input= Controller.sc.nextInt();
				if(input ==9) {
					break;
				}
				replaceDice(input);
			
			}
			replaceCount++;
			System.out.println();
			diceInfo();
		}else if(input1==2){
			System.out.println("-족보의 번호를 입력해주세요-");
			diceInfo();
			System.out.println();
			System.out.print("입력>");
			int selectNum= Controller.sc.nextInt();
			scoreList.set(selectNum-1,putGenealogy(selectNum));
			replaceCount=3;
			return;
		}
	}
	
	public int total() {
		int sum =0;
		for(int a : scoreList) {
			sum+=a;
		}
		sum+= bonus;
		return sum;
	}
	
	public int inputSubtotal() {
		int sum=0;
		for(int i=0;i<6;i++) {
			sum+=scoreList.get(i);
		}
		setSubTotal(sum);
		return sum;
	}
	public int bonus() {
		if(getSubTotal()>=63) {
			bonus=35;
			return bonus;
		}
		bonus =0;
		return bonus;
	}
	public void replaceDice(int num1) {
		diceList.set(num1-1,(int)(Math.random()*6+1));
	}
	
	public void diceInfo() {
		diceList.sort(Comparator.naturalOrder());
		for(int i=0;i<5;i++) {
			System.out.print("["+diceList.get(i)+"]");
		}
	}
	
	
	public int putGenealogy(int Genealogy) {
		int sum=0;
		if(Genealogy<7) {
			if(diceList.contains(Genealogy)) { 
				return (Collections.frequency(diceList, Genealogy)*Genealogy);
			}else {
				return 0;
			}
		}else if(Genealogy<13){
			switch(Genealogy) {
				case 7:
					for(int a : diceList) {
						sum+= a;
						return sum;
					}
				case 8:
					for(int a : diceList) {
						if(Collections.frequency(diceList, a)>3) {
						sum+= 4*a;
						return sum;
						}
					}
					return 0;
				case 9:
					Set<Integer> set = new HashSet<Integer>(diceList);
					for (Integer a : set) {
						if(Collections.frequency(diceList, a)==5) {
							return 30;
							
						}else if(Collections.frequency(diceList, a)==2) {
							for(Integer b : set) {
								if(Collections.frequency(diceList, b)==3) {
									return 30;
								}
							}
						}
					}
					return 0;
				case 10:
					if(diceList.contains(1)&&diceList.contains(2)&&diceList.contains(3)&&diceList.contains(4)) {
						return 15;
					}else if(diceList.contains(2)&&diceList.contains(3)&&diceList.contains(4)&&diceList.contains(5)) {
						return 15;
					}else {
						return 0;
					}
				case 11:
					if(diceList.contains(1)&&diceList.contains(2)&&diceList.contains(3)&&diceList.contains(4)&&diceList.contains(5)) {
						return 30;
					}
				case 12:
					for (Integer a : diceList) {
						if(Collections.frequency(diceList, a)==5) {
							return 50;	
						}
					}
					return 0;
			}		
		}
		return 0;
	}
	//
}
