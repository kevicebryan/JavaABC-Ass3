import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Shoe {
	String id;
	String name;
	String category;
	String date;
	Integer price;
	
	
	public Shoe (String id, String name, String category, String date, Integer 
			price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.date = date;
		this.price = price;
	}
	
	public static String generateID() {
		String id = "SH";
		double x = Math.random();
		int xid = (int) (x*10);
		double y = Math.random();
		int yid = (int) (y*10);
		double z = Math.random();
		int zid = (int) (z*10);
		id = id + xid + yid + zid;
		
		return id;
	}
	
	public static void viewShoe(ArrayList<Shoe> shoes){
		Scanner scan = new Scanner(System.in);
		if (shoes.size() == 0) {
			System.out.println("No shoes available...");
//			System.out.print("Press enter to continue...");
//			scan.nextLine();
			return;
		}else {
			int count= 1;
			for(Shoe shoe: shoes) {
				System.out.printf("%d %s-%s\n", count, shoe.name, shoe.id);
				System.out.println("====================");
				System.out.println("Category: "+shoe.category);
				System.out.println("Release date: "+shoe.date);
				System.out.println("Price: "+shoe.price);
				System.out.println("");
				count++;
			}
		}
	}
	
	public static ArrayList<Shoe> delShoe(ArrayList<Shoe>shoes){
		viewShoe(shoes);
		int len = shoes.size();
		if(len == 0) {
			return shoes;
		}
		
		int choice = -1;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.printf("Choose shoe's number to delete[1..%d]: ", len);
			choice = scan.nextInt();
			scan.nextLine();
		}while(choice <= 0 || choice > len );
		
		shoes.remove(choice-1);
		System.out.println("Shoe removed!");
		
		return shoes;
	}
	
	public static ArrayList<Shoe> addShoe(ArrayList<Shoe> shoes){
		String name, date, category, id;
		Scanner scan = new Scanner(System.in);
		Integer price;
		
		do {
			System.out.print("Input shoe name [ends with shoe]: ");
			name = scan.nextLine();
		}while(!Validation.validShoeName(name));
		
		do {
			System.out.print("Input shoe category [Sneaker/Running/Boot]: ");
			category = scan.nextLine();
		}while(!Validation.validShoeCat(category));
		
		do {
			System.out.print("Input release date [dd-mm-yyyy]: ");
			date = scan.nextLine();
		}while(!Validation.validReleaseDate(date));
		
		do {
			System.out.print("Input shoe price [>= 5000]: ");
			price = scan.nextInt();
			scan.nextLine();
		}while(!Validation.validPrice(price));
		
		do {
			id = Shoe.generateID();
		}while(!Validation.uniqueID(id, shoes));
		
		Shoe tempShoe = new Shoe(id, name, category, date, price);
		shoes.add(tempShoe);
		
		System.out.println("Shoe added!");
		System.out.println(tempShoe.id);
//		System.out.print("Press enter to continue...");
//		scan.nextLine();
		
		return shoes;
	}


}

