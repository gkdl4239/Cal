package Lv3Calculator.com.example.calculator2;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    private OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public static OperatorType fromSymbol(char symbol) {
        OperatorType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            OperatorType op = var1[var3];
            if (op.getSymbol() == symbol) {
                return op;
            }
        }

        throw new IllegalArgumentException("지원하지 않는 연산자입니다: " + symbol);
    }
}