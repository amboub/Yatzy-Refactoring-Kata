import org.junit.jupiter.api.Test;
import yatzy.samekind.FullHouse;
import yatzy.straight.LargeStraight;
import yatzy.straight.SmallStraight;
import yatzy.samekind.FourOfAKind;
import yatzy.samekind.ThreeOfAKind;
import yatzy.samekind.TwoPair;
import yatzy.simple.Chance;
import yatzy.simple.Fives;
import yatzy.simple.Fours;
import yatzy.samekind.OnePair;
import yatzy.simple.Ones;
import yatzy.simple.Sixes;
import yatzy.simple.Threes;
import yatzy.simple.Twos;
import yatzy.simple.Yatzy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YatzyTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = new Chance(2,3,4,5,1).score();
        assertEquals(expected, actual);
        assertEquals(16, new Chance(3,3,4,5,1).score());
    }

    @Test public void yatzy_scores_50() {
        int expected = 50;
        int actual = new Yatzy(4,4,4,4,4).score();
        assertEquals(expected, actual);
        assertEquals(50, new Yatzy(6,6,6,6,6).score());
        assertEquals(0, new Yatzy(6,6,6,6,3).score());
    }

    @Test
    public void test_1s() {
        assertTrue(new Ones(1,2,3,4,5).score() == 1);
        assertEquals(2, new Ones(1,2,1,4,5).score());
        assertEquals(0, new Ones(6,2,2,4,5).score());
        assertEquals(4, new Ones(1,2,1,1,1).score());
    }

    @Test
    public void test_2s() {
        assertEquals(4, new Twos(1,2,3,2,6).score());
        assertEquals(10, new Twos(2,2,2,2,2).score());
    }

    @Test
    public void test_threes() {
        assertEquals(6, new Threes(1,2,3,2,3).score());
        assertEquals(12, new Threes(2,3,3,3,3).score());
    }

    @Test
    public void fours_test()
    {
        assertEquals(12, new Fours(4,4,4,5,5).score());
        assertEquals(8, new Fours(4,4,5,5,5).score());
        assertEquals(4, new Fours(4,5,5,5,5).score());
    }

    @Test
    public void fives() {
        assertEquals(10, new Fives(4,4,4,5,5).score());
        assertEquals(15, new Fives(4,4,5,5,5).score());
        assertEquals(20, new Fives(4,5,5,5,5).score());
    }

    @Test
    public void sixes_test() {
        assertEquals(0, new Sixes(4,4,4,5,5).score());
        assertEquals(6, new Sixes(4,4,6,5,5).score());
        assertEquals(18, new Sixes(6,5,6,6,5).score());
    }


    @Test
    public void one_pair() {
        assertEquals(6, new OnePair(3,4,3,5,6).score());
        assertEquals(10, new OnePair(5,3,3,3,5).score());
        assertEquals(12, new OnePair(5,3,6,6,5).score());
        assertEquals(6, new OnePair(3,3,3,3,1).score());
        assertEquals(6, new OnePair(3,3,3,4,1).score());
    }

    @Test
    public void two_Pair() {
        assertEquals(16, new TwoPair(3,3,5,4,5).score());
        assertEquals(16, new TwoPair(3,3,5,5,5).score());
    }

    @Test
    public void three_of_a_kind()
    {
        assertEquals(9, new ThreeOfAKind(3,3,3,4,5).score());
        assertEquals(15, new ThreeOfAKind(5,3,5,4,5).score());
        assertEquals(9, new ThreeOfAKind(3,3,3,3,5).score());
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, new FourOfAKind(3,3,3,3,5).score());
        assertEquals(20, new FourOfAKind(5,5,5,4,5).score());
        assertEquals(9, new ThreeOfAKind(3,3,3,3,3).score());
    }

    @Test
    public void smallStraight() {
        assertEquals(15, new SmallStraight(1,2,3,4,5).score());
        assertEquals(15, new SmallStraight(2,3,4,5,1).score());
        assertEquals(0, new SmallStraight(1,2,2,4,5).score());
    }


    @Test
    public void largeStraight() {
        assertEquals(20, new LargeStraight(6,2,3,4,5).score());
        assertEquals(20, new LargeStraight(2,3,4,5,6).score());
        assertEquals(0, new LargeStraight(1,2,2,4,5).score());
    }


    @Test
    public void fullHouse() {
        assertEquals(18, new FullHouse(6,2,2,2,6).score());
        assertEquals(0, new FullHouse(2,3,4,5,6).score());
    }
}
