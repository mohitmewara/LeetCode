/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode head = null;
        ListNode node = null;
       
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int temp = (l1 != null ? l1.val:0) + (l2 !=null ? l2.val : 0) + carry;
            int va = temp%10;
            node = new ListNode(va);
            if(head == null){
                head = node;
            }
            else{
                l3.next = node;
            }
            l3 = node;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            
            carry = temp/10;
        }
        if(carry > 0){
            l3.next = new ListNode(carry);
        }
        return head;
    }
}
