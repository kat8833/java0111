package lesson2;

/*
С помощью любого из циклов вывести все нечетные числа (по одному на строку) с -7 до 23
Замечание: результат операции -7 % 2 равен -1
То есть остаток от деления отрицательных чисел не может быть положительным
 */
public class HW3 {
    public static void main(String[] args) {
        int i = -7;
        while (i < 23) {
            if (i%2 != 0) {
                System.out.println(i);
            }
            i = i + 1;
        }

        /*
        while (i < 23) {
            System.out.println(i);
            i = i + 2;
        }
         */
    }
}
