package Task_3;

import java.util.Scanner;

public class WorksWithWords {
    /**
     * Предлагает ввести количество слов, затем ввести сами слова через ENTER, после чего определяет
     * и выводит наиболее длинное из них.
     * Если в строке ввода есть несколько слов, читается только первое из них.
     */
    public static void callUserInterface() {
        final int WORDS_COUNT;

        int max_length, indexOfTheLongestWord;

        final String[] words;

        Scanner scanner = new Scanner(System.in);


        System.out.println("\nДобро пожаловать в Определитель Длиннющих Слов! Вы сделали правильный выбор!\n\n");

        System.out.print("Введите число слов: ");
        WORDS_COUNT = scanner.nextInt();
        scanner.nextLine();

        if (WORDS_COUNT <= 0) {
            System.out.println("""
                    Некорректное число элементов списка
                    Определитель Длиннющих Слов окончил свою работу.""");
            System.exit(0);
        }

        words = new String[WORDS_COUNT];
        System.out.println("Теперь введите их! После каждого слова нажимайте ENTER.");

        max_length = 0;
        indexOfTheLongestWord = 0;

        for (int i = 0; i < WORDS_COUNT; i++) {
            System.out.printf("слово_%d = ", i + 1);

            words[i] = scanner.nextLine().split(" ")[0];

            if (words[i].length() > max_length) {
                max_length = words[i].length();
                indexOfTheLongestWord = i;
            }
        }

        System.out.printf("\nДлиннющее слово: \"%s\"\n\n", words[indexOfTheLongestWord]);
        System.out.println("""
                Спасибо, что пользуетесь "Определителем Длиннющих Слов"!
                Всего доброго!""");
    }
}
