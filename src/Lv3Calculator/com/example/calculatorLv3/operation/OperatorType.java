package Lv3Calculator.com.example.calculatorLv3.operation;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return this.symbol;
    }

    // 입력받은 연산자와 필드값을 비교해서 상수를 반환하는 메서드
    public static OperatorType fromSymbol(char operator){
        for(OperatorType op : OperatorType.values()){
            if(op.getSymbol() == operator) return op;
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다");
    }
}