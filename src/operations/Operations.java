package operations;

import java.math.BigDecimal;

public abstract class Operations {
    public int priority;

    public Operations(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public boolean compare(Operations op) {
        return this.priority <= op.getPriority() ? true : false;
    }

    public abstract BigDecimal execute(BigDecimal a, BigDecimal b);

    public abstract Operations copy();

}
