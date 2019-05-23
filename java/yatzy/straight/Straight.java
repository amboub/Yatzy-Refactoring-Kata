package yatzy.straight;

import yatzy.YatzyGame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class Straight implements YatzyGame {

    private final List<Integer> diceValues;

    public Straight(int d1, int d2, int d3, int d4, int d5) {
        diceValues = List.of(d1, d2, d3, d4, d5).stream().sorted().collect(Collectors.toList());
    }

    @Override
    public int score() {
        boolean isStraight = IntStream.range(0, 5)
                .filter(counter -> diceValues.get(counter) == counter + getStartIndex())
                .count() == diceValues.size();

        return isStraight ? diceValues.stream().mapToInt(Integer::intValue).sum() : 0;
    }

    protected abstract int getStartIndex();
}
