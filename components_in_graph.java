	/*
	Given a multidimensional array like below:


0 1 0 0 3
0 3 3 0 0
0 0 0 0 2
0 0 1 0 2
0 0 0 0 0
"objects" are considered groups of numbers that touch along top, left, right, or bottom edges. 

Find the number of objects. 

For example given the above array, your code should detect 4 unique "Objects". {1,3,3}, {3}, {1}, and {2, 2}.
	*/
	
	int count=0;
	String path="";
	boolean b[][]=new boolean[5][5];
	
	
	public void components(int a[][])
	{
		for(int i=0;i<a.length;i++)
		for(int j=0;j<a[0].length;j++)
		{
			if(b[i][j]==false && a[i][j]!=0)
			{
				dfs(a,i,j);
				System.out.println("count:"+count);
				System.out.println("Path:"+path);
				count=0;
				path="";
			}
		}
	}
	private void dfs(int a[][],int i,int j)
	{
		if(i>=a[0].length|| j>=a.length||i<0||j<0)
		return;
		if(a[i][j]!=0 && b[i][j]==false)
		{
			count++;
			path=path+" "+a[i][j];
			b[i][j] = true;
			dfs(a,i+1,j);
			dfs(a,i,j+1);
			dfs(a,i-1,j);
			dfs(a,i,j-1);
		}
		
	}
