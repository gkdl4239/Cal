package Lv3Calculator.com.example.calculator2.utils;
import java.util.Scanner;
import Lv3Calculator.com.example.calculator2.operation.Calculator2;


public class InputHandler {
    private final Scanner scan = new Scanner(System.in);

    public Number getInputNumber(String show){
        System.out.print(show);
        return Calculator2.parseNumber(scan.next());
    }

    public char getInputOperator(String show){
        System.out.print(show);
        return scan.next().charAt(0);
    }

    public boolean confirmYes(String show){
        System.out.print(show);
        return scan.next().equals("y");
    }

    public int getInputStd(String show){
        System.out.print(show);
        return scan.nextInt();
    }

}
