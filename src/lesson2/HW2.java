package lesson2;

import java.util.Scanner;

/*
Спросить у пользователя число
Если оно попадает в диапазон от 1 до 100 или в диапазон от -1000 до -100, вывести в консоль "+"
Если оно не попадает ни в один из этих диапазонов, вывести "-"
 */
public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if ((i>=1 && i<100) || (i>=-1000 && i<-100)) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }

        /*
        if (i>=1 && i<100) {
            System.out.println("+");
        } else if (i>=-1000 && i<-100) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
         */
    }
}
