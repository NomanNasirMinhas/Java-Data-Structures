public class queue<generic>
{    
    
    int cap = 0; 
    int front = 0; 
    int rear;
    int[] queue;
    public void create_queue(int num)
    {
        cap=num;
        front=0;
        rear=-1;
        queue=new int[cap]; 
        System.out.println("Queue Created with capacity of "+num);
    }
    
    public boolean isEmpty(){
    if(rear<front)
    {
        System.out.println("Queue is Empty");
        return true;
    }
    else
    {
        System.out.println("Queue is NOT Empty");
        return false;
    }
        
    }
    
    public boolean full()
    {
        return(rear==cap-1);
    }
    
    public boolean insert(int a)
    {
        if(full())
        {
        System.out.println(" Queue is full. Insertion failed");
        return false;
        }
        else
        {
            queue[++rear]=a;
            System.out.println("Insertion Successfull");
            return true;
        }
            
    }
    
    public int remove()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return 0;
        }
        else
        {
            return queue[front++];
        }
    }
}
