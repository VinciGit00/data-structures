package Es1;

public class CoinBox {

	int nMonete;

	public CoinBox() {
		nMonete = 0;
	}

	public int getNmonete() {
		return nMonete;
	}

	public void insertCoin() {
		nMonete++;
	}

	public boolean erogaProdotto() {
		if (nMonete >= 2) {
			nMonete -= 2;
			return true;
		}

		return false;
	}
}
