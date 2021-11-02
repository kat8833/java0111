package lesson1;

public class Main {
    // psvm
    public static void main(String[] args) {
        System.out.println("Команда для вывода - System.out.println()");
        System.out.println("Строка");
        System.out.println("Строка №" + 2);

        System.out.println("Арифметические операции над целыми числами");
        System.out.println("7 + 5 = " + 7 + 5);
        System.out.println("7 - 5 = " + (7 - 5));
        System.out.println("7 * 5 = " + 7 * 5);
        System.out.println("7 / 5 = " + 7 / 5);
        System.out.println("7 % 5 = " + 7 % 5);

        System.out.println("Операции сравнения над целыми числами");
        System.out.println("7 > 5 = " + (7 > 5));
        System.out.println("7 < 5 = " + (7 < 5));
        System.out.println("7 <= 5 = " + (7 <= 5));
        System.out.println("7 >= 5 = " + (7 >= 5));
        System.out.println("7 == 5 = " + (7 == 5));
        System.out.println("7 != 5 = " + (7 != 5));
        // Делить целые числа на 0 нельзя, будет ошибка
        // System.out.println(5 / 0);

        System.out.println("Арифметические операции над дробными числами");
        System.out.println("2.5 + 7 = " + 2.5 + 7);
        System.out.println("2.5 / 7 = " + 2.5 / 7);
        System.out.println("2.5 * 7 = " + 2.5 % 7);

        // Сравнения не всегда работает, как "надо",
        // потому что дробные числа хранятся с определенной точностью
        System.out.println(0.2 + 0.1 == 0.3);
        System.out.println(0.2 + 0.1);
        // Возможно делить дробное число на ноль, для этого есть специальные значения Infinity и -Infinity
        System.out.println(5.0 / -0.0);

        // Операции над строками
        System.out.println("123" + " 456");
        System.out.println("123" + 4);
        System.out.println("123".replace("1", "2"));

        /*
        Представим, что положили на вклад 100 000 рублей.
        Вывести в консоль сколько будет средств на вкладе через 1 год, если процент годовых = 7.5%
         */
        System.out.println(100000 * (1 + 7.5/100));
        System.out.println(100000 * 1.075);

        // Тот же вклад и проценты, но через 2 года
        System.out.println(100000 * (1 + 7.5/100) * (1 + 7.5/100));

        // Создание переменной
        // имя_типа_данных имя_переменной;
        int a;

        // Инициализация переменной
        // имя_переменной = значение/выражение;
        a = 5;

        int j;
        j = 5 + 3;

        System.out.println(a);
        System.out.println(j);
        int k = 100;
        System.out.println(k);

        // Math.pow(2,3);
        /*
        Вклад 100000р, 7.5%
        Создать две переменных под сумму вклада и под количество процентов.
        Количество процентов - это дробное число > 1
        Вывести сколько средств на счете через 3 года.
         */
        int summa = 100000;
        double percent = 1 + 7.5/100;
        System.out.println(summa * percent * percent * percent);
        System.out.println(summa * Math.pow(percent, 3));
//

        // Целые числа
        // byte - 1 байт
        // -128 .. 127
        byte b = 127;

        // short - 2 байта
        // -32000 .. 32000
        short s = 32767;

        // int - 4 байта
        // -2 000 000 000 .. 2 000 000 000
        int i = 2_147_483_647;

        // long - 8 байт
        // -9 * 10^18 .. 9 * 10^18
        long l = 2147483647;
        long l1 = 2147483648L;

        // Дробные числа
        // double - 8 байт
        // 16 цифр после запятой
        double d = 1.5;

        // float - 4 байта
        // 7 цифр после запятой
        float f = 1.5f;

        // Логический тип данных
        boolean bool = true;
        boolean bool2 = false;

        // Символьный тип данных
        // char - 4 байт
        // Хранит порядковый номер символа
        char c = 'f';
        System.out.println(c);
        // System.out.println(c + "1");
        System.out.println((char) (c + 1));
        System.out.println('f' > 'a');

        // Приведение типов
        // Неявное приведение типов (происходит автоматически)
        short sh = 5;
        int m = s;

        // Явное приведение типов (специальное действие, автоматически не происходит)
        int x = 130;
        System.out.println((byte) x);
        x = 120;
        System.out.println((byte) x);

        // Условный оператор
        // Синтаксис: if (<условие>)
        summa = 100000;
        percent = 1.075;
        if (summa * percent > 110000) {
            System.out.println("Условие выполнилось");
            System.out.println("2");
        } else {
            System.out.println("Условие не выполнилось");
            System.out.println(3);
        }

        // Проверка на то, делится ли значение переменной p на 3
        int p = 19823680;
        if (p % 3 == 0) {
            System.out.println("Число делится на 3");
        } else {
            System.out.println("Число не делится на 3");
        }

        /*
        Создайте две переменных типа int
        Если результат их сложения больше, чем 1000, выведите "Yes"
         */
        int q = 356;
        int g = 600;
        if (q + g > 1000) {
            System.out.println("Yes");
        }

        /*
        Создайте три переменных типа int
        Если результат их произведения - число положительное, вывести "Yes"
        В обратном случае - вывести "No"
         */
        int u = 1;
        int n = -1;
        int o = -1;
        if (u * n * o > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        /*
        Есть переменная целого типа
        Если она больше чем 0, вывести +
        Если меньше чем 0, вывести -
        Если равна 0, вывести =
         */
        int integer = -1;
        if (integer == 0) {
            System.out.println("=");
        } else {
            if (integer > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }

        if (integer == 0) {
            System.out.println("=");
        } else if (integer > 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }

        if (integer == 0) {
            System.out.println("=");
        }
        if (integer > 0) {
            System.out.println("+");
        }
        if (integer < 0) {
            System.out.println("-");
        }

    }
}
