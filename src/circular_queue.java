public class circular_queue<generic>
{
    int cap;
    int count , front , rear;
    int[] circular_queue = new int [cap];
    
    public void create(int max)
    {
        count = 0;
        front = 0;
        cap=max;
        rear = cap-1;
    }
    
    public boolean isEmpty()
    {
        if (count <= 0)
            {
                return true;
            }
        else
            {
                return false;
            }
    }
    
    public boolean isFull()
        {
            if (count == cap)
        {
         return true;
        }
            else
            {
        return false;
            }
        }
    
    public void enqueue(int x)
    {
        if (isFull())
    {
        System.out.println("Queue is full");
        return ;
    }
        else
        {
            rear++;
            if (rear == cap)
        {
            rear = 0;
        }
            circular_queue[rear] = x;
            count++;
        }
    }
    
    public int dequeue(){
        int x;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        else {
            x = circular_queue[front];
            front++;
            if (front == cap){
            front = 0;
                    }
            count--;
            }
            return x;
        }
}
