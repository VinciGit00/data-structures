package Excpetions;

public class NegAmountException extends Exception {
	public NegAmountException() {
		super("Ammontare negativo");
	}
}
