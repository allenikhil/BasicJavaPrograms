package javaexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class NthPrimeNumber
{
public static void main(String[] args) 
{
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Postion of prime number below 9500");
	int po=sc.nextInt();
	int arr[]=new int[po];
	int index=0;
	for (int i=2;i<=100000;i++ )
	{
		for (int j=2;j<=i-1;j++ )
		{
			if (i%j==0) 
			{
			count++;
			break;
			}
		}//end of inner loop
	   if(count==0)
	   {
		  //System.out.println(i);
		   if(index<po)
		   {
		   arr[index]=i;
		   index++;
		   }
		   else
		   {
			   break;
		   }
	   }
	   count=0;
	}//end of outer for loop
	System.out.print("Prime numbers upto "+postion+" postion are :");
	for(int i=0;i<postion;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println("and "+arr[postion-1] +" is the "+postion+" postion in prime numbers");	
	sc.close();
}
}
