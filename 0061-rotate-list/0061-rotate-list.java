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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int len=length(head);
        k=k%len;
        if(k==0){
            return head;
        }
        ListNode tail=head;
        while(tail.next!=null){  // Adding last Node to head;
            tail=tail.next;
        }
        tail.next=head;
        int s=len-k; // remaining Nodes
        ListNode temp=head;
        int i=1;
        while(i<s){
            temp=temp.next;
            i++;
        }
        ListNode newHead=temp.next;
        temp.next=null;
        return newHead;
    }
    private int length(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}