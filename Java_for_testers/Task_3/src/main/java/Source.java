import java.util.Scanner;

public class Source {
    public static void main (String[] args) {

        System.out.println("""
                Добро пожаловать в программу, в которой у Вас есть выбор!
                Ваши опции:
                 введите 1 для вызова Калькулятора;
                 введите 2 для вызова Определителя Длиннющих Слов.
                """);

        System.out.print("И так, Ваш выбор: ");

        switch (new Scanner(System.in).next()){
            case "1":
                Calculator.callUserInterface();
                break;
            case "2":
                WorksWithWords.callUserInterface();
                break;
            default:
                System.out.println("Вы сделали неправильный выбор. Прощайте.");
        }
    }
}
