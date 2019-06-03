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
}
