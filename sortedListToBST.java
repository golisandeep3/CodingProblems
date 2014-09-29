/* Sorted List to BST  O(nlogn) */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
	int data;
	Node next;
}
class LinkedList
{
	Node head=null;
	public void insert(int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next=null;
		if(head==null)
		head=temp;
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	public Node returnHead()
	{
		return head;
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
class Bnode
{
	int data;
	Bnode left;
	Bnode right;
}
/* Name of the
class has to be "Main" only if the class is public. */
class Ideone
{
	public static Bnode createBST(Node head)
	{
		if(head==null)
		return null;
		Bnode root = new Bnode();
		Node middle = findMiddle(head);
		root.data = middle.data;
		if(head!=middle)
		root.left = createBST(head);
		else
		root.left = createBST(null);
		root.right = createBST(middle.next);
		return root;
		
	}
	public static Node findMiddle(Node head)
	{
		Node slow=head,fast=head,prev=null;
		if(head==null||head.next==null)
		return head;
		
		while(fast!=null && fast.next!=null)
		{
			
			prev=slow;
			//.out.println(prev.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		prev.next=null;
		return slow;
		
	}
	public static void inorder(Bnode temp)
	{
		if(temp==null)
		return;
		inorder(temp.left);
		System.out.println(temp.data);
		inorder(temp.right);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList ll = new LinkedList();
		ll.insert(4);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);
	//	ll.print();
		Bnode root=	createBST(ll.returnHead());
		inorder(root);
		
	}
}
