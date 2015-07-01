import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;

public class CountriesTextFile {

	static ArrayList<String> countries = null;
	static Path path = Paths.get("C:\\Users\\priya\\work\\FileIOProject\\countries.txt");
	static File countriesFile = path.toFile();

	public static void readFileAndSaveToCountries() {
		countries = new ArrayList<String>();
		try (BufferedReader in = new BufferedReader(new FileReader(
				countriesFile))) {
			String line = in.readLine();
			while (line != null) {
				countries.add(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found!!!");
		} catch (IOException e) {
			System.out.println("Error Reading File!!!");
		}
		
	}

	public static void writeFile(String s) {

		try (PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter(countriesFile, true)))) {
			out.println(s);
			System.out.println(s + " has been saved to file");

		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

	public static void printCountries() {
		readFileAndSaveToCountries();
		for (String string : countries) {
			System.out.println(string);
		}

	}

}
