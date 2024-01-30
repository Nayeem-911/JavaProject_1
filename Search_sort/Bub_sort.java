package Search_sort;
import java.io.*;
import java.util.*;
public class Bub_sort
{
	public static void fun3()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Bubble Sort Test");
		System.out.println("Enter Number Of Integer Elements");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Integer Elements");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Elements before Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
		bubblesort(arr,n);
		System.out.println("Elements After Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public static void bubblesort(int arr[],int n)
	{
		int i,j,t=0;
		for(i=0;i<n;i++)
		{
			for(j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					t=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
}