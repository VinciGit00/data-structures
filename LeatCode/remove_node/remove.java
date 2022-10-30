
public class remove {

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
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		int len = 0;

		ListNode iterator = head;

		while (iterator != null) {
			len++;
			iterator = iterator.next;
		}

		if (n > len)
			return head;
		else if (n == len) {

			return head.next;

		} else {
			int diff = len - n;

			ListNode prev = null;
			ListNode curr = head;

			for (int i = 0; i < diff; i++) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
			return head;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
