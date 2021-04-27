package problemstatement;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashsetoperations {
	
	public Set<Integer> subtract(Set<Integer> a,Set<Integer> b){
		a.removeAll(b);
		Set<Integer> s = new TreeSet<>(a);
	    return s;
	}
	public Set<Integer> union(Set<Integer> a,Set<Integer> b){
		a.addAll(b);
		Set<Integer> s = new TreeSet<>(a);
		return s;	
		
	}
	public Set<Integer> intersect(Set<Integer> a,Set<Integer> b){
	  
      Set<Integer> se = new TreeSet<>();
      for(Integer i : a){
    	  se.add(i);
      }
      a.removeAll(b);
      se.removeAll(a);
      return se;
		
	}
    
	
	public static void main(String[] args){
		
		 Hashsetoperations h = new Hashsetoperations();
         Set<Integer> set1 = new HashSet<>();
         set1.add(5);
         set1.add(6);
         set1.add(7);
         set1.add(8);
         Set<Integer> set2 = new HashSet<>();
	     set2.add(9);
	     set2.add(3);
	     set2.add(7);
	     Set<Integer> res =h.union(set1, set2);
	     System.out.println(res);
	     
	     System.out.println("------------");
	     
	     Set<Integer> res2 = h.subtract(set1, set2);
	     System.out.println(res2);
	     
	     System.out.println("----------");
	     
	     Set<Integer> res3 = h.intersect(set1, set2);
	     System.out.println(res3);
	     
	       
	     
	     
	}
	
}

