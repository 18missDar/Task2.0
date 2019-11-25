package operations;

import java.math.BigDecimal;

public class Division extends Operations {
    public Division(int priority) {
        super(priority);
    }

    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.divide(b);
    }

    @Override
    public Operations copy() {
        return new Division(4);
    }
}
