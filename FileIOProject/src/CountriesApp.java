import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String country = "";
		int menuNum = 0;

		System.out.println("Welcome to Countries Maintenance Application: ");
		System.out.println("1 - See the list of countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Delete a country");
		System.out.println("4 - Exit");

		while (true) {
			System.out.println();
			menuNum = Validator
					.getIntInRange(sc, "Enter a menu number: ", 1, 4);

			switch (menuNum) {
			case 1:
				CountriesTextFileExtended.printCountries();
				break;
			case 2:
				System.out.println("Enter Country: ");
				country = sc.nextLine();
				CountriesTextFileExtended.writeFile(country);
				break;
			case 3:
				System.out.println("Enter Country to delete: ");
				country = sc.next();				
				CountriesTextFileExtended.removeFromFile(country);
				break;
			case 4:
				System.out.println("Buh-bye!");
				System.exit(0);

			default:
				break;
			}

		}
	}

}
