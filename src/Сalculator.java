public class Сalculator {

    public static int sum(int a, int b) {
        int summa = a + b;
        return summa;
    }

    public static int minus(int a, int b) {
        int raznica = a - b;

        return raznica;
    }

    public static int multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static int division(int a, int b) {
        int divi = a / b;
        return divi;
    }

    public static void sleep() {
        System.out.println("Я устал, и иду спать");
    }

    public static void main(String[] args) {

        System.out.println("Бро, сумма равна" + sum(12, 2));

        System.out.println("Бро, разница равна" +  minus(6, 2));

        System.out.println("Бро, я умножил. Результат равен" + multiply(14, 2));

        System.out.println("Бро, я разделил. Результат равен" + division(9, 2));
        sleep();
        System.out.println("Проверка " + (sum(1, 1) + minus(10, 5)));
    }
}
