package problemstatement;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class dial {
	
	public ArrayList<String> letterCombination(String digits){
		int len= digits.length();
		char[] c = digits.toCharArray();
		Map<Character,String> mp =new HashMap<>();
		mp.put('2',"abc");
		mp.put('3',"def");
		mp.put('4', "ghi");
		mp.put('5', "jkl");
		mp.put('6', "mno");
		mp.put('7', "pqrs");
		mp.put('8', "tuv");
	    mp.put('9',"wxyz");
	    int temp=0;
	    String[] ar =new String[len];
	    for(char v : c){
	    	
	    	for(Map.Entry<Character,String> mk : mp.entrySet() ){
	    		String h = String.valueOf(mk.getKey());
	            String  t = String.valueOf(v);
	    		if(h.equals(t)){
	    			ar[temp] = mk.getValue();
	    			temp++;
	    		}
	    	}
	    }
	    
	    ArrayList<String> al = new ArrayList<>();
	    String res="";
	  
   for(int z=0;z<ar.length-1;z++){
	   
	   char[] ch = ar[z].toCharArray(); 
       for(int q=z+1;q<ar.length;q++){ 
    	    
    	   if(z==q){
    		   continue;
    	   }
    	    char[] tr = ar[q].toCharArray();
	   
	        for(int i=0;i<ch.length;i++){
	    	
	    	for(int j=0;j<tr.length;j++){
	    		
	    		String k = String.valueOf(ch[i]);
	    		String lo = String.valueOf(tr[j]);
	    		res=k+lo;
	    		al.add(res);
	    		
	    	}
	    
	    }
	        
       }
   }
   return al;
	
	}
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	String num = sc.nextLine();
	dial d = new dial();
	
	ArrayList<String> lis = d.letterCombination(num);
	System.out.println(lis);
	
}
	

}
