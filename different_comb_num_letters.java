	/*
	1 represent A, 2 rep B etc and 26 rep Z. Given a number, find number of possible decoding for this number. 
	No need to consider number starts with zero. Eg: input – 1234, output – 3(ABCD, AWD, LCD)
	
	
	*/
	
	int count=0;
	
	public void comb(int num)
	{
		combinations(num,"");
	}
	public void combinations(int num,String s)
	{
		if(num<=0)
		{
			count++;
			System.out.println("count:"+count);
			System.out.println(s);
			return;
		}

			int temp = num%10;
			s=s+" "+temp;
				int temp1 = num%100;
		
			
			
			if(temp <26)
			combinations(num/10,s);
			
			if(temp!=temp1)
			{
		
				s=s+" "+temp1;
			if(temp1 <26)
			combinations(num/100,s);
			}
	}
}
