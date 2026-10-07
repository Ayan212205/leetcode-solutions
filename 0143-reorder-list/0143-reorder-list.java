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
        ListNode midNode=mid(head);
        ListNode rightNode=midNode.next;
        midNode.next=null; // breaking connectiond;
        ListNode rightHalf=reverse(rightNode);
        ListNode leftHalf=head;
        ListNode nextLeft,nextRight;
        while(leftHalf!=null && rightHalf!=null){
            nextLeft=leftHalf.next;
            leftHalf.next=rightHalf;
            nextRight=rightHalf.next;
            rightHalf.next=nextLeft;
            leftHalf=nextLeft;
            rightHalf=nextRight;
        }

    }
    private ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
}