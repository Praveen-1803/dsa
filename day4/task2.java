package day4;

public class task2 {
	Node head;
    Node tail;

    
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    
    public void insertMiddle(int value) {
        Node newNode = new Node(value);
        
        if (head == null) {
            
            head = newNode;
            tail = newNode;
            return;
        }

       
        Node slow = head;
        Node fast = head;
        
       
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        
        newNode.prev = slow;
        newNode.next = slow.next;

        if (slow.next != null) {
            slow.next.prev = newNode;  
        }

        slow.next = newNode;  
    }

    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        task2 list = new task2();
        
        list.insertMiddle(10);
        list.insertMiddle(30);
        list.insertMiddle(40);

        System.out.println("List before inserting middle element:");
        list.printList();

        
        list.insertMiddle(25);

        System.out.println("List after inserting middle element:");
        list.printList();
    }

}
