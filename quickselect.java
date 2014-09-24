	/*Top K elements from an array*/
	
	public static int partition(int a[],int start,int end)
	{
		int i = start-1;
		int j = start;
		int pivot = end;
		while(j<end)
		{
			if(a[j] < a[pivot])
			{
				int temp = a[j];
				a[j] =a[i+1];
				a[i+1] = temp;
				i++;
			}
			j++;
		}
		int temp = a[i+1];
		a[i+1] = a[pivot];
		a[pivot] = temp;
		return i+1;
		
	}
	public static void quickselect(int a[],int i,int j,int k)
	{
		if(i<j)
		{
			int mid = partition(a,i,j);
			if(mid==k)
			return;
			if(j-mid+1 <k)
			{
			quickselect(a,i,mid-1,k-j+mid-1);
			}
			else
			quickselect(a,mid+1,j,k);
		}
	}
