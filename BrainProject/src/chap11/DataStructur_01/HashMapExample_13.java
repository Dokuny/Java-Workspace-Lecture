package chap11.DataStructur_01;

import java.util.*;

class Name{
	String firstName;
	String lastName;
	
	Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Name) {
			Name n = (Name)obj;
			return firstName.equals(n.firstName) && lastName.equals(n.lastName);
		}else {
			return false;
		}
		}
	
	
	
	@Override
	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode();
	}
	

}

public class HashMapExample_13 {

	public static void main(String[] args) {
		HashMap<Name,Integer> hashtable = new HashMap<Name,Integer>();
		
		hashtable.put(new Name("해리","포터"), new Integer(95));
		hashtable.put(new Name("해리","포터"), new Integer(95));
		
		System.out.println(hashtable.size());
		
		

	}

}
