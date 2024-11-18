package Lv3Calculator.com.example.calculatorLv3.utils;
import java.util.Scanner;
import Lv3Calculator.com.example.calculatorLv3.operation.Calculator;


public class InputHandler {
    private final Scanner scan = new Scanner(System.in);

    // 숫자 입력
    public Number getInputNumber(String show){
        System.out.print(show);
        return Calculator.parseNumber(scan.next());
    }

    // 연산자 입력
    public char getInputOperator(String show){
        System.out.print(show);
        return scan.next().charAt(0);
    }

    // 확인 입력
    public boolean confirmYes(String show){
        System.out.print(show);
        return scan.next().equals("y");
    }

    // 조회 중 기준값 입력
    public int getInputStd(String show){
        System.out.print(show);
        return scan.nextInt();
    }

}
