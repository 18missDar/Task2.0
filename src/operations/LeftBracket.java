package operations;

import java.math.BigDecimal;

public class LeftBracket extends Operations {
    public LeftBracket(int priority) {
        super(priority);
    }

    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return null;
    }

    @Override
    public Operations copy() {
        return new LeftBracket(0);
    }
}
