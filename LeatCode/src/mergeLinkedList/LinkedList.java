package mergeLinkedList;

class ListNode {
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

public class LinkedList {
	static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}

	}

	static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

		ListNode result = new ListNode();

		int f1 = 0;
		int f2 = 0;
		while (f1 == 0 || f2 == 0) {
			System.out.println(list1.val + " " + list2.val);
			System.out.println(result.val);

			if (f1 == 0 && f2 == 0) {
				if (list1.val >= list2.val) {
					result.next = new ListNode(list1.val);
					list1 = list1.next;
				} else {
					result.next = new ListNode(list2.val);
					list2 = list2.next;
				}

			} else if (f1 == 1) {
				result.next = new ListNode(list2.val);
				list2 = list2.next;
			} else if (f2 == 1) {
				result.next = new ListNode(list1.val);
				list1 = list1.next;
			}

		}

		return result;
	}

	static void print(ListNode index) {
		while (index != null) {
			System.out.print(index.val + " ");
			index = index.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;

		print(l1);

		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);

		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = null;

		print(l5);

		print(mergeTwoLists(l1, l5));
		print(mergeTwoLists2(l1, l5));

	}

}
