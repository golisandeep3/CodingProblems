/*
1. convert Hahsmap to list
2. Sort List
3. Convert List to linkedhashmap
*/
public static void sorthash(int a[])
	{
		LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hm.get(a[i])==null)
			{
				hm.put(a[i],1);
			}
			else
			{
				hm.put(a[i],hm.get(a[i])+1);
			}
		}
		 
		 Map<Integer,Integer> h = sort(hm);
		 Iterator it = h.entrySet().iterator();
		 
		 while(it.hasNext())
		 {
		 	Map.Entry<Integer,Integer> mp =(Map.Entry<Integer,Integer>) it.next();
		 	System.out.println("Key:"+mp.getKey()+" Value:"+mp.getValue());
		 }
	}
	public static Map<Integer,Integer> sort(Map<Integer,Integer> hm)
	{
		List<Map.Entry<Integer,Integer>> ll = new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
		Collections.sort(ll, new Comparator<Map.Entry<Integer, Integer>>()
		{
			public int compare(Map.Entry<Integer,Integer> h1,Map.Entry<Integer,Integer> h2)
			{
				return h1.getValue().compareTo(h2.getValue());
			}
		});
		
		Map<Integer,Integer> hh = new LinkedHashMap<Integer,Integer>();
		for(Map.Entry<Integer,Integer> mp:ll)
		{
			hh.put(mp.getKey(),mp.getValue());
		}
		return hh;
	}
