package mandatoryHoweWork_Oct2nWeek;

public class Oct12_HW_DecimalAdd {

	
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int data) {
			this.val=data;
			this.next=null;
		}
	}
	
	
	 public int getDecimalValue(ListNode head) {
	       int length = 0;
	       int result = 0;
	        ListNode current = head;
	        while(current!=null){
	            length++;
	            current = current.next;
	        }
	        length--;
	        current=head;
	        while(current!=null){
	            result += current.val * Math.pow(2, length--);
	            current = current.next;
	        }
	        return result;
	    }

	
}
