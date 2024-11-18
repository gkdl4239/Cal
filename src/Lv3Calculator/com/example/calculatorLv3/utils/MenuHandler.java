package Lv3Calculator.com.example.calculatorLv3.utils;
import Lv3Calculator.com.example.calculatorLv3.operation.CalculatorService;
import Lv3Calculator.com.example.calculatorLv3.results.Results;

import java.util.List;

public class MenuHandler {
    InputHandler input = new InputHandler();
    CalculatorService calculator = new CalculatorService();
    Results results = new Results();

    // 메뉴 선택 처리
    public void handleMenu(String choice){
        switch (choice){
            case "1" ->performCalculation();
            case "2" ->viewResults();
            case "3" ->removeOld();
            case "4" ->exit();
            default -> System.out.println("유효한 숫자를 입력하세요");
        }
    }

    // 계산
    public void performCalculation(){
        Number first = input.getInputNumber("첫번째 숫자를 입력하세요: ");
        Number second = input.getInputNumber("두번째 숫자를 입력하세요: ");
        char op = input.getInputOperator("연산자를 입력하세요: ");

        Number result = calculator.toCalculate(first,second,op);
        Number fixed = results.decimal(result);
        results.setQueue(fixed);
    }

    // 조회
    public void viewResults(){
        int std = input.getInputStd("기준값보다 큰 값들을 조회합니다 기준값을 입력해주세요:");
        List big = results.getQueue(std);
        big.forEach((i) -> {
            System.out.print(" " + i);
        });
        System.out.println();
    }

    // 삭제
    public void removeOld(){
        boolean y = input.confirmYes("제일 오래된 결과 값을 삭제 하시겠습니까? (y 입력 시 삭제)");
        if(y) results.removeResult();
    }

    // 종료
    public void exit(){
        System.exit(0);
    }
}
