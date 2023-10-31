package mandatoryHoweWork_Oct4thWeek;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Oct26_HW_InsertionSort {
	private class ListNode {
		int val;
		ListNode next;
	}

	public ListNode insertionSortList(ListNode head) {
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}

		int[] temp = new int[count];
		current = head;
		int i = 0;

		while (current != null) {
			temp[i++] = current.val;
			current = current.next;
		}

		Arrays.sort(temp);

		current = head;
		i = 0;

		while (current != null) {
			current.val = temp[i++];
			current = current.next;
		}

		return head;
	}

}

