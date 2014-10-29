/* Time complexity  O(N * MlogM)      where M is length of each string  */
public static void anagrams(String a[])
	{
		HashMap<String,LinkedList<Integer>> hm = new HashMap<String,LinkedList<Integer>>();
		String t[] = new String[a.length];
		for(int i=0;i<a.length;i++)
		{
			char temp[] = a[i].toCharArray();
			Arrays.sort(temp);
			t[i] = new String(temp);
			if(hm.get(t[i])==null)
			{
				LinkedList<Integer> ll = new LinkedList<Integer>();
				ll.add(i);
				hm.put(t[i],ll);
			}
			else
			{
				LinkedList<Integer> ll =hm.get(t[i]);
				ll.add(i);
				hm.put(t[i],ll);
			}
		}
		Iterator it  =hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String,LinkedList<Integer>> me = (Map.Entry<String,LinkedList<Integer>>)it.next();
			LinkedList<Integer> ll = me.getValue();
			ListIterator<Integer> lis = ll.listIterator();
			while(lis.hasNext())
			{
				System.out.println(a[lis.next()]);
			}
			
		}
	}
