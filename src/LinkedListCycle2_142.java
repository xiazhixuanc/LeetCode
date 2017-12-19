
public class LinkedListCycle2_142 {
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode detectCycle(ListNode head) {
		if(head == null){
			return null;
		}
		ListNode p = head;
		ListNode q = head;
		while(q.next != null && q.next.next != null){
			p = p.next;
			q = q.next.next;
			if(p == q){
				p = head;
				while(p != q){
					p = p.next;
					q = q.next;
				}
				return p;
			}
		}
		return null;
	}
}
