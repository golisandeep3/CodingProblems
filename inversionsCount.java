	public static int  mergesort(int a[],int l,int r)
	{
		if(l>=r)
		{
		return 0;	
		}
		int mid = (l+r)/2;
	int linv=	mergesort(a,l,mid);
	int rinv=	mergesort(a,mid+1,r);
		int inv=merge(a,l,mid,r);
		return linv+rinv+inv;
		
	}
	public static int merge(int a[],int l,int mid ,int r)
	{
		int inversions=0;
		int l1=l;
		int r1 = mid;
		int l2=mid+1;
		int r2=r;
		int temp[] = new int[r-l+2];
		int k=0;
		while(l1<=r1&&l2<=r2)
		{
			if(a[l1]<a[l2])
			{
				temp[k++]=a[l1];
				l1++;
			}
			else if(a[l1]==a[l2])
			{
				temp[k++] =a[l1];
				temp[k++] = a[l2];
				l1++;
				l2++;
			}
			else 
			{
				inversions+=mid-l1+1;
				temp[k++] = a[l2];
				l2++;
			}
		}
		while(l1<=r1)
		{
			temp[k++] = a[l1++];
		}
		while(l2<=r2)
		{
			temp[k++] = a[l2++];
		}
		for(int i=0;i<k;i++)
		{
		//	System.out.println(temp[i]);
			a[l] = temp[i];
			l++;
		}
		//System.out.println("........");
		return inversions;
	}
