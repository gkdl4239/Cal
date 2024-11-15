package Lv3Calculator.com.example.calculator2;


public class Calculator2<T extends Number, U extends Number> {
    private final T num1;
    private final U num2;

    public Calculator2(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number calculate(OperatorType op) {
        if (this.num1 instanceof Integer && this.num2 instanceof Integer) {
            int n1 = this.num1.intValue();
            int n2 = this.num2.intValue();
            return this.intCal(n1, n2, op);
        } else {
            double n1 = this.num1.doubleValue();
            double n2 = this.num2.doubleValue();
            return this.doubleCal(n1, n2, op);
        }
    }

    public int intCal(int n1, int n2, OperatorType op) {
        int var10000;
        switch (op) {
            case ADD -> var10000 = n1 + n2;
            case SUBTRACT -> var10000 = n1 - n2;
            case MULTIPLY -> var10000 = n1 * n2;
            case DIVIDE -> var10000 = n1 / n2;
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    public double doubleCal(double n1, double n2, OperatorType op) {
        double var10000;
        switch (op) {
            case ADD -> var10000 = n1 + n2;
            case SUBTRACT -> var10000 = n1 - n2;
            case MULTIPLY -> var10000 = n1 * n2;
            case DIVIDE -> var10000 = n1 / n2;
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    public static Number parseNumber(String Input) {
        try {
            return Integer.parseInt(Input);
        } catch (NumberFormatException var4) {
            try {
                return Double.parseDouble(Input);
            } catch (NumberFormatException var3) {
                throw new IllegalArgumentException("숫자를 입력하지 않았습니다.");
            }
        }
    }
}