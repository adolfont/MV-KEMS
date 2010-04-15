package mvkems.formulas;

import java.util.ArrayList;
import java.util.List;

public class LnLogic {

	public static enum connectives {
		NOT, IMPLIES
	}

	private int n;
	private List<Float> values;

	public LnLogic(int n) {
		if (n < 2)
			throw new IndexOutOfBoundsException();

		this.n = n;
		values = new ArrayList<Float>(n);
		for (int i = 0; i < n; i++) {
			values.add(i, i * 1f / (n - 1));
		}
	}

	public float getTruthValue(int i) {
		return values.get(i);
	}

	public float getLastTruthValue() {
		return values.get(n - 1);
	}

}
