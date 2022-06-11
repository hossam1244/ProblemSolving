
package linkedlist;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListOperations {
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

        node3.val = 4;
        node3.next = null;


        //    node2 node3
//        node3.val = 4;
//        node3.next = null;

        // deleteDuplicates(head);
        //  getDecimalValue(head);
        //middleNode(head);
        deleteNode(node1);

    }

    static public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head;
    }

    static public int getDecimalValue(ListNode head) {


        int result = 0;

        ListNode currentHead = head;
        while (currentHead != null) {
            result = result * 2;
            result = result + currentHead.val;
            currentHead = currentHead.next;
        }

        System.out.println(result);


        return result;
    }


    static public ListNode middleNode(ListNode head) {
        int length = 0;
        int middleNode;

        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        middleNode = length / 2;


        System.out.println(middleNode);

        ListNode newCurrent = head;
        int steps = 0;
        while (newCurrent != null) {
            if (steps == middleNode) {
                return newCurrent;
            }
            steps++;
            newCurrent = newCurrent.next;
        }


        return head;
    }


    static public void deleteNode(ListNode node) {
        node.val = node.next.val;
        // here we are assiging node1 to node 3
        // and we are assiging node1 value to node2 value
        node.next = node.next.next;

        ListNode currentHead = head;
        while (currentHead != null) {
            System.out.println(currentHead.val);
            currentHead = currentHead.next;
        }

    }


    public ListNode reverseList(ListNode head) {

    }


}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}