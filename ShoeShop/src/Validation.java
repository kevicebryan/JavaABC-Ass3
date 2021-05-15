import java.util.ArrayList;

public class Validation {
	//Name Validation
	public static boolean validShoeName(String name) {
		if(name.endsWith("shoe")) {
		return true;
		}else {
		return false;
		}
	}
		//Category Validation	
	public static boolean validShoeCat(String category) {
		if(category.equals("Boot")||category.equals("Running")||
			category.equals("Sneaker")) {
		return true;
		}else {
		return false;
		}
	}
	
		//DATE VALIDATION
	
	public static boolean validReleaseDate(String date) {
		if(date.matches("\\d{2}-\\d{2}-\\d{4}")) {
			//parsing the string to integers DD_MM_YYYY
			//								 0123456789
			//System.out.println(date);
			String day = date.substring(0,2);
			String month = date.substring(3,5);
			String year = date.substring(6,10);
			//System.out.println(day+" "+month+" "+year);
			
			int dayval = Integer.parseInt(day);
			int monthval = Integer.parseInt(month);
			int yearval = Integer.parseInt(year);
		
			if(validday(dayval) && validmonth(monthval) && validyear(yearval)) {
				return true;
			}else {
				return false;
			}
		}else {
		System.out.println("Wrong Format Bro!");
		return false;
		}
	}
	
	public static boolean validday(int day) {
		if (day >= 1 && day <= 30 ) {
		return true;
		}else {
		return false;
		}
	}
	public static boolean validmonth(int month) {
		if (month >= 1 && month <= 12 ) {
		return true;
		}else {
		return false;
		}
	}
	public static boolean validyear(int year) {
		if (year >= 2000 && year <= 2020 ) {
		return true;
		}else {
		return false;
		}
	}
	
		//	Valid Price
	public static boolean validPrice(Integer price) {
		if (price >= 5000) {
		return true;
		}else {
		return false;
		}
	}
	
	public static boolean uniqueID(String id, ArrayList<Shoe> shoes) {
		for(Shoe shoe: shoes) {
			if(id.equals(shoe.id)) {
				return false;
			}
		}
		return true;
	}
}
