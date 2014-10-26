/*Time Complexity O(logn)*/
public static void median(int a[],int b[],int l1,int r1,int l2,int r2)
	{
		if(r1-l1+1==2 || r2-l2+1==2)
		{
			int d = Math.max(a[l1],b[l2]);
			int f = Math.min(a[r1],b[r2]);
			System.out.println(a[l1]);
			System.out.println((d+f)/2);
			return;
		}
		int mid1  = (l1+r1)/2;
		int mid2 = (l2+r2)/2;
		if(a[mid1]==b[mid2])
		{
		System.out.println(a[mid1]);
		return;
		}
		else if(a[mid1]>a[mid2])
		{
			median(a,b,l1,mid1,mid2,r2);
		}
		else
		{
			median(a,b,mid1,r1,l2,mid2);
		}
	}


public int median(int a[],int b[])
	{
		int l = (a.length+b.length)/2;
		System.out.println("l value:" + l);
		int i=0,j=0,k=0,tmp=0;
		while(i<a.length && j<b.length)
		{
			if(k==l)
			break;
			if(a[i]<b[j])
			{
				i++;
				tmp=0;
			}
			else
			{
				j++;
				tmp=1;
			}
			k++;
		}
		if(k<l)
		{
			if(i<a.length)
			{
				return a[i-1+l-k];
				
			}
			else
			{
				return b[j-1+l-k];
			}
		}
		if(tmp==0)
		return a[i-1];
		else
		return b[j-1];
		
	}
