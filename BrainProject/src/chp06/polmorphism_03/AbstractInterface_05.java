package chp06.polmorphism_03;

abstract class PersonalNumberStorage{
	public abstract void addPersonalInfo(String name,String perNum);
	public abstract String searchName(String perNum);
}

class PersonalNumInfo{
	String name;
	String number;
	
	PersonalNumInfo(String name,String number){
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
	
}

class PersonalNumberStorageImp1 extends PersonalNumberStorage{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImp1(int sz) {
        perArr = new PersonalNumInfo[sz];
        numOfPerInfo = 0;
    }
	@Override
	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo] = new PersonalNumInfo(name,perNum);
		numOfPerInfo++;
	}

	@Override
	public String searchName(String perNum) {
		for(int i=0; i<numOfPerInfo;i++) {
			if(perNum.equals(perArr[i].getNumber())) {		
				return perArr[i].getName();
			}
		}
		
		return "해당하는 사람이 존재하지 않습니다";
	}
	
}

public class AbstractInterface_05 {

	public static void main(String[] args) {
		PersonalNumberStorage st = new PersonalNumberStorageImp1(100);
		st.addPersonalInfo("김기동", "950000-1122333");
		st.addPersonalInfo("장산길", "970000-1122333");
		
		System.out.println(st.searchName("950000-1122333"));
		System.out.println(st.searchName("960000-1122333"));
		
		
	}

}
