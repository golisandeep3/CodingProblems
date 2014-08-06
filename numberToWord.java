/*Number to words below 1000 */

class Word
{
	String tensword[] ={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	String text="";
	String words[] ={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
	"tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	
	public String convert(int num)
	{
		if(num%100 <20)
		{
				text=words[num%100];
				//System.out.println("text:"+text);
			num = num/100;
		
		}
		else
		{
			text =words[num%10];
			num=num/10;
			text = tensword[num%10]+text;
			num=num/10;
		}
		if(num!=0)
		{
			text = words[num%10]+"hundred"+text;
		}
		
		return text;
		
	}
}
