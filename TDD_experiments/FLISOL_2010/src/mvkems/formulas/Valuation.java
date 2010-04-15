package mvkems.formulas;

import java.util.HashMap;
import java.util.Map;

public class Valuation {

	private Map<Formula, Float> valuationMap;
	private LnLogic ln;

	public Valuation(LnLogic ln) {
		valuationMap = new HashMap<Formula, Float>();
		this.ln = ln;
	}

	public void setValue(Formula f, float v) {
		valuationMap.put(f, Float.valueOf(v));
	}

	public float getValue(Formula f)  {
		if (valuationMap.get(f) != null)
			return valuationMap.get(f).floatValue();
		else {
			if (f instanceof CompositeFormula)
				return getValuationForCompositeFormula(f);
			else
				throw new UnassignedValueException();
		}
	}

	private float getValuationForCompositeFormula(Formula f)  {
		CompositeFormula cf = (CompositeFormula) f;

		if (cf.getConnective() == LnLogic.connectives.NOT) {
			return ln.getLastTruthValue() - getValue(cf.getFormula());
		} else
			throw new UnassignedValueException();
	}

}
