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
        if(head==null)
        {
            temp.next=null;
            head = temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
    }
    
    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public int length()
    {
        int len=0;
        Node temp = head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        return len;
    }
    public void insert_inter(Node temp,int data)
    {
        while(temp.next!=null)
        temp=temp.next;
        Node temp1 = new Node();
        temp1.data = data;
                temp1.next = null;

        temp.next = temp1;
        
        temp=head;
        while(temp.next!=null)
                temp=temp.next;
                
                
        temp.next = temp1;

        
        
        
        
    }
    public Node root()
    {
        return head;
    }
}

public class HelloWorld{

     public static void main(String []args){
         
         LinkedList a = new LinkedList();
         LinkedList b = new LinkedList();
         a.insert(10);
         a.insert(20);
        a.insert(30);
        a.insert(35);
        a.insert(36);
         b.insert(15);
         b.insert(25);
         a.insert_inter(b.root(),40);
         a.print();
         b.print();
         int alen = a.length();
         int blen  =b.length();
         int diff = Math.abs(alen-blen);
         Node h1 = a.root();
         Node h2 = b.root();
         Node temp;
         int count=0;
         if(alen > blen)
         {
             while(count < diff)
             {
             h1=h1.next;
             count++;
             }
         }
         else
         {
              while(count < diff)
             {
             h2=h2.next;
             count++;
             }
         }
         
         while(h1!=null&&h2!=null)
         {
           if(h1==h2)
           System.out.println("Inter:"+h1.data);
           h1=h1.next;
           h2=h2.next;
         }
         
         
         
         
         
         
         
        
         
     }
}
