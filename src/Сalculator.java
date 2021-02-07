public class Сalculator {

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static int minus(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int multiply(int a, int b) {
        int res = a * b;
        return res;
    }

    public static int division(int a, int b) {
        int div = a / b;
        return div;
    }

    public static void sleepAlways() {
        System.out.println("Я устал, и иду спать");
    }

    public static void main(String[] args) {

        System.out.println("Бро, сумма равна" + sum(12, 2));

        System.out.println("Бро, разница равна" +  minus(6, 2));

        System.out.println("Бро, я умножил. Результат равен" + multiply(14, 2));

        System.out.println("Бро, я разделил. Результат равен" + division(9, 2));
        sleepAlways();
        System.out.println("Проверка " + (sum(1, 1) + minus(10, 5)));
    }
}
