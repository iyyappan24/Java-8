package problemstatement;
import java.util.*;
import java.util.stream.*;
public class arralist {
	
	public static void main(String[] args){
		
	List<employee> lis = new ArrayList<employee>();
	lis.add(new employee(2,"janu",4000.5f,"trichy",32));
	lis.add(new employee(1,"meena",5000.6f,"chennai",12));
	lis.add(new employee(3,"lita",2000.34f,"trichy",24));
	Collections.sort(lis,new Comparator<employee>(){
		public int compare(employee e1,employee e2){
			
			if(e1.getSalary()>e2.getSalary()){
				return 1;
			}
			else if(e1.getSalary()<e2.getSalary()){
				return -1;
			}
			return 0;
		}
	});
	lis.forEach(e->System.out.println(e));
	
	System.out.println("-------------------");
	Collections.sort(lis,new Comparator<employee>(){
		public int compare(employee e1,employee e2){
			if(e2.getId()>e1.getId()){
				return 1;
			}
			else if(e2.getId()<e1.getId()){
				return -1;
			}
			return 0;
		}
	});
	
	lis.forEach(System.out::println);
	
	
	System.out.println("--------------------------------");
	
	List<String> names = lis.stream().map(e->e.getName()).sorted((e1,e2)->e1.compareTo(e2)).collect(Collectors.toList());
	names.forEach(e->System.out.println(e));
	
	System.out.println("----------------");
	String f = lis.stream().max(Comparator.comparingDouble(employee:: getSalary)).map(e->e.getName()).get();
	System.out.println("Name of employee getting maximum salary : "+f);
	
	System.out.println("---------------");
	employee e = lis.stream().max(Comparator.comparingDouble(employee :: getSalary)).get();
	System.out.println(e);
	
	System.out.println("-------------");
	
	List<employee> e1 = lis.stream().filter(ei->{
		String loc = ei.getLocation();
		if(loc.equalsIgnoreCase("trichy")){
			return true;
		}
		else{
			return false;
		}
	}).collect(Collectors.toList());
	
	e1.forEach(e5->System.out.println(e5));
	
	System.out.println("-----------------");
	
	int iop=lis.stream().map(eo->eo.getAge()).max((op1,op2)->op1-op2).get();
	System.out.println(iop);
	}
	
	}
	


