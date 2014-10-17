/*Time complexity O(log(N)) */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int NthFib(int N)
	{
		if(N==1)
		return 1;
		int f[]=new int[3];
		f[1]=1;
		f[2]=1;
		
		int T[][]=new int[3][3];
		T[1][1]=0;
		T[1][2]=1;
		T[2][1]=1;
		T[2][2]=1;
		
		int x[][]=pow(T,N-1);
		
		return x[1][1]*f[1]+x[1][2]*f[2];
		

		
	}
	static int[][] pow(int T[][],int N)
	{
		if(N==1)
		return T;
		if(N%2!=0)
		return mul(T,pow(T,N-1));
		int x[][]=pow(T,N/2);
		return mul(x,x);
	}
	static int[][] mul(int x[][],int y[][])
	{
		int c[][] = new int[3][3];
		for(int i=1;i<3;i++)
		{
			for(int j=1;j<3;j++)
			for(int k=1;k<3;k++)
			c[i][j]+=x[i][k]*y[k][j];
		}
		return c;
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(NthFib(20));

		
	}
}
