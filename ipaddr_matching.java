public void ipaddr(String str)
	{
		ip(str,"",3);
	}
	private void ip(String str,String temp,int count)
	{
			if(count==0)
			{
				if(str.length()!=0)
			System.out.println(temp+str);
			return;
			}
		
		if(count >0)
		{
		ip(str.substring(1,str.length()),temp+str.charAt(0)+".",count-1);
		if(str.length() >=2)
		ip(str.substring(2,str.length()),temp+str.substring(0,2)+".",count-1);
		if(str.length()>=3)
		{
		int temp1 = Integer.parseInt(str.substring(0,3));
		if(temp1 < 256)
		{
			ip(str.substring(3,str.length()),temp+str.substring(0,3)+".",count-1);
		}
		}
		}
	}
