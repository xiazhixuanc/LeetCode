public class AddTwoNums_2 {
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode f1 = l1;
		ListNode f2 = l2;
		ListNode dummyHead = new ListNode(0);
		ListNode l = dummyHead;
		int sum = 0;
		while(f1 != null || f2 != null){
			sum /= 10;
			if(f1 != null){
				sum += f1.val;
				f1 = f1.next;
			}  
			if(f2 != null){
				sum += f2.val;
				f2 = f2.next;
			}
			l.next = new ListNode(sum % 10);
			l = l.next;
		}
		if(sum / 10 == 1){
			l.next = new ListNode(1);
		}
		return dummyHead.next;
	}
}

