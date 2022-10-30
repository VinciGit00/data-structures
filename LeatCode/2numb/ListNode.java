// Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int index = 0;
		int result1 = 0;

		while (l1.next.next != null) {
			result1 += l1.val * Math.pow(10, index);
			index++;
		}

		int result2 = 0;
		index = 0;
		while (l2.next.next != null) {
			result2 += l2.val * Math.pow(10, index);
			index++;
		}

		int result3 = result1 + result2;

		return null;
	}
}