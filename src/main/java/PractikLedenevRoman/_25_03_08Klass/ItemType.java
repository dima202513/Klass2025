package PractikLedenevRoman._25_03_08Klass;

import java.util.function.UnaryOperator;

public enum ItemType {
    ELECTRONICS {
        @Override
        public UnaryOperator<Double> getDiscountFunction() {
            return price -> price * 0.9;
        }
    },
    CLOTHING {
        @Override
        public UnaryOperator<Double> getDiscountFunction() {
            return price -> (price * 0.2 < 500) ? price * 0.8 : price - 500;
        }
    },
    GROCERIES {
        @Override
        public UnaryOperator<Double> getDiscountFunction() {
            return price -> price - 50;
        }
    },
    BOOKS {
        @Override
        public UnaryOperator<Double> getDiscountFunction() {
            return price -> (price > 1000) ? price * 0.95 : price;
        }
    };

    public abstract UnaryOperator<Double> getDiscountFunction();
}
