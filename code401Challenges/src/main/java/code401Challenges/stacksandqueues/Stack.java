package code401Challenges.stacksandqueues;


public class Stack<T> {
    private Node<T> top;
    private int count;

    public Stack(){
        top = null;
        count = 0;
    }

    //getters

    public Node getTop() {
        return top;
    }

    public int getCount() {
        return count;
    }

    //helper functions

    public boolean isEmpty(){
        return top == null;
    }

    //feature functions

    public void push(T value){
        if(isEmpty()){
            top = new Node(value);
            count++;
        } else {
            Node previousTop = top;
            top = new Node(value);
            top.next = previousTop;
            count++;
        }
    }

    public T pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        T value = top.value;
        top = top.next;
        count--;
        return value;
    }

    public T peek(){
        if(isEmpty()){
//            System.out.println("Stack is empty");
            return null;
        }
        return top.value;
    }
}
