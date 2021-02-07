import java.util.Scanner;

public class Calculator {
    private static String summationResultString(final double a1, final double a2) {
        return String.format("%.4f", a1 + a2);
    }

    private static String subtractionResultString(final double a1, final double a2) {
        return String.format("%.4f", a1 - a2);
    }

    private static String multiplicationResultString(final double a1, final double a2) {
        return String.format("%.4f", a1 * a2);
    }

    private static String divisionResultString(final double a1, final double a2) {
        if (a2 != 0.0) return String.format("%.4f", a1 / a2);
        else {
            if (a1 > 0.0) return "+inf";
            else if (a1 < 0.0) return "-inf";
            else return "Uncertainty";
        }
    }

    public static void userInterface() {
        final double NUMBER_1, NUMBER_2;
        final String OPERATION;

        final Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Добро пожаловать в Калькулятор!
                Введите аргументы в виде чисел с плавающей точкой
                 (Целую часть от дробной отделяйте символом запятой ','):""");

        // Возможны ошибки InputMismatchException при преобразовании строки из потока ввода в число double.
        // В рамках этой задачи они не обрабатываются.
        System.out.print("Введите первый аргумент: ");
        NUMBER_1 = scanner.nextDouble();

        System.out.print("Введите второй аргумент: ");
        NUMBER_2 = scanner.nextDouble();

        System.out.println("""
                Выберите номер бинарной операции между ними из следующего списка:
                1. Сложить;
                2. Вычесть;
                3. Умножить
                4. Разделить""");

        System.out.print("Номер операции: ");
        OPERATION = scanner.next().trim();

        System.out.print("Результат операции: ");

        switch(OPERATION){
            case "1":
                System.out.println(summationResultString(NUMBER_1, NUMBER_2));
                break;
            case "2":
                System.out.println(subtractionResultString(NUMBER_1, NUMBER_2));
                break;
            case "3":
                System.out.println(multiplicationResultString(NUMBER_1, NUMBER_2));
                break;
            case "4":
                System.out.println(divisionResultString(NUMBER_1, NUMBER_2));
                break;
            default:
                System.out.println("Некорректный номер операции.");
        }

        System.out.println("""
                
                Спасибо за то, что пользуетесь Калькулятором!
                Всего доброго!""");
    }
}
