package Es1;

import java.util.ArrayList;
import java.util.Iterator;

import Es2.DuplicatedObject;

public class main {

	public static void main(String[] args) {

		// First test
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);

		DuplicatedObject obj = new DuplicatedObject();

		boolean result = obj.verificaDupIterator(al);

		System.out.println("First test:  "+result);

		// Second Test
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(4);
		al2.add(6);
		al2.add(7);

		boolean result2 = obj.verificaDupIterator(al2);

		System.out.println("Second test: "+result2);
	}
}
