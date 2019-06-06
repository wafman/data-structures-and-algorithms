package code401Challenges.linkedlist;

import java.util.ArrayList;

public class LinkedList {
    Node head;

    LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        } else {
            return false;
        }
    }

    public void insert(int data){
        //check if head is empty
        if(isEmpty()){
            head = new Node(data);
        } else {
            Node newHead = new Node(data);
            newHead.next = head;
            head = newHead;
        }
    }


    public boolean includes(int checkValue){
        Node currentNode = head;
        if(!isEmpty()){
            while(currentNode.data != checkValue){
                if(currentNode.next == null){
                    return false;
                } else {
                    currentNode = currentNode.next;
                }
            }
        } else {
            System.out.println("The list is empty");
            return false;
        }
        return true;
    }

    public String print(){
        Node currentNode = head;
        String answer = "";
        while(currentNode != null){
            answer += answer.format("%d\n", currentNode.data);
            currentNode = currentNode.next;
            if(currentNode == null){
                answer += answer.format("null");
            }
        }
        return answer;
    }

    public void delete(int deleteValue){
        if(head == null) return;
        if(head.data == deleteValue){
            head = head.next;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            if(currentNode.next.data == deleteValue){
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void append(int data){
        if(isEmpty()){
            head = new Node(data);
        } else {
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
        }
    }

    public void insertBefore(int target, int value){
        if(isEmpty()){
            head = new Node(value);
        } else if(target == head.data){
            insert(value);
        }else {
            Node currentNode = head;
            while(currentNode.next.data != target){
                currentNode = currentNode.next;
            }
            Node beforeNode = new Node(value);
            beforeNode.next = currentNode.next;
            currentNode.next = beforeNode;
        }
    }

    public void insertAfter(int target, int value){
        if(isEmpty()){
            head = new Node(value);
        } else {
            Node currentNode = head;
            while(currentNode != null){
                if(currentNode.data == target){
                    Node afterNode = new Node(value);
                    afterNode.next = currentNode.next;
                    currentNode.next = afterNode;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public int returnNfromEnd(int n){
        Node currentNode = head;
        if(isEmpty()){
            return head.data;
        } else {
            int count = 0;
            while(currentNode != null){
                count++;
                currentNode = currentNode.next;
            }
            currentNode = head;
            for(int i = 0; i < count - n - 1; i++){
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
    }

    public static LinkedList mergeLists(LinkedList list1, LinkedList list2){
        Node list1Current = list1.head;
        Node list2Current = list2.head;

        while(list1Current != null || list2Current != null){

            Node list1Next = list1Current.next;
            Node list2Next = list2Current.next;

            if(list1Next == null){
                while(list2Current != null){
                    list1.append(list2Current.data);
                    list2Current = list2Current.next;
                }
                return list1;
            }
            if(list2Next == null){
                list1Current.next = list2Current;
                list2Current.next = list1Next;

                return list1;
            }

            list2Current.next = list1Next;
            list1Current.next = list2Current;

            list1Current = list1Next;
            list2Current = list2Next;

        }
        list2.head = list2Current;
        return list1;
    }

}//end of class
