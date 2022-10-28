import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class CounterTest {

	@Test
	void testInc() {
		Counter c = new Counter();

		assertEquals(c.inc(), 1);
	}

	@Test
	public void testDec() {
		Counter c = new Counter();

		assertEquals(c.dec(), -1);
	}

	@Test
	public void tesException() {
		assertThrows(ArithmeticException.class, () -> {
			int a = 2 / 0;
		});
	}

	private int nexec;
	private int result;

	CounterTest(int n, int r) {
		this.nexec = n;
		this.result = r;
	}

	// Mi prende i parametri e li inserisce ne. metodo precedente
	@Parameters
	public static Collection getParametri() {
		return Arrays.asList(new Object[][] { { 1, 1 }, { 2, 2 }, { 3, 3 } });

	}

	@Test
	public void testParametrico() {
		Counter c = new Counter();
		int val = 0;
		for (int i = 0; i < nexec; i++) {
			val = c.inc();

		}
		// result è quello che ottengo da getParametri
		assertEquals(result, val);

	}
}
