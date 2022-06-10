
package linkedlist;

import java.util.HashSet;

public class LinkedListOperations {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();

        head.val = 1;
        head.next = node1;
      
        node1.val = 0;
        node1.next = node2;

        node2.val = 1;
        node2.next = null;

       // deleteDuplicates(head);
        getDecimalValue(head);
    }
    static public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;

       ListNode temp = head;
       while(temp.next != null) {
        if (temp.val == temp.next.val) temp.next = temp.next.next;
        else temp = temp.next;   
      }
      return head;
    }

    static public int getDecimalValue(ListNode head)  {


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

  
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}