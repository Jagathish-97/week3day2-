package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name ="PayPal India";
        char [] nameChar = name.toCharArray();
        Set<Character> charSet= new HashSet<Character>();
        Set<Character> dupCharSet = new HashSet<Character>();
        for(int i =0;i<nameChar.length;i++) {
        	charSet.add(nameChar[i]);
        }
        for( Character charSet1 :nameChar) {
        	if(!charSet.add(charSet1)) {
        		dupCharSet.add(charSet1);
        	}
        }
        System.out.println(charSet);
        System.out.println(dupCharSet);
        
       for(Character duplicate: dupCharSet) {
        	if (dupCharSet.contains(duplicate)){
        		charSet.remove(duplicate);
        	}
        }
       System.out.println(charSet);
      
       for(Character charSet2 : charSet) {
    	   if(charSet2 !=' ') {
    		   System.out.println(charSet2);
    	   }
       }
	}

}
