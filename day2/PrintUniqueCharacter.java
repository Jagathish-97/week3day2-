package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="jagathish";
		char[]nameChar=name.toCharArray();
		Set<Character> name2= new HashSet<Character>();
	for(Character sameChar:nameChar) {
		if(!name2.add(sameChar)) {
			name2.remove(sameChar);
			System.out.println(name2);
		}
			
		}
	System.out.println(name2);

	}

}
