package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
//import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = {1,22,3,54,65,22,43,67,98,1};
		List <Integer> list1= new ArrayList<Integer>(Arrays.asList(numbers));
		System.out.println(list1);
	for(int i =0;i<numbers.length;i++) {
			list1.add(numbers[i]);
			//System.out.println(list1);
			}
	
	//System.out.println(list1);
//for(int j=0;j<list1.size();j++) {
	//System.out.println(list1);

Set<Integer> set =new LinkedHashSet<Integer>(list1);
System.out.println(set);
	}
}

