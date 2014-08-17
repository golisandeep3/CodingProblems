/*

Wap to insert space in a string in all possible way and print. 
E.g- string is abcd 
output a_bcd,a_b_cd,a_b_c_d 
ab_cd,ab_c_d, 
abc_d

*/

public void insert(String text,String temp)
	{
		if(text.length()==0)
		{
			System.out.println(temp);
		}
		for(int i=0;i<text.length();i++)
		{
			if(i==text.length()-1)
			insert(text.substring(i+1,text.length()),temp+text.substring(0,i+1));
			else
		insert(text.substring(i+1,text.length()),temp+text.substring(0,i+1)+"_");
		}
	}
