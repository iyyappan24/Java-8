package problemstatement;

import java.util.*;

import java.util.stream.*;
public class list {

   public static void main(String[] args){
	   
   List<employee> list = new ArrayList<>();
   list.add(new employee(1,"liki",4500.0f,"chennai",23));
   list.add(new employee(2,"rita",3200.0f,"trichy",35));
   list.add(new employee(3,"meena",4200.0f,"bangalore",21));
   
   System.out.println("-------------");
   
   int age = list.stream().min(Comparator.comparingInt(employee :: getAge)).map(e->e.getAge()).get();
   System.out.println(age);
   
   System.out.println("--------------");
   
   
   Integer i=12;
   Integer r =56;
   int res =i.compareTo(r);
   System.out.println(res);
   int t=90;
   int jo=98;
   int re=Integer.compare(t, jo);
	   System.out.println(re);
	   
	Float f =98.87f;
	Float jk=90.65f;
	int y=f.compareTo(jk);
	System.out.println(y);

 }
}