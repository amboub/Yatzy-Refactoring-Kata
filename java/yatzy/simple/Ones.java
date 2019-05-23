package yatzy.simple;

import java.util.function.IntPredicate;

public class Ones extends SimpleYatzy {
    public Ones(int d1, int d2, int d3, int d4, int d5) {
        super(d1, d2, d3, d4, d5);
    }

    @Override
    protected IntPredicate predicate() {
        return diceValue -> diceValue == 1;
    }
}
