package Task2;

import java.util.Scanner;

public class Om_s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		omDatabase db = new omDatabase();
		while (true) {
			System.out.println("\n1. Add Member");
			System.out.println("2. Get Member by ID");
			System.out.println("3. All Member"); // not completed
			System.out.println("4. Update Member detail");
			System.out.println("5. Delete Member");
			System.out.println("6. Exit");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // use these

			switch (choice) {
			case 1:
				System.out.println("Enter name: ");
				String name = sc.nextLine();

				System.out.println("Enter email: ");
				String email = sc.nextLine();

				System.out.println("Enter phoneno");
				String phoneno = sc.nextLine();

				db.addOm(name, email, phoneno);
				break;

			case 2:
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				Om om = db.getOm(id);

				if (om != null) {
					System.out.println("\nMember found: " + om);
				}

				else {
					System.out.println("\nNo member found");
				}
				break;

			case 3:
				System.out.println("\nAll member are: ");
				for (Om am : db.getAllOm()) {
					System.out.println(am);
				}
				break;

			case 4:
				System.out.println("\nEnter ID: ");
				id = sc.nextInt();
				sc.nextLine();

				om = db.getOm(id);
				if (om == null) {
					System.out.println("\nNot member found !");
					break;
				}

				System.out.println("\nEnter your choice: ");
				System.out.println("1 for Update Name: ");
				System.out.println("2 for Update Email: ");
				System.out.println("3 for Update Phone No: ");

				int choices = sc.nextInt();
				sc.nextLine();

				switch (choices) {

				case 1:
					System.out.println("Update Name: ");
					name = sc.nextLine();
					db.updateOm(id, name, om.getEmail(), om.getPhoneno());
					System.out.println("Name updated !");
					break;

				case 2:
					System.out.println("Update Email: ");
					email = sc.nextLine();
					db.updateOm(id, om.getName(), email, om.getPhoneno());
					System.out.println("Email updated !");
					break;

				case 3:
					System.out.println("Update phoneno: ");
					phoneno = sc.nextLine();
					db.updateOm(id, om.getName(), om.getEmail(), phoneno);
					System.out.println("Phoneno updated !");
					break;
				}

				break;

			case 5:
				System.out.println("Enter Id: ");
				id = sc.nextInt();
				sc.nextLine();

				if (db.deleteOm(id)) {
					System.out.println("Member detail deleted!");
				}

				else {
					System.out.println("Member not found!");
				}

				break;

			case 6:
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
