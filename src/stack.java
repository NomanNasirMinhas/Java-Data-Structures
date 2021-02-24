
import java.util.Scanner;

public class stack<generic>
{
            public class node
            {
                generic next; 
                char data;
            }

        node top;
        public void create()
        {
            top=null;
            System.out.println ("Stack Created");
        }
        
        boolean IsEmpty(){
                if (top==null)
                {
                    System.out.println("Stack is Empty");
                    return true;
                }
                else{
                    System.out.println("Stack is not Empty");
                    return false;
                }
        }

        void push(char x){

                node newnode = new node();

                newnode.data=x;

                newnode.next=( generic ) top;

                top=newnode;
                System.out.println(x+" pushed into stack");
        }

        node pop(){

         node newelement = null;

                if (IsEmpty()){
                        System.out.println("Pop Operation Failed");
                }
                else{
                         newelement = top;
                        top=( node ) top.next;
                        System.out.println(newelement+" poped");
                }
                return newelement;

        }

        public void print(){

                node temp = top;
                if(this.IsEmpty()){
                        System.out.println("Stack Cannot be Printed");
                return;
                }

                while(temp!=null){
                    System.out.println("Printing Stack Data");
                System.out.println(" "+ temp.data);
                temp=( node ) temp.next;
                }
        }

        boolean precedence(char x, char y){   

         int count=0, count2=0;

                switch ( x )
                {
                    case '+':
                    case '-':
                        count=1;
                        break;
                    case '*':
                    case '/':
                        count=2;
                        break;
                    case '^':
                        count=3;
                        break;
                    default:
                        count=0;
                        break;
                }

                switch ( y )
                {
                    case '+':
                    case '-':
                        count2=1;
                        break;
                    case '*':
                    case '/':
                        count2=2;
                        break;
                    case '^':
                        count2=3;
                        break;
                    default:
                        count2=0;
                        break;
                }
                
                if(count>count2)
                {
                    System.out.println(count+" has higher precedence than "+count2);
                    return true;
                }
                
                else
                {
                    System.out.println(count+" has lower precedence than "+count2);
                    return false;
                }
                
        }
        public void conversion(String Infix) 
        {
         char[] exp= Infix.toCharArray();

            StringBuilder str=new StringBuilder();

            for (char c:exp){
               if(c>='A'&&c<='Z'||c>='a'&&c<='z'){
                        str.append(c);
                }
                else {
                 if (IsEmpty()){
                         push(c);
                 }
                        else if(precedence(c, top.data))
                        push(c);
                        else{
                                str.append((pop()).data);
                                push(c);
        }
                }}}}
            