package ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parentheses {
	public static boolean isValid1(String s) {
		if ((s.length() % 2) != 0)
			return false;

		// Count of occurencies
		long a = s.chars().filter(ch -> ch == '(').count();
		long b = s.chars().filter(ch -> ch == ')').count();

		long c = s.chars().filter(ch -> ch == '[').count();
		long d = s.chars().filter(ch -> ch == +']').count();

		long e = s.chars().filter(ch -> ch == '{').count();
		long f = s.chars().filter(ch -> ch == '}').count();

		if (a != b || c != d || e != f)
			return false;

		int targettoReach = s.length() / 2;

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char var = s.charAt(i);
			if (var == '(' || var == '[' || var == '{') {
				for (int j = i + 1; j < s.length(); j++) {

					if ((var == '(' && s.charAt(j) == ')') || (var == '[' && s.charAt(j) == ']')
							|| (var == '{' && s.charAt(j) == '}')) {
						count++;
						break;
					}

					;

				}
			}
		}

		if (count != targettoReach)
			return false;

		return true;

	}

	// best solution yet
	public static boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<>();

		for (final char c : s.toCharArray())
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			// Il secondo or fa sempre una pop-> quindi toglie l'elemento
			else if (stack.isEmpty() || stack.pop() != c)
				return false;

		return stack.isEmpty();
	}

	public boolean isValid2(String s) {
		if ((s.length() % 2) != 0)
			return false;

		// Count of occurencies
		long a = s.chars().filter(ch -> ch == '(').count();
		long b = s.chars().filter(ch -> ch == ')').count();

		long c = s.chars().filter(ch -> ch == '[').count();
		long d = s.chars().filter(ch -> ch == +']').count();

		long e = s.chars().filter(ch -> ch == '{').count();
		long f = s.chars().filter(ch -> ch == '}').count();

		if (a != b || c != d || e != f)
			return false;

		// Idea: in the first half is for open and the second half is for closing
		for (int i = 0; i < s.length() / 2; i++) {
			char var = s.charAt(i);
			if (var == '(' && s.charAt(s.length() - i) != ')') {
				return false;
			} else if (var == '[' && s.charAt(s.length() - i) != ']') {
				return false;

			} else if (var == '{' && s.charAt(s.length() - i) != '}') {
				return false;

			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println("()) " + isValid("())"));

		System.out.println("() " + isValid("()"));
		System.out.println("[] " + isValid("[]"));
		System.out.println("[()] " + isValid("[()]"));
		System.out.println("{[()]} " + isValid("{[()]}"));

		System.out.println("{[(])} " + isValid("{[(])} "));

		System.out.println("{[]} " + isValid("{[]}"));
		System.out.println("([)] " + isValid("([)]"));

		System.out.println("] " + isValid("]"));
		System.out.println("[[[] " + isValid("[[[]"));

		System.out.println("([]) " + isValid("([])"));
		System.out.println("()[]{}" + isValid("()[]{}"));

		System.out.println("([)] " + isValid("([)]"));

		System.out.println("({{{{}}}))" + isValid("({{{{}}}))"));
	}

}
