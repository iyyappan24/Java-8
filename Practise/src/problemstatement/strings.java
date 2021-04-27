package problemstatement;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class strings {
	
	public static void main(String[] args){
	   
		char[] ch = {'b','s','w','b'};
		Character[] s = new Character[ch.length];
		
		for(int i=0;i<ch.length;i++){
			s[i] = ch[i];
		}
		List<Character> li = Arrays.asList(s);
		System.out.println(li);
		Set<Character> lp = new TreeSet<>();
		for(int j=0;j<s.length;j++){
			
			for(int i=0;i<s.length;i++){
				if(i==j){
					continue;
				}
				if(s[j]==s[i]){
					lp.add(s[j]);
					
				}
			}
		}
		
		System.out.println(lp);
	    
	    
		
        System.out.println(Character.compare(ch[1],ch[0]));
        
        Character q='l';
        char r ='l';
        if(q==r){
        	System.out.println("uses");
        }
        else{
        	System.out.println("not used");
        }
	
	
	}
	
	
	

 }


