package mvkems.formulas;

import java.util.HashMap;
import java.util.Map;

public class Valuation {

	private Map<Formula, Float> valuationMap;

	public Valuation() {
		valuationMap = new HashMap<Formula, Float>();
	}

	public void setValue(Formula f, float v) {
		valuationMap.put(f, Float.valueOf(v));
	}

	public float getValue(Formula f) {
		if (valuationMap.get(f) != null)
			return valuationMap.get(f).floatValue();
		else {
			if (f instanceof CompositeFormula)
				return getValuationForCompositeFormula(f);
			else
				throw new RuntimeException("UNDEFINED");
		}
	}

	private float getValuationForCompositeFormula(Formula f) {
		CompositeFormula cf = (CompositeFormula) f;

		if (cf.getConnective() == L3Logic.connectives.NOT) {
			return 1f - valuationMap.get(cf.getFormula());
		} else
			throw new RuntimeException("UNDEFINED");
	}

}
