/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static boolean match(int s[],int t[])
	{
		for(int i=0;i<256;i++) {
			if(s[i]!=t[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String a="abbc";
		String b = "cbabadcbbabbcbabaabccbabc";
		char bt[] = b.toCharArray();
		int s[] = new int[256];
		int t[] = new int[256];
		for(int i=0;i<a.length();i++) {
			char temp = a.charAt(i);
			s[temp]++;
		}
		for(int i=0;i<a.length();i++) {
			t[bt[i]]++;
		}
		if(match(s,t)) {
			System.out.println(0);
		}
		for(int i=a.length();i<b.length();i++) {
			t[bt[i-a.length()]]--;
			t[bt[i]]++;
			if(match(s,t)) {
			System.out.println(i-a.length());
		}
		}
	}
}
