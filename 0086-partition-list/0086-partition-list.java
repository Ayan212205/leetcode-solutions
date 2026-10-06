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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode first=dummy1;
        ListNode second=dummy2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                first.next=temp;
                first=first.next;
            }else{
               second.next=temp;
               second=second.next;
            }
            temp=temp.next;
        }
        second.next=null;
        
        first.next=dummy2.next;
        return dummy1.next;
    }
}