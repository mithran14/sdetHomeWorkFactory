package mandatoryHoweWork_Oct2nWeek;

public class Interview2 {
	public static void main(String[] args) {
		int count=0;
		
		for (int i =0; i <3; i++) {
			for (int j = 0; j <=count; j++) {
				System.out.print("*");
			}
			System.out.println("");
			count=count+2;
		}
		count=count-2;
		for (int i = 0; i <3; i++) {
			count=count-2;
			for (int j = 0; j <=count; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
