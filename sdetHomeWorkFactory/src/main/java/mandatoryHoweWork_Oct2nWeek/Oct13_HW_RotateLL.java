package mandatoryHoweWork_Oct2nWeek;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class Oct13_HW_RotateLL {

	public class ListNode{
		ListNode next;
		int val;
		public ListNode() {

		}
		public ListNode(int data) {
			this.val=data;
			this.next=null;
		}
	}

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || k == 0 || head.next ==null) {
			return head;
		}
		int length = 1;
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
			length++;
		}
		k = k % length;
		if (k == 0) {
			return head; 
		}

		ListNode tail = head;
		for (int i = 1; i < length - k; i++) {
			tail = tail.next;
		}

		ListNode newHead = tail.next;
		tail.next = null;
		current.next = head; 

		return newHead;
	}


	@Test
	public void testRotateRight_EmptyList() {
		ListNode head = null;
		int k = 3;
		ListNode rotated = rotateRight(head, k);
		assertEquals(null, rotated);
	}

	@Test
	public void testRotateRight_SingleNodeList() {
		ListNode head = new ListNode(1);
		int k = 2;
		ListNode rotated = rotateRight(head, k);
		assertEquals(1, rotated.val);
		assertEquals(null, rotated.next);
	}

	@Test
	public void testRotateRight_KEqualToListLength() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		int k = 3;
		ListNode rotated = rotateRight(head, k);
		assertEquals(1, rotated.val);
		assertEquals(2, rotated.next.val);
		assertEquals(3, rotated.next.next.val);
		assertEquals(null, rotated.next.next.next);
	}

	@Test
	public void testRotateRight_RotateOnce() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		int k = 1;
		ListNode rotated = rotateRight(head, k);
		assertEquals(3, rotated.val);
		assertEquals(1, rotated.next.val);
		assertEquals(2, rotated.next.next.val);
		assertEquals(null, rotated.next.next.next);
	}

	@Test
	public void testRotateRight_RotateMultipleTimes() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		int k = 2;
		ListNode rotated = rotateRight(head, k);
		assertEquals(3, rotated.val);
		assertEquals(4, rotated.next.val);
		assertEquals(1, rotated.next.next.val);
		assertEquals(2, rotated.next.next.next.val);
		assertEquals(null, rotated.next.next.next.next);
	}
}
