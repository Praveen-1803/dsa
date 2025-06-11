package day4;

public class task1 {
	private Node head, tail;



    public task1() {

        head = tail = null;

    }

    class Node {

        int data;

        Node prev, next;

        Node(int data) {

            this.data = data;

            prev = next = null;

        }

    }

    public void insertAtEnd(int data) {

        Node node = new Node(data);

        if (tail == null) {

            head = tail = node;

        } else {

            tail.next = node;

            node.prev = tail;

            tail = node;

        }

    }



    public void traverseForward() {

        Node curr = head;

        while (curr != null) {

            System.out.print(curr.data + " ");

            curr = curr.next;

        }

        System.out.println();

    }



    public void traverseBackward() {

        Node curr = tail;

        while (curr != null) {

            System.out.print(curr.data + " ");

            curr = curr.prev;

        }

        System.out.println();

    }



    public static void main(String[] args) {

        task1 dll=new task1();

        dll.insertAtEnd(10);

        dll.insertAtEnd(20);

        dll.insertAtEnd(30);

        System.out.print("Forward: ");

        dll.traverseForward();  

        System.out.print("Backward: ");

        dll.traverseBackward();

    }
	
}
