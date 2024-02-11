package javaStrams;

import java.util.ArrayList;

public class countA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names=new ArrayList();
		names.add("Jivan");
		names.add("abhijit");
		names.add("rahul");
		names.add("sujit");
		names.add("piyush");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=(String) names.get(i);
			if(actual.startsWith("a")) {
				count++;
			}
		
		}
		System.out.println(count);
	}

}
