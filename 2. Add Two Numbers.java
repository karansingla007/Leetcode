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

    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode lastNode = new ListNode();
        ListNode newHead = null;
        while(l1 != null && l2 != null) {
            ListNode newNode = new ListNode();
            
            int newData = l1.val + l2.val + carry;
            carry = 0;
            if(newData > 9) {
                carry = newData/10;
            }
            
            newNode.val = newData%10;
            if(newHead == null) {
                newHead = newNode;
            } else {
                lastNode.next = newNode;
            }
            lastNode = newNode;   
            l1 = l1.next;
            l2 = l2.next;
        }
        
         while(l1 != null) {
             ListNode newNode = new ListNode();
             int newData = l1.val + carry;
             carry = 0;
            if(newData > 9) {
                carry = newData/10;
            }
             newNode.val = newData%10;
             lastNode.next = newNode;
             lastNode = newNode;   
            l1 = l1.next;
        }
        
         while(l2 != null) {
             ListNode newNode = new ListNode();
             int newData = l2.val + carry;
             carry = 0;
            if(newData > 9) {
                carry = newData/10;
            }
             newNode.val = newData%10;
             lastNode.next = newNode;
             lastNode = newNode;   
            l2 = l2.next;
        }
        if(carry > 0) {
            ListNode newNode = new ListNode();
            newNode.val = carry;
            lastNode.next = newNode;
             lastNode = newNode; 
        }
        
        return newHead;
    }
}