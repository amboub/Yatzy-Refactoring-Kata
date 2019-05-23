package yatzy.samekind;

import yatzy.YatzyGame;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class SameKind implements YatzyGame {
    List<Integer> diceValues;

    protected SameKind(int d1, int d2, int d3, int d4, int d5) {
        diceValues = List.of(d1, d2, d3, d4, d5);
    }

    protected abstract Kind getKind();

    @Override
    public int score() {
        return diceValues.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(getKind().sameKindPredicate())
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .reduce(0, getKind().reducer()) * getKind().multiplicator();
    }
}
