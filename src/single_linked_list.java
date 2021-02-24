public class single_linked_list<generic> {
    public class single_node{
        generic info;
        generic next;
    }
    protected single_node start; 
    int items; 
    single_node predloc, loc;
    
    public boolean isEmpty(){
        if(start==null)
        {
            System.out.println("List is Empty");
            return true;
        }
        else
        {
            System.out.println("List is not Empty");
            return false;
        }
            
    }
    public int lengthIs()
    {
        System.out.println("Length of list is "+items);
        return items;
    }
    
    public boolean Find (generic item)
    {
        predloc=null;
        loc=null;
        loc=start; 
        if (loc==null) 
            return false;
        boolean moreToSearch=true;
        while(moreToSearch && loc!=null)
        {
        if(loc.info != item){
        predloc=loc; 
        loc=(single_node) loc.next;
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
            System.out.println("Found "+loc.info);
            return true;
        }     
        else
        {
            System.out.println("Data Not Found");
            return false;
        }
        
            
    }
    public void insertAtFront (generic item)
    {
        single_node newNode = new single_node();
        newNode.info = (generic)item;
        newNode.next = (generic) start;
        start = newNode;
        items++;
        System.out.println("Insertion Done At Front");
    }
    public void insertAtEnd (generic item)
    {
        if(this.lengthIs()==0){
        this.insertAtFront((generic)item);
        return;
        }
        else{
        single_node newNode = new single_node();
        newNode.info = (generic)item;
        single_node location=start;
        while(location.next!=null)
        location=(single_node) location.next;
        //newNode.next = location.next;
        location.next = (generic) newNode;
        newNode.next=null;
        items++;
        System.out.println("Insertion Done At End");
            }
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
            single_node newNode = new single_node();
            newNode.info = (generic)item;
            int count=1;
            single_node location=start;
            while((count+1)!=position && location.next!=null){ 
            location=(single_node) location.next;
            ++count;
        }
            newNode.next = location.next;
            location.next = (generic) newNode;
            items++;
            System.out.println("Insertion Done At "+position+"th position");
        }
    }
    public void delete (generic item)
    {
            Find(item); 
            if (loc==null)
                System.out.println("item does not exists in the list");
            else {
                if(predloc==null){ 
                start=(single_node) loc.next;
                loc=null;
                    }
                else{
                predloc.next=loc.next;
                    }
                System.gc();
                System.out.println("Item Deleted");
                }
    }
    public void printList()
    {
        single_node location=start;
        int count=0;
        if(start==null)
        System.out.println("List is Empty");
        else{
        System.out.println("Printing List");
        for(location=start;location!=null;location=(single_node) location.next)
        {
        System.out.println(location.info+" is "+(++count)+"the item");
        }
}
    }
    
    public void createList()
    {
        items = 0;
        start = null;
        System.out.println("Singly Linked List Created");
    }
    
    public single_linked_list()
    {
        
    }
}
