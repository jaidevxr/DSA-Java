class StackNode{
    int data;
    StackNode next;
    StackNode(int data){
        this.data = data;
        this.next = null;
    }
}
class MyStack{
    StackNode top;
    MyStack(){
        this.top = null;
    }
    void push(int data){
        StackNode newNode = new StackNode(data);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }
    int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty(){
        return top == null;
    }
    void display(){
        StackNode current = top;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class BasicStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack elements:");
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop:");
        stack.display();
        System.out.println("Is stack empty? " + stack.isEmpty());
        
        
        

    }
    
}
