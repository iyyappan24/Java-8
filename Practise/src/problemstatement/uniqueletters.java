package problemstatement;

import java.util.*;
public class uniqueletters {
   
	public String unique(String s){
		Set<Character> set = new LinkedHashSet<>();
		char[] ar = s.toCharArray();
		for(int i=0;i<ar.length;i++){
			
			for(int j=0;j<ar.length;j++){
				if(i==j){
					continue;
				}
				if(ar[i]!=ar[j]){
					set.add(ar[i]);
				}
			}
		}
	
       return set.toString();
		
		
	}
	
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String s = sc.nextLine();
		uniqueletters n = new uniqueletters();
		String res = n.unique(s);
		System.out.println("result= "+res);
	}
}
