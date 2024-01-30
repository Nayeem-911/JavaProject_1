package Search_sort;
import java.io.*;
import java.util.*;
public class Bi_search
{
	public static void fun7()throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n,i,res=0,sval;
		System.out.println("\n\t\t\tBinary Search Test\n");
		System.out.println("Enter Number Of Integer Elements");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Integer Elements");
		for(i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter Search Value");
		sval = sc.nextInt();
		int low,high,midpt;
		low=0;
		high=n-1;
		while(low <= high)
		{
			midpt=(low+high)/2;
			if(arr[midpt] == sval)
			{
				res = midpt+1;
				break;
			}
			else if(arr[midpt]<sval)
			{
				low = midpt+1;	
			}
			else
			{
				high = midpt-1;
			}
			res = -1;
		}
		/*for(i=0;i<n;i++)
		{
			if(arr[i]==sval)
			{
				res=(i+1);
				break;
			}
			res = -1;
		}*/
		if(res==-1)
			System.out.println("search element is not present in the array");
		else
			System.out.println("search element is present in the array at the position : "+res);
	}	
}