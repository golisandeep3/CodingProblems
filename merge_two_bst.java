/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
	int data;
	Node left;
	Node right;
	public Node(int data)
	{
		this.data = data;
		left=null;
		right=null;
	}
}

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void inorder(Node root1,Node root2)
	{
		Stack<Node> st1 = new Stack<Node>();
		Stack<Node> st2 = new Stack<Node>();
		while(true)
		{
			while(root1!=null)
			{
				st1.push(root1);
				root1=root1.left;
			}
			while(root2!=null)
			{
				st2.push(root2);
				root2=root2.left;
			}
			if(st1.isEmpty() && st2.isEmpty())
			break;
			if(st1.isEmpty())
			{
				Node temp = st2.pop();
				System.out.println(temp.data);
				root2 = temp.right;
				continue;
			}
			if(st2.isEmpty())
			{
				Node temp = st1.pop();
				System.out.println(temp.data);
				root1 = temp.right;
				continue;
			}
			Node t1 = st1.peek();
			Node t2 = st2.peek();
			if(t1.data > t2.data)
			{
				st2.pop();
				System.out.println(t2.data);
				root2=t2.right;
			}
			else
			{
				st1.pop();
				System.out.println(t1.data);
				root1=t1.right;
			}
		}
	}
	public static void inorder(Node root)
	{
		Node curr=root;
		Stack<Node> st = new Stack<Node>();
		while(true)
		{
			while(curr!=null)
			{
			st.push(curr);
			curr=curr.left;
			}
			if(st.isEmpty())
			{
				break;
			}
			Node temp = st.pop();
			System.out.println(temp.data);
			curr = temp.right;
			
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		  /* creating a binary tree and entering the nodes */
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(5);
         Node root1 = new Node(4);
        root1.left = new Node(2);
        root1.right = new Node(6);
        inorder(root,root1);
 

	}
}
