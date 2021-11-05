package lesson1;

/*
Создать три переменных с любыми значениями:
    x целого типа short
    y целого типа short
    z целого типа int
С помощью условного оператора if проверить, равно ли произведение x и y числу z
Если да, то вывести "Хорошие числа"
Если нет, то вывести "Не повезло"
 */
public class HW2 {
    public static void main(String[] args) {
        short x = 3;
        short y = 3;
        int z = 6;

        if (x * y == z) {
            System.out.println("Хорошие числа");
        } else {
            System.out.println("Не повезло");
        }
    }
}
