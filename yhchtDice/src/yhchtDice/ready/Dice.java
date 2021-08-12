package yhchtDice.ready;

public class Dice {

	int dice1; 
	int dice2;
	int dice3; 
	int dice4;
	int dice5;
	
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	
	
	
	public void roll() {
		
		dice1 = (int)(Math.random()*6)+1;
		dice2 = (int)(Math.random()*6)+1;
		dice3 = (int)(Math.random()*6)+1;
		dice4 = (int)(Math.random()*6)+1;
		dice5 = (int)(Math.random()*6)+1;
		
		int[] diceArray = {dice1,dice2,dice3,dice4,dice5};
		
		System.out.printf("[%d]  [%d]  [%d]  [%d]  [%d]",dice1,dice2,dice3,dice4,dice5);
		
		num1 = diceArray[0];
		num2 = diceArray[1];
		num3 = diceArray[2];
		num4 = diceArray[3];
		num5 = diceArray[4];

	}
}
