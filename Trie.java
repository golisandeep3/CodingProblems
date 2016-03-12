/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
	char data;
	Node edges[];
	public int words;
	public int prefix;
	
	public Node(char data)
	{
		this.data= data;
		edges = new Node[26];
	}
	public Node getEdge(char a)
	{
		int t = a-97;
		return edges[t];
	}
}

class Trie
{
	Node root = new Node('/');
	
	public void insert(String  a)
	{
		add(a,root);
	}
	private void add(String a,Node root)
	{
		if(a.length()==0)
		{
			root.words++;
			root.prefix++;
			return;
		}
		char c = a.charAt(0);
		Node temp =root.getEdge(c);
		if(temp==null)
		{
			temp = new Node(c);
			root.edges[c-97]=temp;

		}
		root.prefix++;
		add(a.substring(1),temp);
		
	}
	/*
	Find prefix and complete word
	*/
	public boolean find(String s)
	{
		char a[] = s.toCharArray();
		Node temp = root;
		int i=0;
		while(true)
		{
			if(i==a.length)
			{
				System.out.println("words:"+temp.words);
				System.out.println("prefix:"+temp.prefix);
			
			return true;
			}
			 temp = temp.edges[a[i]-97];
			if(temp==null)
			return false;
			i++;
			
		}
	}
}

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Trie t = new Trie();
		t.insert("sandeep");
			t.insert("san");
		System.out.println(t.find("san"));
	}
}
