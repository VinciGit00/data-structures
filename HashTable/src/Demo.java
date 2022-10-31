import Excpetions.NegAmountException;

public class Demo {

	public static void main(String[] args) throws NegAmountException {
		FinancialHistory f1 = new FinancialHistory(12);

		f1.receiveFrom("Lavoro", 1000);
		f1.receiveFrom("Vinted", 150);

		f1.spendFor("Pizza", 12);
		f1.spendFor("Telefono", 150);

		System.out.println(f1.printIncomes());
		System.out.println(f1.printExpenditures());

		System.out.println("Ricerca delle entrate: " + f1.receivedFrom("Lavoro"));
		System.out.println("Ricerca delle uscite: " + f1.spentFor("Pizza"));

		// Testiamo le eccezioni
		FinancialHistory f2 = new FinancialHistory(-12);
		FinancialHistory f3 = new FinancialHistory(12);
		f3.spendFor("Telefono", 1500);

	}

}
