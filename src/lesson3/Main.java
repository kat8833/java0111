package lesson3;

import java.util.Scanner;

public class Main {
    // Метод с именем add, который имеет два параметра типа int и возвращает int с их суммой
    static int add(int x, int y) {
        return x + y;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Написать метод с именем prod, который имеет два параметра типа double и возвращает (return) double с их произведением
    static double prod(double x, double y) {
        return x * y;
    }

    // Метод print с одним параметром String и без возвращаемого значения (void), который выводит на экран фразу "Получил строку: входная_строка"
    // "строка" -> "Получил строку: строка"
    // "1" -> "Получил строку: 1"
    static void print(String s) {
        System.out.println("Получил строку: " + s);
    }

    public static void main(String[] args) {
        System.out.println(prod(3,4));
        System.out.println(prod(2.5, 8));

        print("123");
        print("Строка");
        // цикл для работы с массивами
//        int[] a = new int[]{1,2,3,4,5};
//        for (int i = 0; i < a.length; i++) {
//            a[i] = a[i] * 2;
//            System.out.println(a[i]);
//        }
//
//
//        a = new int[]{1,2,3,4,5};
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 != 0) {
//                a[i] = a[i] * 2;
//            }
//            System.out.println(a[i]);
//        }

        // Есть массив с оценками класса по 100-бальной шкале
        // Найти максимальную оценку
        int[] grades = new int[]{4, 8, 91, 67, 50, 91, 2, 6, 30};
//        int max = grades[0];
//        int max_i = 0;
//        for (int i = 1; i < grades.length; i++) {
//            if (grades[i] > max) {
//                max = grades[i];
//                max_i = i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(max_i);

        // Найти разницу между максимумом и минимумом массива
        // Использовать только один цикл
//        int maxx = grades[0];
//        int minn = grades[0];
//        for (int i = 1; i < grades.length; i++) {
//            if (grades[i] > maxx) {
//                maxx = grades[i];
//            }
//            if (grades[i] < minn) {
//                minn = grades[i];
//            }
//        }
//        System.out.println(maxx - minn);
//
//        // Найти сумму элементов массива
//        int sum = 0;
//        for (int i = 0; i < grades.length; i++) {
//            sum = sum + grades[i];
//        }
//        System.out.println(sum);
//        System.out.println(1.0*sum/grades.length);
//
//        // Подсчитать в массиве количество нулей
//        // {0,0,0} -> 3
//        // {0,0,1} -> 2
//        int count = 0;
//        for (int i = 0; i < grades.length; i++) {
//            if (grades[i] == 2) {
//                count = count + 1;
//            }
//        }
//        System.out.println(count);

        // Краткие операция
//        int i = 5;
//        i += 2; // i = i + 2;
//        System.out.println(i);
//        i -= 1; // i = i - 1;
//        System.out.println(i);
//        i *= 8;
//        System.out.println(i);
//        i /= 5;
//        System.out.println(i);
//        i %= 2;
//        System.out.println(i);
//
//        i++;
//        System.out.println(i);
//        i--;
//        System.out.println(i);
//
//        ++i;
//        --i;
//        System.out.println(i);

//        int j = 5;
//        System.out.println(4 + j++);
//        System.out.println(j);
//
//        j = 5;
//        System.out.println(4 + ++j);
//        System.out.println(j);


//        int[][] matrix = new int[3][3];
//        matrix[0] = new int[]{1,2,3};
//        matrix[1] = new int[]{4,5,6};
//        matrix[2] = new int[]{7,8,9};
//        System.out.println(matrix[1][1]);
//        int[] arrInt = matrix[1];
//        System.out.println(arrInt[1]);
//        matrix[1][1] = 10;
//        System.out.println(matrix[1][1]);
//
//        for (int i = 0; i < matrix.length; i++) {
//            int[] arr = matrix[i];
//            for (int j = 0; j < arr.length; j++) {
//
//            }
//        }

        // String -> примитивные типы
//        int i = Integer.parseInt("123");
//        System.out.println(i);
//        double d = Double.parseDouble("0.123");
//        System.out.println(d);
//        d = Double.parseDouble("2.5e2");
//        // 2.5 * 10^2 = 250.0
//        System.out.println(d);
//        d = Double.parseDouble("-1e-4");
//        System.out.println(d);
//        d = -1e-4;
//        System.out.println(d);
//        System.out.println(Boolean.parseBoolean("true"));
//
//        // String операции
//        String s = "true";
//        // Проверка на равенство
//        System.out.println(s.equals("123"));
//
//        // Длина
//        System.out.println(s.length());
//
//        // Проверка на равенство без различия больших и маленький
//        s.equalsIgnoreCase("True");
//
//        System.out.println(s.charAt(2));
//
//        System.out.println(s.contains("ru"));
//
//        System.out.println(s.substring(1,3));
//
//        System.out.println(s.indexOf("ru"));
//
//        s = "1, 2, 3, 4";
//        String[] strs = s.split(", ");
//        for (int j = 0; j < strs.length; j++) {
//            System.out.println(strs[j]);
//        }
//
//        s = s.replace(", ", ":");
//        System.out.println(s);
//
//        // Спросить у пользователя с помощью scanner.nextLine() строку в формате 1, 2, 3, 4, 5
//        // Превратить эту строку в массив строк
//        // Массив строк превратить в массив целых чисел
//        // Вывести первое число
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        String[] strings = string.split(", ");
//
//        int[] ints = new int[strings.length];
//        for (int j = 0; j < strings.length; j++) {
//            ints[j] = Integer.parseInt(strings[j]);
//        }
//        System.out.println(ints[0] + 1);

//        for (double phi = 0.0; phi < 2*Math.PI; phi += 0.1) {
//            System.out.println(Math.pow(phi, 2));
//        }

        System.out.println(add(1,3));
        System.out.println(add(-50, 51));
        printArray(new int[]{1,2,3});
        int[] arr2 = new int[]{1,2};
        printArray(arr2);


    }
}

