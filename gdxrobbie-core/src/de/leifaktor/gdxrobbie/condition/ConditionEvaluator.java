package de.leifaktor.gdxrobbie.condition;

import de.leifaktor.gdxrobbie.logic.Game;

public class ConditionEvaluator {
	
	private Game game;
	
	public ConditionEvaluator(Game g) {
		this.game = g;
	}
	
	public boolean eval(Condition c) {
		if (c instanceof AndCondition) {
			return eval(((AndCondition) c).getA()) && eval(((AndCondition) c).getB());
		} else if (c instanceof OrCondition) {
			return eval(((OrCondition) c).getA()) || eval(((OrCondition) c).getB());
		} else if (c instanceof NotCondition) {
			return !eval(((NotCondition) c).getA());
		}
		return false;
	}
	
}
