import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{


	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test=1;

		while(true)
		{
		 String input = br.readLine().trim();
		 if(input.equals("bye"))
		 break;
		 
		 char temp[] = input.toCharArray();
		 int len = temp.length;
		 int dp[][] = new int[len][226];
		 
		 int n1 =temp[0]-'0';
		 
		 dp[0][0] =0;
		 dp[0][n1] =1;
		 for(int i=1;i<len;i++)
		 {
		 	dp[i][0] =0;
		 	int sum=0;
		 	for(int k=i;k>0;k--)
		 	{
		 		int n = temp[k]-'0';
		 		sum+=n;
		 	//	System.out.println("sum:"+sum +" i:"+i+" k:"+k);
		 		int tp =0;
		 		for(int p=0;p<=sum;p++)
		 		tp+=dp[k-1][p];
		 	//	System.out.println("tp:"+tp);
		 	dp[i][sum]+=tp;
		 	}
		 	dp[i][sum+n1]++;
		 }
		 int total=0;
		 for(int i=0;i<=225;i++)
		 total+=dp[len-1][i];
		 System.out.println(test+". "+total);
		 test++;
		 
		}

		
			
		
	}
}
