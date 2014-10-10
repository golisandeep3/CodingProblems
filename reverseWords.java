	/* Time complexity O(N) */
	
	public static void stringreverse(char c[],int i,int j)
	{
		while(i<j)
		{
			char temp = c[i];
			c[i] =c[j];
			c[j] = temp;
			i++;
			j--;
			
		}
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String str="Hi How are you";
		char c[] = str.toCharArray();
		int i=0,j=0;
		stringreverse(c,0,c.length-1);
			
		while(i<c.length)
		{
			if(c[i]==' ')
			{
				stringreverse(c,j,i-1);
				j=i+1;
			}
			i++;
			
		}
		if(j<i)
		{
			stringreverse(c,j,i-1);
		}
		for(i=0;i<c.length;i++)
		System.out.print(c[i]);
		
	}
