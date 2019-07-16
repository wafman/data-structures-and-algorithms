package code401Challenges.stacksandqueues;

public class Queue<T> {
    private Node<T> front;
    private Node<T> last;
    private int count;

    public Queue(){
        this.front = null;
        this.last = null;
        this.count = 0;
    }

    //getters

    public Node getFront() {
        return front;
    }

    public int getCount() {
        return count;
    }


    //helper functions
    public boolean isEmpty(){
        return front == null;
    }


    //feature functions

    public void enqueue(T data){
        Node n = new Node(data);
        if(isEmpty() == true){
            front = n;
            last = n;
            count++;
        } else {
            last.next = n;
            last = n;
            count++;
        }
    }

    public T dequeue(){
        if(isEmpty() == true){
            System.out.println("Queue is empty");
        }
        T value = front.value;
        front = front.next;
        count--;
        return value;
    }

    public T peek(){
        if(isEmpty() == true){
            System.out.println("Queue is empty");
        }
        return front.value;
    }


}
