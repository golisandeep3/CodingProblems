public void removedup()
    {
       Node prev=head;
       if(head.next==null)
       return;
       Node curr=head.next;
       
       while(curr!=null)
       {
           if(prev.data!=curr.data)
           {
           prev.next = curr;
           prev=curr;
           }
           curr=curr.next;
       }
    }
