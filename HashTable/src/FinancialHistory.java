import java.util.Hashtable;

import Excpetions.IncomeNotFoundException;
import Excpetions.NegAmountException;
import Excpetions.SpentNotFounException;

public class FinancialHistory implements FinancialHistoryIF {

	private float cashOnHand;
	private Hashtable<String, Float> incomes;
	private Hashtable<String, Float> expenditures;

	FinancialHistory(float amount) {
		try {
			this.cashOnHand = amount;
			this.incomes = new Hashtable<String, Float>();
			this.expenditures = new Hashtable<String, Float>();

			if (amount <= 0)
				throw new NegAmountException();

		} catch (NegAmountException e) {
			System.out.println(e.toString());
		}
	}

	public float cashOnHand() {
		return this.cashOnHand;
	}

	float receivedFrom(String s) {
		try {
			if (!(incomes.containsKey(s)))
				throw new IncomeNotFoundException();

		} catch (IncomeNotFoundException e) {
			System.out.println(e.toString());
		}
		return incomes.get(s);
	}

	public float spentFor(String s) {
		try {
			if (expenditures.size() == 0)
				throw new NullPointerException();

			else if (!(expenditures.containsKey(s)))
				throw new SpentNotFounException();
		} catch (SpentNotFounException e) {
			System.out.println(e.toString());
		} catch (NullPointerException e) {
			System.out.println(e.toString());

		}
		return expenditures.get(s);
	}

	public void receiveFrom(String s, float amount) {
		incomes.put(s, amount);
		this.cashOnHand += amount;
	}

	public void spendFor(String s, float amount) {

		expenditures.put(s, amount);
		try {
			this.cashOnHand -= amount;
			if (cashOnHand <= 0)
				throw new NegAmountException();
		} catch (NegAmountException e) {
			System.out.println(e.toString());
		}
	}

	public String printIncomes() {
		var wrapper = new Object() {
			String r = "";
		};

		this.incomes.forEach((k, v) -> {

			wrapper.r += "Nome dell'entrata: " + k + ", ammontare: " + v + "\n";
		});

		return wrapper.r;
	}

	public String printExpenditures() {
		var wrapper = new Object() {
			String r = "";
		};

		this.expenditures.forEach((k, v) -> {

			wrapper.r += "Nome della spesa: " + k + ", ammontare: " + v + "\n";
		});

		return wrapper.r;
	}

}
