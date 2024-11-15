package Lv3Calculator.com.example.calculator2;

import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Results results = new Results();

        while(true) {
            while(true) {
                System.out.println("번호를 입력해주세요");
                System.out.println("1.계산 2.조회 3.삭제 4.종료");
                String menu = sc.next();
                String delete;
                if (menu.equals("1")) {
                    System.out.print("첫 번째 숫자를 입력하세요:");
                    delete = sc.next();
                    Number num1 = Calculator2.parseNumber(delete);
                    System.out.print("두 번째 숫자를 입력하세요:");
                    String input2 = sc.next();
                    Number num2 = Calculator2.parseNumber(input2);
                    System.out.print("사칙 연산 기호를 입력하세요:");
                    String sign = sc.next();
                    char operator = sign.charAt(0);
                    Number result = 0;
                    OperatorType op;
                    if (num1 instanceof Integer && num2 instanceof Integer) {
                        Calculator2<Integer, Integer> cal1 = new Calculator2((Integer)num1, (Integer)num2);
                        op = OperatorType.fromSymbol(operator);
                        result = cal1.calculate(op);
                    } else if (num1 instanceof Integer && num2 instanceof Double) {
                        Calculator2<Integer, Double> cal2 = new Calculator2((Integer)num1, (Double)num2);
                        op = OperatorType.fromSymbol(operator);
                        result = cal2.calculate(op);
                    } else if (num1 instanceof Double && num2 instanceof Integer) {
                        Calculator2<Double, Integer> cal3 = new Calculator2((Double)num1, (Integer)num2);
                        op = OperatorType.fromSymbol(operator);
                        result = cal3.calculate(op);
                    } else if (num1 instanceof Double && num2 instanceof Double) {
                        Calculator2<Double, Double> cal4 = new Calculator2((Double)num1, (Double)num2);
                        op = OperatorType.fromSymbol(operator);
                        result = cal4.calculate(op);
                    }

                    System.out.println("결과 : " + result);
                    System.out.println("결과 값이 저장 되었습니다.");
                    results.setQueue((Number)result);
                } else if (menu.equals("2")) {
                    System.out.print("기준값보다 큰 값들을 조회합니다 기준값을 입력해주세요:");
                    int std = sc.nextInt();
                    results.getQueue(std).forEach((i) -> {
                        System.out.print(" " + i);
                    });
                    System.out.println();
                } else if (menu.equals("3")) {
                    System.out.println("제일 오래된 결과 값을 삭제 하시겠습니까? (y 입력 시 삭제)");
                    delete = sc.next();
                    if (delete.equals("y")) {
                        results.removeResult();
                    }
                } else {
                    if (menu.equals("4")) {
                        return;
                    }

                    System.out.println("유효한 값을 입력해주세요");
                    System.out.println("");
                }
            }
        }
    }
}
