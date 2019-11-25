package operations;

import java.math.BigDecimal;

public class Multiplication extends Operations {
    public Multiplication(int priority) {
        super(priority);
    }

    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    @Override
    public Operations copy() {
        return new Multiplication(4);
    }
}
