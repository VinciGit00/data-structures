
public class Basic_calculator {

	public static int calculate(String s) {
		int res = 0;

		int currentNumber = 0;
		int previousNumber = 0;
		char operationeration = '+';

		for (int i = 0; i < s.length(); i++) {

			// Temporary digit
			char temp = s.charAt(i);

			if (Character.isDigit(temp))
				currentNumber = currentNumber * 10 + (temp - '0');

			if (!Character.isDigit(temp) && temp != ' ' || i == s.length() - 1) {
				if (operationeration == '+' || operationeration == '-') {
					res += previousNumber;
					if (operationeration == '+')
						previousNumber = currentNumber;
					else
						previousNumber = -currentNumber;
				} else if (operationeration == '*')
					previousNumber *= currentNumber;
				else if (operationeration == '/')
					previousNumber /= currentNumber;

				operationeration = temp;
				currentNumber = 0;
			}

		}

		return res + previousNumber;
	}

	public static void main(String[] args) {

		String stringa = "30*2+4";

		System.out.println(calculate(stringa));
	}
}
