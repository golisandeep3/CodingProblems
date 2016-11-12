	public static void find(ArrayList<LinkedList<Integer>> al,int level,Node root) {
		if(root==null)
		return;
		LinkedList<Integer> l = null;
		if(al.size() <= level) {
			l = new LinkedList<Integer>();
			al.add(l);
		}
		else {
			l = al.get(level);
		}
		l.add(root.data);
		find(al,level+1,root.left);
		find(al,level+1,root.right);
	}
