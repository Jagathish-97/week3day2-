package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers= {1,2,5,4,5,6,7,8,9,10};
		Set<Integer> set1= new TreeSet<Integer>();
		for(int i=0;i<numbers.length;i++) {
			set1.add(numbers[i]);
		}
		for(int i=0;i<set1.size();i++) {
			if (numbers[i]!=(i+1)) {
				System.out.println(i+1);
			}
		}

	}

}
