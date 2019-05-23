package yatzy.samekind;

public class ThreeOfAKind extends SameKind {

    public ThreeOfAKind(int d1, int d2, int d3, int d4, int d5) {
        super(d1, d2, d3, d4, d5);
    }

    @Override
    protected Kind getKind() {
        return Kind.THREE_OF_A_KIND;
    }
}
