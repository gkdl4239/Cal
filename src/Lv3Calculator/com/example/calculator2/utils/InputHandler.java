package Lv3Calculator.com.example.calculator2.utils;
import java.util.Scanner;
import Lv3Calculator.com.example.calculator2.operation.Calculator2;


public class InputHandler {
    private final Scanner scan = new Scanner(System.in);

    // 숫자 입력
    public Number getInputNumber(String show){
        System.out.print(show);
        return Calculator2.parseNumber(scan.next());
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
