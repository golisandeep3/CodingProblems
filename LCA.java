/*
There is a binary tree. We are given 3 nodes a, b and c. 
We need to find a node in the tree such that we remove all edge from that node we get a, b and c in three different trees
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
	int data;
	Node left;
	Node right;
}
class BinaryTree
{
	Node root=null;
	public void insert(int value)
	{
		Node curr = new Node();
		curr.data = value;
		curr.left = null;
		curr.right = null;
		if(root==null)
		{
			root=curr;
			return;

		}
		
		Node temp=root,temp1=root;
		while(temp!=null)
		{
			temp1=temp;
			if(temp.data < value)
			temp = temp.right;
			else
			temp = temp.left;
		}
		if(temp1.data < value)
		temp1.right = curr;
		else
		temp1.left = curr;
	}
	
	public void inorder()
	{
		inordert(root);
	}
	private void inordert(Node temp)
	{
		if(temp==null)
		return;
		
		inordert(temp.left);
		System.out.println(temp.data);
		inordert(temp.right);
	}
	
	public void lca3(int a, int b,int c)
	{
		Node temp1 = lca(root,a,b);
		Node temp2 = lca(root,b,c);
		Node temp3 = lca(root,a,c);
		System.out.println("temp1:"+temp1.data);
				System.out.println("temp2:"+temp2.data);
		System.out.println("temp3:"+temp3.data);

		if(temp1.data==temp2.data && temp1.data==temp3.data)
		System.out.println("LCA: "+ temp1.data);
		else
		{
			if(temp1.data==temp2.data)
			{
				System.out.println("LCA:"+height(temp1.data,temp3.data));
			}
			else if(temp1.data==temp3.data)
			{
				System.out.println("LCA:"+height(temp2.data,temp3.data));
			}
			else
			{
				System.out.println("LCA:"+height(temp1.data,temp2.data));
			}
		}
	}
	public int height(int a,int b)
	{
		System.out.println("height a:"+h(root,a,1));
		System.out.println("height b:"+h(root,b,1));
		//return 0;
		return h(root,a,1)>h(root,b,1)?a:b;
	}
	private int h(Node temp,int a,int count)
	{
		if(temp==null)
		return 0;
		if(temp.data==a)
		return count;
		int left = h(temp.left,a,count+1);
		
		if(left!=0)
		return left;
		int right = h(temp.right,a,count+1);
		return right;

		
		//return 0;
		
	}
	private Node lca(Node temp,int a,int b)
	{
		if(temp==null)
		return null;
		if(temp.data ==a || temp.data==b)
		{
			return temp;
		}
		
		Node left = lca(temp.left,a,b);
		Node right = lca(temp.right,a,b);
		if(left!=null && right!=null)
		return temp;
		
		return left!=null?left:right;
		
	}
}

public class LCA
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BinaryTree bt = new BinaryTree();
		bt.insert(10);
		bt.insert(9);
		bt.insert(15);
		bt.insert(5);
		bt.insert(11);
		bt.insert(20);
		bt.insert(25);
		bt.inorder();
		bt.lca3(11,20,9);
		//bt.height(11,25);
		
	}
}
