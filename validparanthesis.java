	public static void validparan(int left,int right,String temp)
	{
		if(left==0 && right==0)
		System.out.println(temp);
		if(left>right)
		return;
		if(left>0)
		validparan(left-1,right,temp+"(");
		if(right>0)
		validparan(left,right-1,temp+")");
	}
