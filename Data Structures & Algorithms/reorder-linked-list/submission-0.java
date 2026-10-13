/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow;

        ListNode prev=null;
        ListNode curr=mid.next;
        while(curr!=null) {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        mid.next=null;

        ListNode secondHalf=prev;
        while(head!=null && secondHalf!=null) {
            ListNode next = secondHalf.next;
            secondHalf.next = head.next;
            head.next=secondHalf;
            head=secondHalf.next;
            secondHalf=next;
        }
    }
}
