/** Time complexity O(N)..
Not a Stable partition  i.e it does not maintain relative order between same group of numbers.If we want that we could apply 2 way partition twice
**/

int a[] = {-1,-2,4,0,-3,1,0,2,3};
public void threeWayPartition(a)
{
		int low=0,mid=0,high=a.length-1;
		while(a[low] <0)
		{
			low++;
		}
		mid=low;
		while(a[mid]==0)
		mid++;
		while(a[high] >0)
		high--;
		
		while(mid<=high)
		{
			if(a[mid] <0)
			{
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
			}
			else if(a[mid]==0)
			mid++;
			else
			{
				int temp = a[high];
				a[high] = a[mid];
				a[mid] = temp;
				high--;
			}
		}
}
