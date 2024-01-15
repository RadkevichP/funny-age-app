package pl.pingwit.service;

import pl.pingwit.age.util.AgeCalculatorUtils;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeService {

    public void startTheGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать на веселый калькулятор возраста!");
        while (true) {
            System.out.println("Выберите режим (введите символ): A - если хотите определить ваш возраст, L - если хотите узнать, сколько високосных лет вы пережили, X - для выхода из программы:");
            String command = scanner.next();
            if ("A".equals(command)) {
                System.out.println("Введите дату вашего рождения в формате YYYY-mm-dd:");
                String birthDate = scanner.next();
                LocalDate birth = LocalDate.parse(birthDate);
                Integer integer = AgeCalculatorUtils.calculateAge(birth);
                System.out.println(String.format("Ваш возраст %d", integer));
            } else if ("L".equals(command)) {
                System.out.println("Введите дату вашего рождения в формате YYYY-mm-dd:");
                String birthDate = scanner.next();
                LocalDate birth = LocalDate.parse(birthDate);
                Integer integer = AgeCalculatorUtils.countPersonLeapYears(birth);
                System.out.println(String.format("Вы пережили %d високосных лет! Желаем вам прожить в четыре раза больше!", integer));
            } else {
                System.out.println("Bye!");
                return;
            }
        }
    }
}
