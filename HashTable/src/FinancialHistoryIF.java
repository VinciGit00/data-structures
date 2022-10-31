
/**
 * The Interface FinancialHistoryIF.
 */
public interface FinancialHistoryIF {

	/**
	 * Ritorna il bilancio
	 *
	 * @return the float
	 */
	float cashOnHand();

	/**
	 * Restituisce la cifra della spesa
	 *
	 * @param s the s
	 * @return the float
	 */
	float spentFor(String s);

	/**
	 * Inserisce una entrata
	 *
	 * @param s      the s
	 * @param amount the amount
	 */
	void receiveFrom(String s, float amount);

	/**
	 * Inserisce una spesa
	 *
	 * @param s      the s
	 * @param amount the amount
	 */
	void spendFor(String s, float amount);

	/**
	 * Stampa le entrate
	 *
	 * @return the string
	 */
	String printIncomes();

	/**
	 * Stampa le spese
	 *
	 * @return the string
	 */
	String printExpenditures();
}
