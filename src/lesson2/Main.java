package lesson2;

// ../java/util/Scanner.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Логические операции
        // Операция НЕ, отрицание (англ. not)
//        System.out.println(!true);
//        System.out.println(!false);
//        System.out.println();

        // Операция И (англ. AND)
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        System.out.println();

        // Операция ИЛИ (англ. OR)
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println();

        // Применение
//        int x = 100;
//        if (x > 0 && x < 1000)
//            System.out.println("+");
//        else
//            System.out.println("-");

        // == -> && -> ||

        /*
        Создать переменную целого типа int
        Если она не лежит между 1 и 100, вывести "Не попал"
        Если она лежит между 1 и 90, вывести "Попал"
        Если она лежит между 91 и 100, вывести "Отличный выстрел"
        Крайние случаи: 1 - попал, 90 - попал, 100 - отличный выстрел
         */
//        int y = 90;
//        if (y < 1 || y > 100) {
//            System.out.println("Не попал");
//        } else if (y >= 1 && y <= 90) {
//            System.out.println("Попал");
//        } else if (y >= 91 && y <= 100){
//            System.out.println("Отличный выстрел");
//        }

        // Ввод с консоли
        // Неизменное создание Scanner
//        Scanner sc = new Scanner(System.in);
        // nextInt() - операция для взятия из ввода консоли целого числа
//        int i = sc.nextInt();
//        System.out.println(i);
//        System.out.println(i + 1);
//        i = 100;
//        System.out.println(i);
//        System.out.println(sc.nextDouble() * 100);


        /*
        Создать переменную целого типа int, ввести в неё значение с помощью Scanner
        3 нужные записи: import, создание переменной типа Scanner, использование операции nextInt()
        Если она не лежит между 1 и 100, вывести "Не попал"
        Если она лежит между 1 и 90, вывести "Попал"
        Если она лежит между 91 и 100, вывести "Отличный выстрел"
        Крайние случаи: 1 - попал, 90 - попал, 100 - отличный выстрел
         */
        Scanner scanner = new Scanner(System.in);
//        int y = scanner.nextInt();
//        if (y < 1 || y > 100) {
//            System.out.println("Не попал");
//        } else if (y >= 1 && y <= 90) {
//            System.out.println("Попал");
//        } else if (y >= 91 && y <= 100){
//            System.out.println("Отличный выстрел");
//        }
        /*
        Спросить у пользователя 2 целых числа a и b
        Вывести в консоль их сумму, произведение и частное
         */
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a + b);
//        System.out.println(a * b);
//        if (b == 0) {
//            System.out.println("На ноль делить нельзя");
//        } else {
//            System.out.println(a / b);
//        }

        // Циклы
        // Цикл while
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i = i + 1;
//        }
//        System.out.println("Цикл закончился");

//        while (true) {
//            i = i + 1;
//            System.out.println(i);
//        }

        int j = 101;
        while (j <= 100) {
            if (j % 3 == 0)
                System.out.println(j);
            j = j + 1;
        }

//        int i = scanner.nextInt();
//        while (i <= 0) {
//            System.out.println("Введи положительное число");
//            i = scanner.nextInt();
//        }
//        System.out.println(i);

        // Обязательно исполнится блок кода
        j = 102;
        do {
            if (j % 3 == 0)
                System.out.println(j);
            j = j + 1;
        } while (j <= 100);

        /*
        Спросить у пользователя два числа A и B
        Если A >= B, вывести все числа от A до B
        В обратном случае вывести "Неверный ввод"
         */
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        if (A < B) {
//            System.out.println("Неверный ввод");
//        } else {
//            int q = B;
//            while (q <= A) {
//                System.out.println(q);
//                q = q + 1;
//            }
//        }

        // Цикл for
        for (int p = 7; p <= 100; p = p + 1) {
            if (p % 3 ==0) {
                System.out.println(p);
            }
        }

        // Массивы - набор фиксированной длины из значений одного типа данных
        // Создание переменной массива
        int[] arrInt;
        String[] arrStr;
        // возможно, но не встречается
        // int arrInt2[];

        // Инициализация массива
        // 1 способ - создание массива со значениями по умолчанию определенной длины
        arrInt = new int[5];

        // 2 способ - задание значений
        arrStr = new String[]{"abc", "dxe", "qwe"};

        int[] arrInt2 = new int[]{2, 5, -700, 1000};

        System.out.println(arrInt);
        System.out.println(arrInt2);

        // У каждого элемента есть индекс, нумерация начинается с нуля
        System.out.println(arrStr[0]);
        System.out.println(arrStr[1]);
        System.out.println(arrStr[2]);

        // Если мы создаем массив с помощью 1 способа - внутри лежат нули соответствующих типов
        System.out.println(arrInt[4]);
        boolean[] ba = new boolean[1];
        System.out.println(ba[0]);
        double[] da = new double[1];
        System.out.println(da[0]);
        String[] Sa = new String[1];
        System.out.println(Sa[0]);
        Scanner[] Sca = new Scanner[1];
        System.out.println(Sca[0]);

        System.out.println(arrInt2[2]);
        arrInt2[2] = 700;
        System.out.println(arrInt2[2]);

        System.out.println(arrInt.length);
        System.out.println(arrStr.length);
    }
}
