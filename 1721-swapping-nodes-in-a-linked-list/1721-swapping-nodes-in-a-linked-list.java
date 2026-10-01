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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        int i=1;
        while(i<k){
            first=first.next;
            i++;
        }
        ListNode fast=head;
        ListNode second=head;
        i=0;
        while(i<k){
            fast=fast.next;
            i++;
        }
        while(fast!=null){
            second=second.next;
            fast=fast.next;
        }
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        return head;

    }
}