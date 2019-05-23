package yatzy.samekind;

public class OnePair extends SameKind {
    public OnePair(int d1, int d2, int d3, int d4, int d5) {
        super(d1, d2, d3, d4, d5);
    }

    @Override
    protected Kind getKind() {
        return Kind.ONE_PAIR;
    }

}
