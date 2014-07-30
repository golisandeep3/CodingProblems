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
