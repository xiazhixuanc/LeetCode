
public class RemoveNthNode_19 {
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }

		public ListNode removeNthFromEnd(ListNode head, int n) {
			if(head == null){
				return null;
			}
			ListNode dummyHead = new ListNode(0);
			dummyHead.next = head;
			ListNode p = dummyHead;
			for(int i = 0; i < n; i++){
				p = p.next;
			}
			ListNode q = dummyHead;
			while(p.next != null){
				q = q.next;
				p = p.next;
			}
			q.next = q.next == null ? null : q.next.next;
			return dummyHead.next;
		}
	}
}
