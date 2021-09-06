package silsub1.model.vo;

import java.util.*;

public class Lotto {
	int[] lotto = new int[6];

	{ 
		for(int i=0;i<lotto.length;i++) {
			
			lotto[i] = (int)(Math.random()*45+1);

				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
						i--;
						break;
					}
			}
		}
		Arrays.sort(lotto);
	}
	
	public Lotto(){}

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	public void information() {
		System.out.println(Arrays.toString(lotto));
	}
	
}
