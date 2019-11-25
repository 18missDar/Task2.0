package operations;

import java.math.BigDecimal;

public class Subtraction extends Operations {
    public Subtraction(int priority) {
        super(priority);
    }

    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    @Override
    public Operations copy() {
        return new Subtraction(3);
    }
}
