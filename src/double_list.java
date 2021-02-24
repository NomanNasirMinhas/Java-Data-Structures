
public class double_list<generic> {

    
public class double_node
    {
    generic next;
    generic prev;
    generic info;
    
    }
        double_node start;
        double_node last;
        int items;
        double_node loc,ploc;

        
        public void createList()
        {
            start=null;
            last=null;
            items=0;
            System.out.println ("Doubly Linked List Created");
        }

public boolean isEmpty ()
    {
        if(items==0)
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

public void printList(boolean direction){
                double_node location;
                if(this.isEmpty()){
                System.out.println("List is Empty");
                return;
                }
                if(direction){
                System.out.println("Printing List from start to last");
                for(location=start;location!=null;location=( double_node ) location.next)
                {
                System.out.println(location.info);
                }
        }
        else{
        System.out.println("Printing List from Last to Start");
        for(location=last;location!=null;location=( double_node ) location.prev){
        System.out.println(location.info);
                }
            }
    }

    public boolean Find(generic item)
{
        loc=null;
        ploc=null;
        loc=start;
        boolean isfound=false;
        if (loc==null) 
        return isfound; 

        boolean contSearch=true;
        while(contSearch && loc.next!=null ){
        if(loc.info!=item){
        loc=( double_node ) loc.next;
        }
        else
            contSearch=false;
            }
        if(loc.info==item)
        {
            isfound=true;
            System.out.println("Item Found");
        }
        else
            System.out.println("Item Not Found");
        
        return isfound;
}

    public void insertAtFront(generic item)
    {
        double_node newNode = new double_node(); 
        newNode.info = item;
        newNode.next = ( generic ) start;
        newNode.prev = null;
        if (start == null){ 
        start = newNode;
        last = newNode;
}
        else{ 
        start.prev = ( generic ) newNode;
        start = newNode;
}
        items++;
        System.out.println("Insertion Done At Front");
    }
    
    public void InsertAtEnd(generic item)
    {
        double_node newNode = new double_node();
        newNode.info = item;
        newNode.next = null;
        newNode.prev = ( generic ) last;
        if (start == null){
        start = newNode;
        last = newNode;
    }
        else{
        last.next = ( generic ) newNode;
        last = newNode;
      }
        items++;
        System.out.println("Insertion Done At End");
    }
    
    public void InsertInMiddle(int position, generic item)
    {
        boolean found=Find(item);
        if(found){
        System.out.println("Item "+item+" alreaday exists");
        }
        else{
        if(loc==null || position==1)
        this.insertAtFront(item);
        
        else{
        if(loc==last || position==items){
        this.InsertAtEnd(item);
        }
        else{
            double_node temp;
            loc=start;
            for(int i=1;i<position;i++)
                loc=( double_node ) loc.next;
        double_node newNode = new double_node();
        newNode.info=item;
        newNode.prev=loc.prev;
        newNode.next=( generic ) loc;
        temp=( double_node ) loc.prev;
        temp.next=( generic ) newNode;
        loc.prev=( generic ) newNode;
        System.out.println("Insertion Done in the Middle");
            }
            }
            }

    }
    
        public void Delete(generic item)
        {
            double_node temp,temp1;
           boolean found=Find(item);
            if(!found){
            System.out.println("Item not found in the list");
            return;
               }
            else{
            if(start==last){
            start=null;
            last=null;
            }
            else if (loc==start){
                
                temp=( double_node ) loc.next;
                temp.prev=loc.prev;
                start=( double_node ) start.next;
                loc=null;
                }
        else if (loc==last) {
            temp=( double_node ) loc.prev;
            temp.next=loc.next;
            last=( double_node ) last.prev;
            loc=null;
        }
            else{
            temp=( double_node ) loc.prev;
            temp1=( double_node ) loc.next;
            temp.next=loc.next;
            temp1.prev=loc.prev;
            loc=null;
           }
           }
            System.gc(); 
           System.out.println("Deletion Successfull");
        }
}
