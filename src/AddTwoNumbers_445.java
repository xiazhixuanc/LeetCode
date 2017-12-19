
public class AddTwoNumbers_445 {
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode curr1 = l1;
		ListNode curr2 = l2;

		while(curr1 != null && curr2 != null){
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		ListNode curr = curr1 == null ? curr2 : curr1;
		ListNode p1 = curr1 == null ? l2 : l1;
		ListNode p2 = curr1 == null ? l1 : l2;
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = curr1 == null ? l2 : l1;
		dummyHead.val = add(p1, p2, curr);
		return dummyHead.val == 0 ? dummyHead.next : dummyHead;
	}
	public int add(ListNode p1, ListNode p2, ListNode curr){
		if(p1 == null)  return 0;
		int val = 0;
		if(curr != null){
			val = p1.val + add(p1.next, p2, curr.next);
		}else{
			val = p1.val + p2.val + add(p1.next, p2.next, null);
		}
		p1.val = val % 10;
		return val /10;
	}
}
