/* https://www.nayuki.io/page/next-lexicographical-permutation-algorithm */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static boolean next(int a[]) {
		int i = a.length-1;
		while(i>0) {
			if(a[i] >a[i-1])
			break;
			i--;
		}
		if(i<=0) return false;
		int j=a.length-1;
		while(j>0) {
			if(a[j] > a[i-1]) break;
			j--;
		}
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] =temp;
		j=a.length-1;
		while(i<j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[] = {1,2,3};
		do {
			for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
			System.out.println();
		}while(next(a));
	}
}
