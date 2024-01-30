package Search_sort;
import java.io.*;
import java.util.*;
public class Ins_sort
{
	public static void fun1()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Insertion Sort Test");
		System.out.println("Enter Number Of Integer Elements");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Integer Elements");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Elements before Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
		insertionsort(arr,n);
		System.out.println("Elements After Sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public static void insertionsort(int arr[],int n)
	{
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			j=i;
			temp=arr[i];
			while(j>0 && temp<arr[j-1])
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
	}
}