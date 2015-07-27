package de.leifaktor.gdxrobbie.condition.number;

import de.leifaktor.gdxrobbie.logic.Game;

public class NumberEvaluator {

	private Game game;
	
	public NumberEvaluator(Game g) {
		this.game = g;
	}
	
	public int eval(Number n) {
		switch (n.getVariableID()) {
		case Number.CONSTANT:
			return ((ConstantNumber) n).getValue();
		case Number.DIFFERENCE:
			return eval(((DifferenceNumber) n).getMinuend()) - eval(((DifferenceNumber) n).getSubtrahend());
		case Number.SUM:
			return eval(((SumNumber) n).getFirstSummand()) + eval(((SumNumber) n).getSecondSummand());
		case Number.PRODUCT:
			return eval(((ProductNumber) n).getFirstFactor()) * eval(((ProductNumber) n).getSecondFactor());
		case Number.QUOTIENT:
			return eval(((QuotientNumber) n).getDividend()) / eval(((QuotientNumber) n).getDivisor());
		case Number.REMAINDER:
			return eval(((RemainderNumber) n).getDividend()) % eval(((RemainderNumber) n).getDivisor());
		}
		
		
		return 0;
	}
	
}
