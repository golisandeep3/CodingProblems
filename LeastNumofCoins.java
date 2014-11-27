/*
Suppose we want to make change for n cents, using the least number of coins of
denominations 1; 10, and 25 cents.
Describe an O(n) dynamic programming algorithm to find an optimal solution
*/
public static int coinChange(int sum)
	{
		int temp[] = new int[sum+1];
		temp[0]=0;
		temp[1]=1;
		temp[25]=1;
		temp[10]=1;
		for(int i=1;i<=sum;i++)
		{
			int min = temp[i-1];
			if(i-25>=0 && temp[i-25]< min)
			min = temp[i-25];
			if(i-10>=0 && temp[i-10]<min)
			min=temp[i-10];
			temp[i] = min+1;
		}
		return temp[sum];
	}
