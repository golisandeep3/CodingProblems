/* Time Complexity O(N)*/
/* Add all the binary bits of each column of numbers and check whether each column bit is equal to number  of input numbers.If they are
less than and calculate pair differences */
/*
EX: 1--- 001
    2--- 010
    6--- 110
    sum--121
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num[]={1,2,6};
		int b[] = new int[32];
		for(int i=0;i<num.length;i++)
		{
			int one=1;
			int j=0;
			while(num[i]!=0)
			{
				b[j]=b[j]+(num[i]&one);
				num[i]=num[i]>>1;
				j++;
			}
		}
		int res=0;
		for(int i=0;i<32;i++)
		{
		res+=b[i]*(num.length - b[i]);	
		}
		System.out.println(res);
	}
}
