import java.util.*;
import java.lang.*;
import java.io.*;
/*
http://www.spoj.com/problems/AIBOHP/
*/
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{


	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
		 char input[]  =br.readLine().toCharArray();
		 int len =input.length;
		 int temp[][] = new int[len][len];
	
		 for(int i=0;i<len;i++)
		 {
		 temp[i][i] = 0;
		 }
		 for(int k=1;k<len;k++)
		 {
		 for(int i=len-2;i>=0;i--)
		 {
		 	int j=i+k;
		 	if(j>=len)
		 	continue;
		 	if(input[i] !=input[j])
		 	{
		 		
		 		temp[i][j] =Math.min( temp[i+1][j],temp[i][j-1]) +1;
		 	}
		 	else
		 	temp[i][j] =temp[i+1][j-1];
		 }
		 }
		 System.out.println(temp[0][len-1]);
			
			t--;
		}

		
			
		
	}
}
