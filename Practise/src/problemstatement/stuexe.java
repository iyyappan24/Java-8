package problemstatement;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class stuexe {

	public int sumScore(List<student> list){
		
		int res = list.stream().filter(e->e.getScore()>70).mapToInt(e->e.getScore()).sum();
		return res;
	}
	
	public List<String> listName(List<student> list){
		
		List<String> names = list.stream().map(e->{
			String fname = e.getFirstName();
			String lname = e.getLastName();
			String re = fname+" "+lname;
			return re;
		}).collect(Collectors.toList());
	   return names;
	
	}
	
	public student highestScore(List<student> list){
		student s =list.stream().max(Comparator.comparingDouble(student::getScore)).map(e->e).get();
		return s;
	}
	
	public List<student> sortBasedOnLastName(List<student> list){
		List<student> lo =list.stream().sorted(Comparator.comparing(student :: getLastName)).map(e->e).collect(Collectors.toList());
		return lo;
	}
	
	public static void main(String[] args){
		
		List<student> lis = new ArrayList<>();
		lis.add(new student("meena","parker",78));
		lis.add(new student("lina","jour",65));
		lis.add(new student("priya","tar",89));
		
		stuexe d = new stuexe();
		int res = d.sumScore(lis);
		System.out.println("sum of students score who scored above 70 :"+res);
		
		
		System.out.println("-----------");
		
		System.out.println("Students' fullname :");
		List<String> names = d.listName(lis);
		names.forEach(e->System.out.println(e));
	
		System.out.println("----------------");
	    System.out.println("student with highesr mark : ");
	    
	    student st = d.highestScore(lis);
	    System.out.println(st);
	
	    System.out.println("-----------");
	    
	    
	    System.out.println("sort based on last name :");
	    List<student> studs = d.sortBasedOnLastName(lis);
	    studs.forEach(e->System.out.println(e));
	    
	    
	    
	}
	
	
}
