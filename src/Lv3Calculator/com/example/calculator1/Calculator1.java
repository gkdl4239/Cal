package Lv3Calculator.com.example.calculator1;

import java.util.Scanner;

public class Calculator1 {
    public Calculator1() {
    }

    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println("첫번째 수를 입력하세요");
                int first = sc.nextInt();
                System.out.println("두번째 수를 입력하세요");
                int second = sc.nextInt();
                if(first <0 || second < 0){
                    System.out.print("양의 정수만 입력해주세요!");
                    continue;
                }

                System.out.println("+,-,*,/ 중 연산자 하나를 입력하세요");
                String operator = sc.next();
                char sign = operator.charAt(0);
                System.out.println(sign);
                int result = 0;
                switch (sign) {
                    case '*':
                        result = first * second;
                        break;
                    case '+':
                        result = first + second;
                    case ',':
                    case '.':
                    default:
                        break;
                    case '-':
                        result = first - second;
                        break;
                    case '/':
                        if (second == 0) {
                            System.out.println("분모에 0이 입력될 수 없습니다! 수식을 처음부터 다시 입력해주세요!");
                            continue;
                        }

                        result = first / second;
                }

                System.out.println("결과: " + result);
                System.out.println("계속하시려면 \"continue\"를, 종료하시려면 \"exit\"를 입력하세요.");
                String choice = sc.next();
                if (!choice.equals("continue") && choice.equals("exit")) {
                    return;
                }
            }
        }
    }
}