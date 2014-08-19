/*

Minimum Segment Tree

*/
class Node
{
	int data;
	Node left;
	Node right;
}

class SegmentTree
{
	public Node construct(int a[],int start,int end)
	{
		if(start>=end)
		{
			Node temp = new Node();
			temp.data = a[start];
			temp.left=null;
			temp.right=null;
			return temp;
		}
		int mid = (start+end)/2;
		Node left=construct(a,start,mid);
		Node right=construct(a,mid+1,end);
		
		Node t = new Node();
		t.data = Math.min(left.data,right.data);
	//	System.out.println(t.data);
		t.left = left;
		t.right = right;
		return t;
		
	}

	public void update(Node temp,int start,int end,int index,int newvalue)
	{
		if(start>=end && start==index)
		{
			temp.data = newvalue;
			return;
		}
		
		int mid = (start+end)/2;
		if(index>mid)
		update(temp.right,mid+1,end,index,newvalue);
		else
		update(temp.left,start,mid,index,newvalue);
		
		temp.data  =Math.min(temp.left.data,temp.right.data);
		
	}
	public int query(Node root,int start,int end,int a,int b)
	{
		if(a==start && b==end)
		return root.data;
		int mid = (start+end)/2;
		int left1=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
		int left2=left1;
		if(a<=mid && b<=mid)
		left1=query(root.left,start,mid,a,b);
		if(a<=mid && b>mid)
		left2=query(root.left,start,mid,a,mid);
		if(a>mid)
		right=query(root.right,mid+1,end,a,b);
		return Math.min(Math.min(left1,left2),right);
	}
}
