package problemstatement;

import java.util.Comparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.function.*;

public class map {
	
	public static void main(String[] args){
		
		Map<employee,String> mp = new TreeMap<>(new Comparator<employee>(){
			public int compare(employee e1,employee e2){
				return e1.getName().compareTo(e2.getName());
			}
		});
    	mp.put(new employee(2,"loki",6000.0f,"banglore",6), "redmi");
		mp.put(new employee(3,"joni",8000.0f,"banglore",23), "huwai");
		mp.put(new employee(4,"lok",3000.0f,"banglore",12),"sony");
		mp.put(new employee(2,"poki",3000.0f,"hyderabad",34), "sony");
		Set<Map.Entry<employee,String>> m = mp.entrySet();
		
		for(Map.Entry<employee,String> mk : m){
			System.out.println(mk.getKey().getName() +" has "+mk.getValue());
		}
		
		System.out.println("--------------------");
		
		Map<String,employee> ml = mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparingDouble(employee :: getSalary))).map(e->e.getKey()).collect(Collectors.toMap(employee::getLocation,Function.identity(),(a,b)->a));
		ml.entrySet().stream().map(e->e.getValue().getName()+" from "+ e.getValue().getLocation()).forEach(System.out::println);
		
		System.out.println("--------------------");
		
		Map<String,Long> lk = mp.entrySet().stream().map(e->e.getKey()).collect(Collectors.groupingBy(employee::getLocation,Collectors.counting()));
		Long kh = lk.entrySet().stream().filter(e->{
			String df = e.getKey();
			if(df.equalsIgnoreCase("banglore")){
				return true;
			}
			else{
				return false;
			}
		}).map(e->e.getValue()).findFirst().get();
		
		
		System.out.println(kh+" from Banglore");
		
		System.out.println("---------------");
		
		mp.entrySet().stream().map(et->et.getKey().getName()+" has "+et.getValue()).forEach(en->System.out.println(en));
		
		System.out.println("names sorted in reverse order :");
		mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(employee::getName).reversed())).map(e->e.getKey().getName()).forEach(er->System.out.println(er));
		
	}

}
