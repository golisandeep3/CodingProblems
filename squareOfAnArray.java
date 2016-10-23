/*
Given: sorted array of integers 
Return: sorted array of squares of those integers 
Ex: [1,3,5] -> [1,9,25] 

Integers can be negative.
*/

class Main
{
  
  public static int search(int a[])
	{
		int start =0;
		int end = a.length-1;
		
		while(start <=end)
		{
			int mid = (start+end+1)/2;
			if(a[mid] >=0 && a[mid-1]<0)
			{
				return mid;
			}
			else if(a[mid] >=0 && a[start]<0)
			{
				end =mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = {-3,-2,-1,0,1,2,3};
		int out[] = new int[a.length];
		int i=0;
		
		int index = search(a);
		System.out.println("index:"+index);
		if(index!=-1)
		{
			int s1=index-1,s2=index;
			while(s1>=0 && s2<a.length)
			{
				if(Math.abs(a[s1]) > a[s2])
				{
					out[i++]=a[s2] *a[s2];
					s2++;
				}
				else if(Math.abs(a[s1]) == a[s2])
				{
					out[i++]=a[s2] *a[s2];
					out[i++]=a[s2] *a[s2];
					s2++;
					s1--;
				}
				else
				{
					out[i++]=a[s1] *a[s1];
					s1--;
				}
			}
			while(s1>=0)
			{
				out[i++]=a[s1] *a[s1];
					s1--;
			}
			while(s2<a.length)
			{
				out[i++]=a[s2] *a[s2];
					s2++;
			}
		}
		else
		{
			while(i<a.length)
			{
				out[i]= a[i] *a[i];
				i++;
			}
		}
		for( i=0;i<a.length;i++){
			System.out.println(out[i]);
		}
		
	}
  }
