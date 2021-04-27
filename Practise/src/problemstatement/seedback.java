package problemstatement;
import java.util.regex.*;
public class seedback {
	
	public boolean lengthCheck(String str){
		boolean check=false;
		int len = str.length();
		if(len==12){
			check = true;
		}
		return check;	
	}
	
	public boolean batchNumberCheck(String str){
        boolean check = false;
        String res = str.substring(0,4);
        String reg = "[A-Z][A-Z][0-9][A-Z]";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(res);
        check = m.matches();
        return check;
		
	}
	public boolean yearCheck(String str){
		boolean check = false;
		String res = str.substring(4,8);
		String reg = "([2][0][1][5])|([2][0][1][6])|([2][0][1][7])|([2][0][1][8])|([2][0][1][9])|([2][0][2][0])";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(res);
		check = m.matches();
		return check;
		
	}
	public boolean monthCheck(String str){
		boolean check=false;
		String res = str.substring(8,10);
		String reg = "([0][1-9])|([1][0])|([1][1])|([1][2])";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(res);
		check = m.matches();
		return check;
	}
	public boolean dayCheck(String str){
		boolean check = false;
		String res = str.substring(10,12);
		String reg = "([0][1-9])|([1][0-9])|([2][0-9])|([3][0-1])";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(res);
		check = m.matches();
		return check;
	}
    public String printBatchNumber(String str){
    	
    	seedback s = new seedback();
    	boolean lencheck= s.lengthCheck(str);
    	if(lencheck==true){
    	boolean check = s.batchNumberCheck(str);
    	if(check == true){
    		return str.substring(0,4);
    	}
    	}
    	return null;
    }
    public String printDate(String str){
    	seedback seed = new seedback();
    	boolean lencheck = seed.lengthCheck(str);
    	boolean codecheck = seed.batchNumberCheck(str);
    	if(lencheck==true && codecheck==true){
    	boolean yearcheck = seed.yearCheck(str);
    	boolean monthcheck = seed.monthCheck(str);
    	boolean daycheck = seed.dayCheck(str);
    	String res="";
    	if(yearcheck==true && monthcheck==true && daycheck==true){
    		String year = str.substring(4,8);
    		String month = str.substring(8,10);
    		String day =str.substring(10,12);
    		res = day+"/"+month+"/"+year;
    		return res;
    	}
    	}
    	return null;
    }
	
    
    public static void main(String[] args){
    	
    	seedback sd = new seedback();
    	String code = "BL9A20181201";
    	System.out.println(sd.printBatchNumber(code));
    	System.out.println(sd.printDate(code));
    	
    }
    
    
}
