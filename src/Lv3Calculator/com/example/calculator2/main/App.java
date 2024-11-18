package Lv3Calculator.com.example.calculator2.main;

import Lv3Calculator.com.example.calculator2.utils.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();

        while (true) {
            menu.displayMenu();
            menu.userChoice();
        }
    }
}
