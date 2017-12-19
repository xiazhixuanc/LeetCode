
public class ReverseLinkedList_206 {
	/**
	 * Definition for singly-linked list.
	 */
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode reverseList(ListNode curr) {
		ListNode previous = null;
		while(curr != null){
			ListNode next = curr.next;
			curr.next = previous;
			previous = curr;
			curr = next;
		}
		return previous;
	}
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 
public class Solution {
    public ListNode reverseList(ListNode head) {
        return reList(head,null);
    }
    
    public ListNode reList(ListNode head, ListNode prev){
        if(head == null){
            return prev;
        }
        ListNode next = head.next;
        head.next = prev;
       ( prev = head;
        head = next;)
        return reList(next, head );
    }
    
}
*/