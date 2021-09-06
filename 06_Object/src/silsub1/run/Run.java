package silsub1.run;

import silsub1.model.vo.*;

public class Run {
	
	public static void main(String[] args) {

	Employee person1 = new Employee("황철순","개발",27,'남',3000000,"010-1234-5678","노원구 월계동" );
	Employee person2 = new Employee("자바킹","영업",32,'여',5000000,"010-3923-2423","중랑구 오이동" );
	
	System.out.println(person1.information());
	System.out.println(person2.information());
	
	}

}
