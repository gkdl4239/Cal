package Lv3Calculator.com.example.calculatorLv3.operation;


public class Calculator<T extends Number, U extends Number> {
    private final T num1;
    private final U num2;

    public Calculator(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 정수,정수 인 경우와 나머지 경우 분류
    public Number calculate(OperatorType op) {
        if (this.num1 instanceof Integer && this.num2 instanceof Integer) {
            int n1 = this.num1.intValue();
            int n2 = this.num2.intValue();
            return this.intCal(n1, n2, op);
        }
        else {
            double n1 = this.num1.doubleValue();
            double n2 = this.num2.doubleValue();
            return this.doubleCal(n1, n2, op);
        }
    }

    // 정수/정수 일때 계산
    public int intCal(int n1, int n2, OperatorType op) {
        return switch (op) {
            case ADD -> n1 + n2;
            case SUBTRACT ->  n1 - n2;
            case MULTIPLY ->  n1 * n2;
            case DIVIDE ->  n1 / n2;
        };
    }

    // 나머지 경우 계산
    public double doubleCal(double n1, double n2, OperatorType op) {
        return switch (op) {
            case ADD -> n1 + n2;
            case SUBTRACT ->  n1 - n2;
            case MULTIPLY ->  n1 * n2;
            case DIVIDE ->  n1 / n2;
        };
    }

    // 입력받은 연산자를 그에 맞게 형변환하는 메서드
    public static Number parseNumber(String Input) {
        try {
            return Integer.parseInt(Input);
        } catch (NumberFormatException e1) {
            try {
                return Double.parseDouble(Input);
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("숫자를 입력하지 않았습니다.");
            }
        }
    }
}