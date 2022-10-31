package Excpetions;

public class SpentNotFounException extends Exception {
	public SpentNotFounException() {
		super("Spesa non trovata");
	}
}
