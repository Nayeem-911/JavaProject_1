package Fmath;
import java.io.*;
import java.util.*;
public class fmat6
{
    public void fun6()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int a[][],b[][],c[][],i,j,k,r1,r2,c1,c2;
        System.out.println("Enter the first matrix rows and columns : ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the second matrix rows and columns : ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        if(c1==r2)
        {
            a = new int[r1][c1];
            b = new int[r2][c2];
            c = new int[r1][c2];
            System.out.println("Enter first matrix elements : " +(r1*c1));
            for(i=0;i<3;i++)
                for(j=0;j<3;j++)
                    a[i][j] = sc.nextInt();
            System.out.println("Enter second matrix elements : " +(r2*c2));
            for(i=0;i<3;i++)
                for(j=0;j<3;j++)
                    b[i][j] = sc.nextInt();
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    c[i][j]=0;
                    for(k=0;k<c1;k++)
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
            System.out.println("product Matrix : ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                    System.out.printf("%3d",c[i][j]);
                System.out.println();
            }
        }
        else
        {
            System.out.println("matrix multiplication is not possible");
        }
    }
}