package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapTestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name ="testleaf";
	Map<Character,Integer>map= new HashMap<Character,Integer>();
	for(int i=0;i<name.length();i++) {
		System.out.println(name.charAt(i));
		if(map.containsKey(name.charAt(i))) {
			map.put(name.charAt(i), map.get(name.charAt(i))+1);
			
		}
		else {
			map.put(name.charAt(i), 1);
		}
	}
	
	}

}
