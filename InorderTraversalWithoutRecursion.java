public void inorderTraversal(Node temp)
	{
		Stack<Node> s =new Stack<Node>();
		while(true)
		{
			if(temp!=null)
			{
				s.push(temp);
				temp=temp.left;
			}
			else if(!s.empty())
			{
				temp = s.pop();
				System.out.println(temp.data);
				temp=temp.right;
				
			}
			else
			break;
			
		}
	}
