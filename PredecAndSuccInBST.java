Node prec=null;
	Node succ =null;
	public void prec_succ(int key)
	{
		next(root,key);
		System.out.println("Prec:"+prec.data);
		System.out.println("Succ:"+succ.data);
	}
	public void next(Node root,int key)
	{
		if(root==null)
		return;
		if(root.data==key)
		{
			if(root.right!=null)
			{
				Node temp=root.right;
				while(temp.left!=null)
				temp=temp.left;
				succ=temp;
				
			}
			if(root.left!=null)
			{
					Node temp=root.left;
				while(temp.right!=null)
				temp=temp.right;
				prec=temp;
				
			}
			return;
		}
		if(root.data < key)
		{
			prec=root;
			next(root.right,key);
		}
		else if(root.data > key)
		{
			succ=root;
			next(root.left,key);
		}
	}
	
