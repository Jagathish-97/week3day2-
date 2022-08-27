package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] data = {4,3,6,8,29,1,2,4,7,8};
   Set <Integer> dup=new TreeSet<Integer>();
   for(int i=0;i<data.length;i++) {
	   if(dup.add(data[i])==false) {
		   System.out.println(data[i]);
	   }
   }
	}

}
