/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	String str= "-5*67";
	Stack<Integer> s = new Stack<Integer>();
	char a[] = str.toCharArray();
	for(int i=a.length-1;i>=0;i--)
	{
		if(Character.isDigit(a[i]))
		{
			s.push(a[i]-'0');
		}
		else
		{
			int p = s.pop() ;
			int q = s.pop();
			int r=0;
			switch(a[i])
			{
				case '+' :r=p+q;break;
				case '-' :r=p-q;break;
				case '*' :r = p*q;break;
				case '/':r = p/q;break;
			}
			s.push(r);
		}
	}
	System.out.println(s.pop());
	}
}
