
package linkedlist;

import java.util.List;

public class HackerRankLinkedList {

    static ListNode head = new ListNode();
    static ListNode head2 = new ListNode();


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

        node3.val = 4;
        node3.next = null;


        ListNode node4 = new ListNode();
        ListNode node5 = new ListNode();
        ListNode node6 = new ListNode();

        head2.val = 1;
        head2.next = node4;

        node4.val = 2;
        node4.next = node5;

        node5.val = 3;
        node5.next = node6;

        node6.val = 4;
        node6.next = null;
//         ListNode newHead = reverse(head);
//        while (newHead != null) {
//            System.out.println(newHead.val);
//            newHead = newHead.next;
//        }


//        boolean compare = compareLists(head, head2);
//        System.out.println(compare);

                int nodeValue = getNodeFromTail(head, 2);
        System.out.println(nodeValue);

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

    public static ListNode deleteNode(ListNode head, int position) {
        // Write your code here
        // 1 2 3 4 null --> delete position 2 which is number 3
        if (head == null)
            return head;

        if (position == 0)
            return head.next;

        int currentPos = 0;

        // 1 2 3 5 null
        ListNode current = head;
        while (current != null) {
            currentPos++;
            // position == 3 which is 4
            if (currentPos == position) {
                System.out.println(current.val);
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }

        return head;

    }


    public static ListNode reverse(ListNode head) {
        // Write your code here
        // prev == null
        // next == head.next

        // 1 2 3 null


        ListNode prev = null;

        ListNode current = head;
        while (current != null) {
            ListNode nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }

        return prev;


    }


    static boolean compareLists(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null)
            return true;


        ListNode firstHead = head1;
        ListNode secondHead = head2;
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        while (firstHead != null) {
            first.append(firstHead.val);
            firstHead = firstHead.next;
        }

        while (secondHead != null) {
            second.append(secondHead.val);
            secondHead = secondHead.next;
        }



        return first.toString().equals(second.toString());


    }

    static boolean compareListsImprovedSolution(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null)
            return true;


        ListNode firstHead = head1;
        ListNode secondHead = head2;


        while (firstHead != null && secondHead != null && firstHead.val == secondHead.val) {
          firstHead = firstHead.next;
          secondHead = secondHead.next;
        }





        return firstHead == secondHead;


    }

    public static int getNodeFromTail(ListNode head, int positionFromTail) {
        // Write your code here
        ListNode prev = null;

        ListNode current = head;
        while (current != null) {
            ListNode nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }

        int position = 0;


        while (prev != null) {

            if (position == positionFromTail)
                return prev.val;

            position++;
            prev = prev.next;
        }

        return 0;

    }


}


