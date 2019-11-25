package operations;

import java.math.BigDecimal;

public class Addition extends Operations {
    public Addition(int priority) {
        super(priority);
    }

    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    @Override
    public Operations copy() {
        return new Addition(2);
    }
}
