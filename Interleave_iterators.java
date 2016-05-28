/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Interleave<E> implements Iterable<E>
{
	Queue<Iterator<E>> q = new LinkedList<Iterator<E>>();
	public void addIterators(List<Iterator<E>> list)
	{
		q.addAll(list);
	}
	public Iterator<E> iterator()
	{
		return new Dust();
	}
	private class Dust implements Iterator<E>
	{
		public boolean hasNext()
		{
			while(!q.isEmpty())
			{
				if(q.peek().hasNext())
				return true;
				q.remove();
			}
			return false;
		}
		public E next()
		{
			Iterator<E> it = q.remove();
			
			E el = it.next();
			q.add(it);
			return el;
		}
	}
}
class Test<E> 
{
	List<E> list = new LinkedList<E>();
	public void add(E in)
	{
		list.add(in);
	}
	private class Doom implements Iterator<E>
	{
		int index=0;
		public boolean hasNext()
		{
			if(index==list.size())
			return false;
			return true;
		}
		public E next()
		{
			return list.get(index++);
		}
	}
	public Iterator<E> iterator()
	{
		return new Doom();
	}
}

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{


	public static void main (String[] args) throws java.lang.Exception
	{
		Test<Integer> t = new Test<Integer>();
		t.add(10);
		t.add(20);
		t.add(50);
		Test<Integer> t1 = new Test<Integer>();
		t1.add(30);
		t1.add(40);
		Interleave<Integer> inte = new Interleave<Integer>();
		inte.addIterators(Arrays.asList(t.iterator(),t1.iterator()));
		Iterator<Integer> it = inte.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}
}
