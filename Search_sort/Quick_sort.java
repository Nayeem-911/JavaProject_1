package Search_sort;
import java.io.*;
import java.util.*;
public class Quick_sort
{
	public static void fun5()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Quick Sort Test");
		System.out.println("Enter Number Of Integer Elements");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Integer Elements");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Elements before Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
		quicksort(arr,0,n-1);
		System.out.println("Elements After Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public static void quicksort(int arr[],int low,int high)
	{
		int i=low,j=high;
		int temp;
		int pivot = arr[(low+high)/2];
		while(i<=j)
		{
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j)
			quicksort(arr,low,j);
		if(i<high)
			quicksort(arr,i,high);
	}
}