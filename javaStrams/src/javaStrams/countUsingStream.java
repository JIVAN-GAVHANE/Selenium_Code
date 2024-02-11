package javaStrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;



public class countUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("jivan");
		names.add("sujit");
		names.add("jignesh");
		names.add("gitesh");
		names.add("rahul");
		
		//there is no life for intermidiate operation if there is no terminal oeration
		//terminal operation execute only if there intermidiate opration(filter retun true)
		//we can create stream
		//flter() operation known as intermideate operation and that arrow is ->lambda expression
		//count() is terminal operation
		
		//style1
		//int counts=(int) names.stream().filter(s->s.startsWith("j")).count();
		
		//style2
		//long d=Stream.of("jivan","sujit","gitesh","rahul").filter(s->s.startsWith("j")).count();
		
		
		//style3
		long d=Stream.of("jivan","rahul","sujit","gitesh").filter(s->{
			s.startsWith("j");
			return true; //retuen all value count
			//return false; return no value count
		}).count();
		System.out.println(d);
		
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.endsWith("h")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.startsWith("j")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//mergining two different list
		List<String> names1=Arrays.asList("ganesh","shiv","maruti","devi","allha");
		Stream<String> newStream =Stream.concat(names1.stream(),names.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("jivan"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		//use of collecor method
		List<String> ls=Stream.of("ganesh","shiv","maruti","devi","allha").filter(s->s.endsWith("h")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		
		//array operations
		List<Integer> numbers=Arrays.asList(3,5,6,5,3,4,8,9);
		List<Integer> numbers2=numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(numbers2.get(2));
		
		
	}

}
