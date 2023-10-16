package mandatoryHoweWork_Oct2nWeek;

public class Oct12_HW_Intersection {
	
	
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int data) {
			this.val=data;
			this.next=null;
		}
	}
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        if(headA == null || headB == null) return null;
	        ListNode curr1 = headA;
	        ListNode curr2 = headB;
	        while(curr1!=curr2){
	            if(curr1==null){
	                curr1=headA;
	            }
	            else{
	                curr1=curr1.next;
	            }
	            if(curr2==null){
	                curr2=headB;
	            }
	            else{
	                curr2=curr2.next;
	            }
	        }
	        return curr1;
	    }
}
