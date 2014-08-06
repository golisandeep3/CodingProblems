public void lprefix(String words[])
	{
		char test[]=words[0].toCharArray();
		int len = test.length;
		for(int i=1;i<words.length;i++)
		{
			char temp[] = words[i].toCharArray();
			for(int j=0;j<len;j++)
			{
				if(j<temp.length)
				{
				if(temp[j]!=test[j])
				len=j;
				}
			}
		}
		for(int i=0;i<len;i++)
		System.out.print(test[i]);
	}
