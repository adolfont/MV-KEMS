package mvkems.formulas;

import mvkems.formulas.LnLogic.connectives;


public class CompositeFormula implements Formula {
	
	private connectives conn;
	private Formula f;

	public CompositeFormula(connectives conn, Formula f) {
		this.conn = conn;
		this.f = f;
	}

	public connectives getConnective() {
		return conn;
	}

	public Formula getFormula() {
		return f;
	}


}
