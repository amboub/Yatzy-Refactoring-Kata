package yatzy.samekind;

import java.util.Map;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

enum Kind {
    ONE_PAIR {
        @Override
        protected int multiplicator() {
            return 2;
        }

        @Override
        protected IntBinaryOperator reducer() {
            return Integer::max;
        }

        @Override
        public Predicate<Map.Entry<Integer, Long>> sameKindPredicate() {
            return entry -> entry.getValue() >= multiplicator();
        }
    },
    DISCTINCT_ONE_PAIR {
        @Override
        protected int multiplicator() {
            return 2;
        }

        @Override
        protected IntBinaryOperator reducer() {
            return Integer::max;
        }

        @Override
        public Predicate<Map.Entry<Integer, Long>> sameKindPredicate() {
            return entry -> entry.getValue() == multiplicator();
        }
    },
    TWO_PAIRS {
        @Override
        protected int multiplicator() {
            return 2;
        }

        @Override
        public Predicate<Map.Entry<Integer, Long>> sameKindPredicate() {
            return entry -> entry.getValue() >= multiplicator();
        }
    },
    THREE_OF_A_KIND {
        @Override
        protected int multiplicator() {
            return 3;
        }

        @Override
        public Predicate<Map.Entry<Integer, Long>> sameKindPredicate() {
            return entry -> entry.getValue() >= multiplicator();
        }
    },
    FOUR_OF_A_KIND {
        @Override
        protected int multiplicator() {
            return 4;
        }

        @Override
        public Predicate<Map.Entry<Integer, Long>> sameKindPredicate() {
            return entry -> entry.getValue() >= multiplicator();
        }
    };

    protected abstract int multiplicator();

    protected IntBinaryOperator reducer() {
        return Integer::sum;
    }

    public abstract Predicate<Map.Entry<Integer, Long>> sameKindPredicate();
}
