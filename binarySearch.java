package AlgorithmsSearching_Alogrithms;

public class binarySearch {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8,9};
		System.out.println(sort(a,9));
		
	}
	public static int sort(int []a,int key)
	{
		int st=0;
		int end=a.length-1;
		while(st<=end)
		{
			int mid=(st+end)/2;
			if(a[mid]==key) return mid;
			if(key<a[mid])
			{
				end=mid-1;
			}
			else if(key>a[mid])
			{
				st=mid+1;
			}
			
		}
		return -1;
	}

}
