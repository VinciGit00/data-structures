package Docker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The Class DocekerRead.
 */
public class DocekerRead {

	/**
	 * Read the txt dile
	 *
	 * @return the array list
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	static ArrayList read() throws IOException {
		File file = new File("ToRead.txt");

		// Note: Double backquote is to avoid compiler

		// Creating an object of BufferedReader class
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// catch block
			e.printStackTrace();
		}

		// String to read
		String st;

		ArrayList<Integer> a = new ArrayList<Integer>();

		while ((st = br.readLine()) != null) {
			// Print the string

			a.add(Integer.parseInt(st));
		}

		return a;
	}

	/**
	 * Prints the array list.
	 *
	 * @param numbers the numbers
	 */
	static void printArrayList(ArrayList<Integer> numbers) {
		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * Result: takes the elements of the arrayList and return the sum.
	 *
	 * @param numbers the numbers
	 * @return the int
	 */
	static int result(ArrayList<Integer> numbers) {
		int sum = 0;
		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {

			int number = it.next();
			sum += number;
		}
		return sum;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Data read:");
		ArrayList read = read();
		printArrayList(read);
		System.out.println("result:" + result(read));
	}

}
