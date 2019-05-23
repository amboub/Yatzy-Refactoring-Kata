package yatzy.simple;

import yatzy.YatzyGame;

import java.util.stream.IntStream;

public class Yatzy implements YatzyGame {
    private IntStream intStream;

    public Yatzy(int d1, int d2, int d3, int d4, int d5) {
        intStream = IntStream.of(d1, d2, d3, d4, d5);
    }

    @Override
    public int score() {
        return intStream.distinct().count() == 1 ? 50 : 0;
    }
}
