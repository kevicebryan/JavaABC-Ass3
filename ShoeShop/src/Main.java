import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Shoe> shoes = new ArrayList<Shoe>();
		int choice = -1;
		do {
			printMenu();
			choice = scan.nextInt();
			scan.nextLine();
			if (choice == 1) {
				Shoe.viewShoe(shoes);
				System.out.print("Press enter to continue....");
				scan.nextLine();
			}else if (choice == 2){
				Shoe.addShoe(shoes);
				System.out.print("Press enter to continue....");
				scan.nextLine();
			}else if (choice == 3){
				Shoe.delShoe(shoes);
				System.out.print("Press enter to continue....");
				scan.nextLine();
			}else if (choice == 4) {
				System.out.println("Thannks for using the app!");
			}else {
				System.out.println("1-4 bro....");
			}
		}while(choice != 4);
	}
	
	public static void printMenu() {
		System.out.println("Shoe Shop");
		System.out.println("=========");
		System.out.println("1. View Shoe");
		System.out.println("2. Add Shoe");
		System.out.println("3. Delete Shoe");
		System.out.println("4. Exit");
		System.out.print(">> ");
	}
}
