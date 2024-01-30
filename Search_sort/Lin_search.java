package Search_sort;
import java.io.*;
import java.util.*;
public class Lin_search
{
	public static void fun6()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n,i,res=0,sval;
		System.out.println("\n\t\t\tLinear Search Test\n");
		System.out.println("Enter Number Of Integer Elements");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Integer Elements");
		for(i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("\nEnter Search Value\n");
		sval = sc.nextInt();
		res = linearsearch(arr,n,sval);
		if(res==-1)
			System.out.println("search element is not present in the array");
		else
			System.out.println("search element is present in the array at the position : "+res);
	}
	public static int linearsearch(int arr[],int n,int sval)
	{
		for(int i=0;i<n;i++)
			{
				if(arr[i]==sval)
					return(i+1);
			}
			return -1;
		}	
}