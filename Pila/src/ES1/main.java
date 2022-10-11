package ES1;

import java.util.LinkedList;

/**
 * 
 * @author Marco Vinciguerra
 * @year 2022-2023
 */

public class main {

	public static void main(String[] args) {

		LinkedList al = new LinkedList();
		CodaComposition cc = new CodaComposition(al);
		cc.offer(1);
		cc.offer(2);
		cc.offer(3);
		cc.offer(4);
		cc.offer(5);

		System.out.println("Before poll: " + cc.toString());

		cc.poll();
		cc.poll();

		System.out.println("After poll:  " + cc.toString());

	}

}
