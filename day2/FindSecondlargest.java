package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer>set1= new TreeSet<Integer>();
		
			for(int i=0;i<data.length;i++) {
				set1.add(data[i]);
			}
		
      List<Integer> list1 = new ArrayList<Integer>(set1);
      System.out.println(list1);
	int count = list1.size();
	int secondLargestNumber= list1.get(count-2);
	System.out.println(secondLargestNumber);
	}

}
