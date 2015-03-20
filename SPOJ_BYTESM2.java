/*
* http://www.spoj.com/problems/BYTESM2/
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//import java.math.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt((br.readLine()).trim()) ;
		while(n>0)
		{
			String temp[] = (br.readLine()).split(" ");
			int r = Integer.parseInt(temp[0].trim());
			int c = Integer.parseInt(temp[1].trim());
			int a[][]=new int[r][c];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k=0,l=0;
			while(k<r)
			{
				if(l>=c)
				{
				k++;
				l=0;
				}
				if(!st.hasMoreTokens() && k<r)
				st=new StringTokenizer(br.readLine());
				else if(k>=r)
				break;
				
				a[k][l++] =Integer.parseInt(st.nextToken());
			}

		
			int comp[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				int max=0;
			for(int j=0;j<c;j++)
			{
				max=0;
				if(i-1>=0)
				{
					max=Math.max(max,comp[i-1][j]+a[i][j]);
					if(j-1>=0)
					max=Math.max(max,comp[i-1][j-1]+a[i][j]);
					if(j+1<c)
					max=Math.max(max,comp[i-1][j+1]+a[i][j]);
					comp[i][j]=max;
				}
				else
				comp[i][j]=a[i][j];
			}
			}
			int max=0;
			for(int i=0;i<c;i++)
			max=Math.max(max,comp[r-1][i]);
			System.out.println(max);
		
			n--;
			
		}
		
	}
}
