package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя дробное число N
Создать массив длиной 5 (любым из 2 способов), заполнить массив значениями от 1*N до 5*N
 */
public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double[] arrDouble = new double[]{n, 2*n, 3*n, 4*n, 5*n};
    }
}
