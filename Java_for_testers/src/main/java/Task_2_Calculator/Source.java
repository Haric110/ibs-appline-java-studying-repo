package Task_2_Calculator;

import java.util.Scanner;

public class Source {

    /**
     * @param a число с плавающей точкой
     * @param b число с плавающей точкой
     * @return сумма аргументов a и b
     *
     * Возвращает сумму аргументов типа данных double.
     */
    public static double summer(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b;

        System.out.println("Введите дробные числа a и b (в качестве разделителя дробной части используйте ','):");
        System.out.print("а = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();

        System.out.printf("Результат суммы: %.4f", summer(a, b));
    }
}
