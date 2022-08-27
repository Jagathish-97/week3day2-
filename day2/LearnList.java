package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list =new ArrayList<Integer>();
 list.add(1);
 list.add(22);
 list.add(3);
 list.add(54);
 list.add(65);
 list.add(22);
 list.add(43);
 int count =0;
	System.out.println(list);
	for(int i=0;i<list.size();i++) {
		if (list.get(i)==22) {
			count++;
			
		}
		System.out.println(count);
	}
	}

}
