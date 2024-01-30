package Search_sort;
import java.io.*;
import java.util.*;
public class Sel_sort
{
	public static void fun2()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Selection Sort Test");
		System.out.println("Enter Number Of Integer Elements");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Integer Elements");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Elements before Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
		selectionsort(arr,n);
		System.out.println("Elements After Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public static void selectionsort(int arr[],int n)
	{
		int i,j,pos,temp;
		for(i=0;i<n;i++)
		{
			pos=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[pos])
				{
					pos=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	}
}