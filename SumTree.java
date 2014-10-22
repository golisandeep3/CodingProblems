/*Time complexity O(N) */

public void sumtree(Node root)
	{
		if(root==null)
		return;
		sumtree(root.right);
		int temp=root.data;
		root.data =sum;
		sum=sum+temp;

		sumtree(root.left);
		
	}
