package Search_sort;
import java.io.*;
import java.util.*;
public class Merge_sort
{
	public static void fun4()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Merge Sort Test");
		System.out.println("Enter Number Of Integer Elements");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Integer Elements");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Elements before Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
		mergesort(arr,0,n);
		System.out.println("Elements After Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public static void mergesort(int arr[],int low,int high)
	{
		int N=high-low;
		if(N<=1)
			return;
		int mid = low+N/2;
		mergesort(arr,low,mid);
		mergesort(arr,mid,high);
		int temp[] = new int[N];
		int i = low,j= mid;
		for(int k=0;k<N;k++)
		{
			if(i==mid)
				temp[k]=arr[j++];
			else if(j == high)
				temp[k] = arr[i++];
			else if(arr[j]<arr[i])
				temp[k]=arr[j++];
			else
				temp[k]=arr[i++];
		}
		for(int k=0;k<N;k++)
			arr[low+k] = temp[k];
	}
}