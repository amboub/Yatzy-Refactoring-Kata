package yatzy.straight;

public class SmallStraight extends Straight {

    public SmallStraight(int d1, int d2, int d3, int d4, int d5) {
        super(d1, d2, d3, d4, d5);
    }

    @Override
    protected int getStartIndex() {
        return 1;
    }
}
