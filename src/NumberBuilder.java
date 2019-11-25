import java.math.BigDecimal;

public class NumberBuilder {
    private StringBuilder number = new StringBuilder("");

    public BigDecimal createNumber() {
        String copy = number.toString();
        if (number != null && !copy.equals("")) {
            number = new StringBuilder("");
            return new BigDecimal(copy);
        }
        return null;
    }

    public void put(Character ch) {
        number.append(ch);
    }
}
