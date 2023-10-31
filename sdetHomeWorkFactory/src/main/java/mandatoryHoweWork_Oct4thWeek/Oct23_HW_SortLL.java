package mandatoryHoweWork_Oct4thWeek;

import java.util.Arrays;

public class Oct23_HW_SortLL {
	public class ListNode{
		int val;
		ListNode next;
	}

	public ListNode sortList(ListNode head) {
		ListNode current =head;
		int count =0;
		while(current!=null){
			count++;
			current=current.next;
		}

		int[] arr = new int[count];
		int i=0;
		current=head;
		while(current!=null){
			arr[i++]=current.val;
			current=current.next;
		}
		Arrays.sort(arr);
		int j=0;
		current=head;
		while(current!=null){
			current.val=arr[j];
			j++;
			current=current.next;
		}
		return head;
	}
}

