package lesson1;

// Код для всех задач в ДЗ писать внутри соответствующих классов
// То есть в этом файле надо добавить psvm внутрь класса HW1 и писать код внутри psvm
/*
Создать три переменные с любыми значениями:
    x целого типа int
    y целого типа long
    z дробного типа double
Вывести на экран результат их сложения и произведения в двух строках
 */
public class HW1 {
    // psvm
    public static void main(String[] args) {
        // код писать здесь
        // запускать с помощью зеленой стрелки слева
        int x = 3;
        long y = 10_000L;
        double z = 4.5;

        System.out.println(x + y + z);
        System.out.println(x * y * z);
    }
}
