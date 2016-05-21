/*
Maintain a deque in decreasing order. Remove elements which are not in the current window.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	int a[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
	int k=4;
	Deque<Integer> q = new LinkedList<Integer>();
	//first k elements
	for(int i=0;i<k;i++)
	{
	// maintain decreasing order
		while(q.size()>0 && a[q.peekLast()] < a[i])
		{
			q.removeLast();
		}
		q.addLast(i);
	}
	for(int i=k;i<a.length;i++)
	{
		System.out.println(a[q.peekFirst()]);
			while(q.size()>0 && a[q.peekLast()] < a[i])
		{
			q.removeLast();
		}
		q.addLast(i);
		//remove elements which are not in current window
		if(q.peekFirst() <= i-k)
		{
			q.removeFirst();
		}
		
	}
	System.out.println(a[q.peekFirst()]);
	}
}
