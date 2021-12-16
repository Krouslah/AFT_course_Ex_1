import Utility.Ex1_1;
import Utility.Ex1_2;
import Utility.Ex1_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i != 4) {
            i = cycle();
            switch (i) {
                case 1:
                // начало второй практической
                System.out.println("Ведется деление.");
                Ex1_1 result = new Ex1_1(Double.parseDouble(scanner()), Double.parseDouble(scanner()));
                double quotient = result.counts(result.getA(), result.getB());
                System.out.println("Результат деления: " + quotient + "\nДеление окончено.\n");
                // конец второй практической
                    break;
                case 2:
                // начало третьей практической
                System.out.println("Определение является ли число четным?");
                Ex1_2 outFit = new Ex1_2(Long.parseLong(scanner()));
                System.out.println("Число " + outFit.printResult(outFit.getA()));
                // конец третьей практической
                    break;
                case 3:
                // начало четвертой практической
                Ex1_3 printHi = new Ex1_3(0, 0, 0, "user");
                System.out.print("Введите часы - ");
                printHi.setHours(Integer.parseInt(scanner()));
                System.out.print("Введите минуты - ");
                printHi.setMin(Integer.parseInt(scanner()));
                System.out.print("Введите секунды - ");
                printHi.setSec(Integer.parseInt(scanner()));
                System.out.print("Ну и собсно введите пользователя - ");
                printHi.setUser(scanner());
                System.out.print(printHi.dayTime(printHi.getHours(), printHi.getMin(), printHi.getSec()) + printHi.getUser());
                // конец четвертой практической
                    break;
                case 4:
                    System.out.println("Увидимся!"); break;
                default:
                    System.out.println("Введен неверный пункт меню"); continue;
            }
        }
    }
    public static String scanner() {
        Scanner src = new Scanner(System.in);
        System.out.print("(Жду на ввод) ");
        return src.next();
    }
    public static int cycle() {
        System.out.println("""
                1. Проверить вторую практическую
                2. Првоерить третью практическую
                3. Проверить четвертую практическую
                4. Выход""");
        System.out.print("Введите интересующий пункт меню - ");
        return Integer.parseInt(scanner());
    }
}
