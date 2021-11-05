package lesson1;

/*
Создать переменную v целого типа long с любым значением
В случае, если она кратна 2, вывести "Кратно 2"
В случае, если она кратна 3, вывести "Кратно 3"
В случае, если она кратна 2 и 3, вывести "Кратно 2" и "Кратно 3" в двух строках
В случае, если она ни кратна 2, ни кратна 3, вывести "Не повезло"
 */
public class HW3 {
    public static void main(String[] args) {
        long v = 12;

        /*
        if (v % 2 == 0) {
            if (v % 3 == 0) {
                System.out.println("Кратно 2");
                System.out.println("Кратно 3");
            } else {
                System.out.println("Кратно 2");
            }
        } else {
            if (v % 3 == 0) {
                System.out.println("Кратно 3");
            } else {
                System.out.println("Не повезло");
            }
        }
        */
        if (v % 2 == 0 && v % 3 == 0) {
            System.out.println("Кратно 2");
            System.out.println("Кратно 3");
        } else if (v % 2 == 0) {
            System.out.println("Кратно 2");
        } else if (v % 3 == 0) {
            System.out.println("Кратно 3");
        } else {
            System.out.println("Не повезло");
        }

//        if (v % 2 == 0) {
//            System.out.println("Кратно 2");
//        }
//        else if (v % 3 == 0) {
//            System.out.println("Кратно 3");
//        }
//        else if (v % 6 != 0) {
//            System.out.println("Не повезло");
//        }
    }
}
