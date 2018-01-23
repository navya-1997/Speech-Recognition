import java.util.Scanner;
class Stack{
    int top;
    int s[]=new int[5];
    Stack(){
        top=-1;
    }
    void push(int item){
        if(s.length-1==top){
               System.out.println("stack overflow");
               
        }
        else{
            top+=1;
            s[top]=item;
            
        }
    }
    void pop(){
        if(top==-1){
               System.out.println("Stack underflow");
        }
        else
        {
            int item=s[top];
            top-=1;
               System.out.println("deleted item is "+item);
        }
    }
    void display(){
        if(top==-1)
               System.out.println("No elements to display");
        else{
            for(int i=top;i>=0;i--){
                   System.out.println("\t"+s[i]);
            }
        }
    }
    
}

public class StackDemo {
    public static void main(String[] args){
        Stack stk=new Stack();
        int ch,item;
        Scanner in=new Scanner(System.in);
          while(true){
                 System.out.println("1.push\n2.pop\ndisplay\n enter ur choice ");
                 ch=in.nextInt();
                 switch(ch){
                     case 1:   System.out.println("enter the item to be pushed ");
                                item=in.nextInt();
                                stk.push(item);
                                break;
                     case 2:stk.pop();
                            break;
                     case 3:System.exit(0);
                     default:   System.out.println("Entre valid choice ");
                 }
          }
    }
    
    
}
