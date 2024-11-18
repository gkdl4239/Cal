package Lv3Calculator.com.example.calculator2.operation;

public class CalculatorService {

    public Number toCalculate(Number first,Number second,char op){
        Calculator2 cal;

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
