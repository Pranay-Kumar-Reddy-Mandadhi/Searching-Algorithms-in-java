package AlgorithmsSearching_Alogrithms;

import java.util.Arrays;

public class Linear_Search {

	public static void main(String[] args) {
		int [] a= {8,7,5,6,2,1,4};
		System.out.println(sort(a, 9));

	}
	public static int sort(int []a,int key)
	{
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
}
