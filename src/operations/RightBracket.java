package operations;

import java.math.BigDecimal;

public class RightBracket extends Operations {
    public RightBracket(int priority) {
        super(priority);
    }

    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return null;
    }

    @Override
    public Operations copy() {
        return new RightBracket(1);
    }
}
