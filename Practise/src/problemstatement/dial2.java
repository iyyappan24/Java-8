package problemstatement;

import java.util.*;
import java.util.Scanner;

public class dial2 {
	
	
	public List<String> verify(String s){
		
		char[] ar = s.toCharArray();
		
		Character[] br = new Character[ar.length];
		for(int i=0;i<ar.length;i++){
			br[i] = ar[i];
		}
		Map<Character,String> mp = new HashMap<>();
		
		mp.put('2',"abc");
		mp.put('3',"def");
		mp.put('4',"ghi");
		mp.put('5', "jkl");
		mp.put('6',"mno");
		mp.put('7',"pqrs");
		mp.put('8',"uvw");
		mp.put('9',"xyz");
		
		
		Set<Map.Entry<Character,String>> mk = mp.entrySet();
		
		List<String> lo = new ArrayList<>();
		for(Character n : br){
			
			for(Map.Entry<Character,String> mj : mk){
				if(n==mj.getKey()){
					lo.add(mj.getValue());
				}
			}
			
		}
		int o=0;
		int u=0;
		String res ="";
		ArrayList<String> al = new ArrayList<>();
	    for(int i=0;i<lo.size();i++){
	    	
	    	char[] t = lo.get(i).toCharArray();
	    	for(int j=i+1;j<lo.size();j++){
	    		char[] bv = lo.get(j).toCharArray();
	    		  u=0;
	    		for(int x=0;x<t.length;x++){
	    		     o=0;	
	    			for(int y=0;y<bv.length;y++){
	    				
	    				String temp1 = String.valueOf(t[u]);
	    				String temp2 = String.valueOf(bv[o]);
	    				res=temp1+temp2;
	    				al.add(res);
	    				o++;
	    			}
	                   u++;   			
	    		}
	    		
	    	}
	    	
	    }
		
		
		return al;
		
		
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		String s = sc.nextLine();

		dial2 nl = new dial2();
		List<String> kl = nl.verify(s);
       
		
		System.out.println(kl);
	}

}




























