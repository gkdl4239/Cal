package Lv3Calculator.com.example.calculator2.utils;
import java.util.Scanner;

public class Menu {
    private final Scanner scan = new Scanner(System.in);
    MenuHandler mh = new MenuHandler();

    // 메뉴 보기
    public void displayMenu(){
        System.out.println("번호로 메뉴를 선택하세요");
        System.out.print("1. 계산 ");
        System.out.print("2. 조회 ");
        System.out.print("3. 삭제 ");
        System.out.print("4. 종료 ");
        System.out.println("");
        userChoice();
    }

    // 메뉴 선택
    public void userChoice(){
        mh.handleMenu(scan.next());
    }
}
