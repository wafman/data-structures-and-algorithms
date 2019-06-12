package code401Challenges.FifoAnimalShelter;




public class AnimalShelter<T> {
    private Node<T> first;
    private Node<T> last;
    private int count;


    public AnimalShelter(){
        this.first = null;
        this.last = null;
        this.count = 0;
    }


//    create custom node class
    public class Node<T> {
        Node<T> next;
        T value;

        public Node(T value){
            this.value = value;
        }
    }

    //gettters

    public Node<T> getFirst() {
        return first;
    }

    public int getCount() {
        return count;
    }

    //helper functions
    public boolean isEmpty(){ return this.first == null; }

    //feature tasks

    public void enqueue(T t){
        Node n = new Node(t);
        if(first == null){
            first = n;
            last = n;
            count++;
        } else {
            last.next = n;
            last = n;
            count++;
        }
    }

    //search for particular object of Animal and return that object
    public Object dequeue(String animal){
        Node prev = this.first;
        Node current = this.first;
        while(current != null){
            if(current.value.toString() == animal) {
                if(current == prev && current.next == null){
                    this.first = null;
                    this.last = null;
                } else if (current == prev && current.next != null){
                    this.first = this.first.next;
                } else if(current == this.last){
                    this.last = prev;
                }
                if(current != prev){
                    prev.next = prev.next.next;
                }
                count--;
                return current.value;
            }
            if(prev != current){
                prev = prev.next;
            }
            current = current.next;
        }
        return null;
    }

}
