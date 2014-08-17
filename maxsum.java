/*
Given an array of positive negative no, u need to find max sum we can achieve using this array, 
condition is u cannot use two adjacent items. 
*/

	public int maxsum(int a[],int sum,int k)
	{
		if(k>=a.length)
		return sum;
		int sum1=0;
			if(a[k]>0)
			{
			 sum1=maxsum(a,sum+a[k],k+2);
			}
			int sum2=maxsum(a,sum,k+1);
		
		return Math.max(sum1,sum2);
		
	}
