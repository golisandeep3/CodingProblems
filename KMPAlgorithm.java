/* https://www.youtube.com/watch?t=506&v=iZ93Unvxwtw */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	String input=br.readLine();
	while(input!=null)
	{
		int n = Integer.parseInt(input);
		int dfa[][] =new int[256][n+1];
		char pattern[] = (br.readLine()).toCharArray();
		char text[] = (br.readLine()).toCharArray();
		int x=0;
		for(int j=0;j<256;j++)
		dfa[j][0]=0;
		dfa[pattern[0]][0]=1;
		for(int i=1;i<pattern.length;i++)
		{
			for(int j=0;j<256;j++)
			dfa[j][i]=dfa[j][x];
			dfa[pattern[i]][i]=i+1;
			x=dfa[pattern[i]][x];
		}
		int j=0;
		for(int i=0;i<text.length;i++)
		{
			 j = dfa[text[i]][j];
			 if(j==pattern.length)
			 {
			 System.out.println(i-pattern.length+1);
			 j=0;
			 i=i-pattern.length+2;
			 }
		}
		input=br.readLine();
		if(input!=null)
		System.out.println();
		
	}
	}
}
