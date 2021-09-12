
package linkedlist;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();

        head.val = 1;
        head.next = node1;
      
        node1.val = 1;
        node1.next = node2;

        node2.val = 2;
        node2.next = null;

        deleteDuplicates(head);

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

  
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}