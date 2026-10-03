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
    ListNode tempHead = new ListNode(-1);
    ListNode temp = tempHead;
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        merge(l1,l2);
        return tempHead.next;
    }
    void merge(ListNode l1, ListNode l2){
        if(l1==null || l2==null){
            if(l1!=null){
                temp.next = l1;
            } else {
                temp.next = l2;
            }
            return;
        }

        if(l1.val<l2.val){
            temp.next = l1;
            temp = temp.next;
            merge(l1.next,l2);
        } else {
            temp.next = l2;
            temp = temp.next;
            merge(l1,l2.next);
        }
    }
}