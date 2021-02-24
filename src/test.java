
import java.util.Scanner;

public class test<generic> {
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Select One Of The Following Data Structure");
        System.out.println("1. Singly Linked List\n2. Doubly Linked List\n3. Circular Linked List\n4. Stack\n5. Queue\6. Circular Queue\n7. Exit Program");
        int option=input.nextInt ();
        switch(option)
        {
            case(1):
                    {
                        single_linked_list obj=new single_linked_list();
                        System.out.println("Select One Of The Following Operation");
                        System.out.println("a. Create List\nb. Insert At Front\n c.Insert In Middle\n d.Insert At End\n e. Delete");
                        char op=input.next().charAt(0);
                        switch(op)
                        {
                            case('a'):
                                obj.createList ();
                                break;
                            case('b'):
                                obj.createList();
                                System.out.println("Enter the value to be inserted");
                                String in=input.next ();
                                obj.insertAtFront ( in );
                                break;
                            case('c'):
                                obj.createList ();
                                System.out.println("Enter the value and position to be inserted");
                                String mid=input.next ();
                                int pos=input.nextInt ();
                                
                                obj.insertInMiddle ( pos, mid );
                                break;
                            case('d'):
                                obj.createList ();
                                System.out.println("Enter the value to be inserted");
                                String end=input.next ();
                                obj.insertAtEnd ( end );
                                break;
                            case('e'):
                                System.out.println("Enter the value to be deleted");
                                String del=input.next ();
                                obj.delete ( del );
                                break;
                            default:
                                System.out.println("Invalid Operation");
                                break;
                        }
                    }
                    case(2):
                    {
                        double_list obj=new double_list();
                        System.out.println("Select One Of The Following Operation");
                        System.out.println("a. Create List\nb. Insert At Front\n c.Insert In Middle\n d.Insert At End\n e. Delete");
                        char op=input.next().charAt(0);
                        switch(op)
                        {
                            case('a'):
                                obj.createList ();
                                break;
                            case('b'):
                                obj.createList();
                                System.out.println("Enter the value to be inserted");
                                String in=input.next ();
                                obj.insertAtFront ( in );
                                break;
                            case('c'):
                                obj.createList ();
                                System.out.println("Enter the value and position to be inserted");
                                String mid=input.next ();
                                int pos=input.nextInt ();
                                
                                obj.InsertInMiddle ( pos, mid );
                                break;
                            case('d'):
                                obj.createList ();
                                System.out.println("Enter the value to be inserted");
                                String end=input.next ();
                                obj.InsertAtEnd ( end );
                                break;
                            case('e'):
                                System.out.println("Enter the value to be deleted");
                                String del=input.next ();
                                obj.Delete ( del );
                                break;
                            default:
                                System.out.println("Invalid Operation");
                                break;
                        }
                    }
                    
                    case(3):
                    {
                        circular_list obj=new circular_list();
                        System.out.println("Select One Of The Following Operation");
                        System.out.println("a. Create List\nb. Insert At Front\n c.Insert In Middle\n d.Insert At End\n e. Delete");
                        char op=input.next().charAt(0);
                        switch(op)
                        {
                            case('a'):
                                obj.createList ();
                                break;
                            case('b'):
                                obj.createList();
                                System.out.println("Enter the value to be inserted");
                                String in=input.next ();
                                obj.insertAtFront ( in );
                                break;
                            case('c'):
                                obj.createList ();
                                System.out.println("Enter the value and position to be inserted");
                                String mid=input.next ();
                                int pos=input.nextInt ();
                                
                                obj.insertInMiddle ( pos, mid );
                                break;
                            case('d'):
                                obj.createList ();
                                System.out.println("Enter the value to be inserted");
                                String end=input.next ();
                                obj.insertAtEnd ( end );
                                break;
                            case('e'):
                                System.out.println("Enter the value to be deleted");
                                String del=input.next ();
                                obj.delete ( del );
                                break;
                            default:
                                System.out.println("Invalid Operation");
                                break;
                        }
                    }
                    case(4):
                    {
                        stack obj=new stack();
                        System.out.println("Select One Of The Following Operation");
                        System.out.println("a. Create stack\nb. Push\n c.Pop\n d.Post-fix to Pre-fix");
                        char op=input.next().charAt(0);
                        switch(op)
                        {
                            case('a'):
                                obj.create ();
                                break;
                            case('b'):
                                obj.create();
                                System.out.println("Enter the value to be inserted");
                                char in=input.next ().charAt ( 0 );
                                obj.push ( in );
                                break;
                            case('c'):
                                obj.create ();
                                System.out.println("Poping the value");
                                obj.pop();
                                break;
                            case('d'):
                                System.out.println("Enter the value to be inserted");
                                obj.create ();
                                String exp=input.next ();
                                obj.conversion (exp);
                                break;
                            default:
                                System.out.println("Invalid Operation");
                                break;
                        }
                    }
                    
                    case(5):
                    {
                        queue obj=new queue();
                        System.out.println("Select One Of The Following Operation");
                        System.out.println("a. Create Queue\nb. Insert\n c.Remove");
                        char op=input.next().charAt(0);
                        switch(op)
                        {
                            case('a'):
                                obj.create_queue ( 10);
                                break;
                            case('b'):
                                obj.create_queue(10);
                                System.out.println("Enter the value to be inserted");
                                int in=input.nextInt ();
                                obj.insert (in );
                                break;
                            case('c'):
                                obj.remove ();
                                break;
                            default:
                                System.out.println("Invalid Operation");
                                break;
                        }
                    }
                    
                    case(6):
                    {
                        circular_queue obj=new circular_queue();
                        System.out.println("Select One Of The Following Operation");
                        System.out.println("a. Create Queue\nb. Insert\n c.Remove");
                        char op=input.next().charAt(0);
                        switch(op)
                        {
                            case('a'):
                                obj.create (10);
                                break;
                            case('b'):
                                obj.create(10);
                                System.out.println("Enter the value to be inserted");
                                int in=input.nextInt ();
                                obj.enqueue (in );
                                break;
                            case('c'):
                                obj.dequeue ();
                                break;
                            default:
                                System.out.println("Invalid Operation");
                                break;
                                
                        }
                    }
        }
        
    }
}
