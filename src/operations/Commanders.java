package operations;

public class Commanders {
    @Command(operator = "+")
    public Operations getSumOperator() {
        return new Addition(2);
    }

    @Command(operator = "-")
    public Operations getSubOperator() {
        return new Subtraction(3);
    }

    @Command(operator = "*")
    public Operations getMultOperator() {
        return new Multiplication(4);
    }

    @Command(operator = "/")
    public Operations getDivOperator() {
        return new Division(4);
    }

    @Command(operator = "(")
    public Operations getLeftBracket() {
        return new LeftBracket(0);
    }

    @Command(operator = ")")
    public Operations getRightBracket() {
        return new RightBracket(1);
    }
}
