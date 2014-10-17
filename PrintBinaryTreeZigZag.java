class Node
{
int data;
Node left;
Node right;
}
public void zigzagorder()
	{
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while(!s1.empty()||!s2.empty())
		{
			while(!s1.empty())
			{
				Node temp = s1.pop();
				System.out.print(temp.data+" ");
				if(temp.left!=null)
				s2.push(temp.left);
				if(temp.right!=null)
				s2.push(temp.right);
			}
			System.out.println();
			while(!s2.empty())
			{
				Node temp = s2.pop();
				System.out.print(temp.data+" ");
				if(temp.right!=null)
				s1.push(temp.right);
				if(temp.left!=null)
				s1.push(temp.left);
			}
			System.out.println();
		}
	

	}
	