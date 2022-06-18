
package linkedlist;

public class HackerRankLinkedList {

    static ListNode head = new ListNode();


    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();

        head.val = 1;
        head.next = node1;

        node1.val = 2;
        node1.next = node2;

        node2.val = 3;
        node2.next = node3;

        node3.val = 5;
        node3.next = null;

        ListNode newHead = insertNodeAtPosition(head, 4,3);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }

    }


    static void printLinkedList(ListNode head) {

        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }


    }

    // 1 2 3 4 null

    static ListNode insertNodeAtTail(ListNode head, int data) {


        ListNode newNode = new ListNode();


        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        newNode.val = data;
        current.next = newNode;


        return head;

    }


    static ListNode insertNodeAtHead(ListNode head, int data) {
        ListNode newNode = new ListNode();
        newNode.val = data;
        if (head == null) {
            head = newNode;
            return head;
        }

        newNode.next = head;
        ListNode current = newNode;

        return current;


    }

    static ListNode insertNodeAtPosition(ListNode head, int data, int position) {
        ListNode newNode = new ListNode();
        newNode.val = data;
        int currentPos = 0;

        // 1 2 3 5 null
        ListNode current = head;
        while (current != null) {
            currentPos++;
            if (currentPos == position) {
                newNode.next = current.next;
                current.next = newNode;
                return head;
            }
            current = current.next;
        }

        return head;



    }

}


