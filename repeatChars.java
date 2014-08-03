/*
Given an array of strings as input, return an array of all strings that have repeated chars that appear together. 
For e.g. in "hello" l and in "summer" s is a repeated char that appears together. However in "robot" o is not a repeated char as it does not appear together. 
repeatChars({"hello","robot","summer","elephant"}) = {"hello","summer"}
*/

	public void repeatChars(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			if(tests(s[i]))
			{
				System.out.println(s[i]);
			}
		}
	}
	private boolean tests(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			return true;
		}
		return false;
	}
