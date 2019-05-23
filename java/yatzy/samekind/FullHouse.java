package yatzy.samekind;

import yatzy.YatzyGame;

public class FullHouse implements YatzyGame {

    private final YatzyGame onePair;
    private final YatzyGame threeOfAKind;

    public FullHouse(int d1, int d2, int d3, int d4, int d5) {
        onePair = new OnePair(d1, d2, d3, d4, d5);
        threeOfAKind = new ThreeOfAKind(d1, d2, d3, d4, d5);
    }

    @Override
    public int score() {
        int onePairScore = onePair.score();
        int threeOfAKindScore = threeOfAKind.score();
        if (onePairScore == 0 || threeOfAKindScore == 0) {
            return 0;
        }
        return onePairScore + threeOfAKindScore;
    }
}
