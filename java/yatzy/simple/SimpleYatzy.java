package yatzy.simple;

import yatzy.YatzyGame;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public abstract class SimpleYatzy implements YatzyGame {
    protected IntStream intStream;

    protected SimpleYatzy(int d1, int d2, int d3, int d4, int d5) {
        intStream = IntStream.of(d1, d2, d3, d4, d5);
    }

    protected abstract IntPredicate predicate();

    @Override
    public int score() {
        return intStream
                .filter(predicate())
                .sum();
    }
}
