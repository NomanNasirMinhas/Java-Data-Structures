public class circular_list<generic> 
{
    public class circular_node{
        generic next;
        generic info;
    }
    circular_node loc;
    circular_node ploc;
    circular_node start;
    int items;
    
    public circular_list()
    {
    }
    
    public void createList()
    {
        start=null;
        items=0;
        System.out.println("Circular List Created");
    }
    
    public boolean isEmpty()
    {
        if(items==0)
        {
            System.out.println("List is Empty");
            return true;
        }
        else
        {
            System.out.println("List is Not Empty");
            return false;
        }
    }
    
    public int length()
    {
        System.out.println("Length of List is "+items);
        return items;
    }
    
    public void printList()
    {
        
        loc=start;
        circular_node temp;
        if(start==null)
        System.out.println("List is Empty");
        else{
        System.out.println("Printing List");
        while(loc.next!=start)
        {
            loc.next=( generic ) ( circular_node ) loc.next;
            temp=( circular_node ) loc.next;
            System.out.println(temp.info);
        }
        }
    }
    
    public boolean Find (generic item)
    {
        ploc=null;
        loc=null;
        loc=start; 
        if (loc==null) 
            return false;
        boolean moreToSearch=true;
        while(moreToSearch && loc!=null && loc.next!=start)
        {
        if(loc.info != item){
        ploc=loc; 
        loc=(circular_node) loc.next;
        }
        else
        moreToSearch=false;
        }
        if(loc!=null){
            if(loc.info!=item)
            loc=null;
            }
        if (loc!=null)
        {
            System.out.println("Item Found");
        return true;
        }
            
        else
        {
            System.out.println("Item Not Found");
            return false;
        }
            
    }
    public void insertAtFront (generic item)
    {
        circular_node newNode = new circular_node();
        newNode.info = (generic)item;
        newNode.next = (generic) start;
        start = newNode;
        items++;
        System.out.println("Insertion Done at Front");
    }
    
    public void insertAtEnd (generic item)
    {
        if(this.length()==0){
        this.insertAtFront((generic)item);
        return;
        }
        else{
        circular_node newNode = new circular_node();
        newNode.info = (generic)item;
        loc=start;
        while(loc.next!=start)
        loc=(circular_node) loc.next;
        loc.next = (generic) newNode;
        newNode.next=( generic ) start;
        items++;
            }
        System.out.println("Insertion Done at End");
    }

    public void insertInMiddle (int position, generic item)
    {
          if(position > (this.items+1))
            {
            System.out.println("Invalid position: Aborting");
            }
          else if(position==1)
            { 
                this.insertAtFront((generic)item);
                return;
            }
        else if (position==(this.items+1)){
            this.insertAtEnd((generic)item);
            }
        else{ 
            circular_node newNode = new circular_node();
            newNode.info = (generic)item;
            int count=1;
            circular_node location=start;
            while((count+1)!=position && location.next!=start){ 
            location=(circular_node) location.next;
            ++count;
        }
            newNode.next = location.next;
            location.next = (generic) newNode;
            items++;
        }
          System.out.println("Insertion in middle successfull");
    }
    
    public void delete (generic item)
    {
            Find(item); 
            if (loc==null)
                System.out.println("Item not Found in the list");
            else {
                if(ploc==null){ 
                start=(circular_node) loc.next;
                loc=null;
                    }
                else{
                ploc.next=loc.next;
                    }
                System.gc();
                }
            System.out.println("Deletion Successfull");
    }
    
}
