package lesson2;

import java.util.Scanner;

/*
С помощью Scanner спросить у пользователя целое число
Вывести в консоль произведение этого числа и 6.28
 */
public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        System.out.println("Число, умноженное на 6.28 = " + d * 6.28);
    }
}
