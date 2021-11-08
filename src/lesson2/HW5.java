package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя целое число N
Создать массив целых чисел длиной N
С помощью цикла и Scanner спросить у пользователя N целых чисел и положить их по очереди в массив
Вывести первый и последний элемент в массиве
 */
public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arrInt = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            arrInt[i] = sc.nextInt();
        }

        System.out.println("Первое число в массиве = " + arrInt[0]);
        System.out.println("Последнее число в массиве = " + arrInt[arrInt.length-1]);

    }
}
