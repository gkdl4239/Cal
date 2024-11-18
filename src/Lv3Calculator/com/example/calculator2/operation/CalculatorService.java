package Lv3Calculator.com.example.calculator2.operation;

public class CalculatorService {

    // 계산하기 위한 제네릭 자료형 입력
    public Number toCalculate(Number first,Number second,char op){
        Calculator2 cal;

        // 정수/정수 정수/실수 실수/정수 실수/실수 로 4가지의 경우로 나눠 입력
        if (first instanceof Integer && second instanceof Integer) {
            cal = new Calculator2<>((Integer) first, (Integer) second);
        } else if (first instanceof Integer && second instanceof Double) {
            cal = new Calculator2<>((Integer) first, (Double) second);
        } else if (first instanceof Double && second instanceof Integer) {
            cal = new Calculator2<>((Double) first, (Integer) second);
        } else {
            cal = new Calculator2<>((Double) first, (Double) second);
        }

        OperatorType operator = OperatorType.fromSymbol(op);
        return cal.calculate(operator);
    }
}