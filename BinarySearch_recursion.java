package AlgorithmsSearching_Alogrithms;

public class BinarySearch_recursion {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8,9};
		System.out.println(sort(a, 9, 0, a.length-1));	
	}
	public static int sort(int []a,int key,int st,int end)
	{
		if(st>end)
		{
			return -1;
		}
			int mid=(st+end)/2;
			if(key==a[mid])
			{
				return mid;
			}
			if(key<a[mid])
			{
				return sort(a, key, st, mid-1);
			}
			else
			{
				return sort(a, key, mid+1, end);
			}
		}
	}
