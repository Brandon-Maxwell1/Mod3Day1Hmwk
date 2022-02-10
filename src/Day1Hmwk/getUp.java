package Day1Hmwk;

public class getUp {
	
	public static String currentHour(int hour) {
	boolean squawking = true;
		if(squawking == true && (hour < 600 | hour > 2200)) {
		return "True";
	} else {
		return "False";
	}
	}
	
	
	public static String parrotMethod(boolean isSquawking, int currentHour) {		
			if(isSquawking == true && (currentHour < 600 | currentHour > 2200)) {
			return "True";
		} else {
			return "False";
		}
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println(currentHour(400));
		System.out.println(parrotMethod(true, 500));
		System.out.println(parrotMethod(false, 500));
		
	}


}
