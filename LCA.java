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
		Node temp = lca(root,a,b);
		temp = lca(root,temp.data,c);
		System.out.println("LCA: "+ temp.data);
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

public class Main
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
		
		bt.inorder();
		bt.lca3(11,20,15);
		
	}
}
