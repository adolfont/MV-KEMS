package mvkems.formulas;

import org.junit.Test;
import static org.junit.Assert.*;

public class LnLogicTests {

	private float delta = 0.00001f;

	@Test(expected = IndexOutOfBoundsException.class)
	public void create_an_invalid_LnLogic() {
		new LnLogic(1);
	}
	
	
	@Test
	public void create_a_LnLogic_and_verifyItsValues() {
		for (int size = 2; size < 10; size++) { // starts with 2!
			LnLogic ln = new LnLogic(size);

			for (int i = 0; i < size; i++) {
				assertEquals(i * 1f / (size-1), ln.getTruthValue(i), delta);
			}
		}
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void tryToGetAnOutOfBoundsValue() {
		LnLogic ln = new LnLogic(3);
		ln.getTruthValue(3); // note that values go from 0 to n-1!!
	}

	@Test
	public void verifyIfConnectivesWereDefined() {
		assertNotNull(LnLogic.connectives.NOT);
		assertNotNull(LnLogic.connectives.IMPLIES);
	}

	@Test
	public void getLastTruthValue() {
		LnLogic ln = new LnLogic(10);
		assertEquals(1f, ln.getLastTruthValue(), delta);
	}
}
