package Task_6_Collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Source {
    public static void main(String[] args) {
        final String
                pathSeparator = System.getProperty("os.name").startsWith("Windows") ? "\\" : "/",
                filePath = System.getProperty("user.dir") + pathSeparator + "src" + pathSeparator +
                        "main" + pathSeparator + "java" + pathSeparator + "Task_6_Collections" + pathSeparator
                        + "input_path" + pathSeparator + "input.txt";

        final Map<String, AtomicInteger> occurrenceMap = new TreeMap<>();

        int maxOccurrence = 0;

        // Чтение из файла, запись в структуру TreeMap
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String[] fileContent = bufferedReader.readLine().split(" ");

            for (String word : fileContent) {
                if (occurrenceMap.containsKey(word)) occurrenceMap.get(word).getAndIncrement();
                else occurrenceMap.put(word, new AtomicInteger(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Вывод статистики по повторениям
        for (Map.Entry<String, AtomicInteger> entry : occurrenceMap.entrySet())
            System.out.println("слово: \"" + entry.getKey() + "\" число повторений: " + entry.getValue());

        // Поиск максимального числа повторений
        for (Map.Entry<String, AtomicInteger> entry : occurrenceMap.entrySet()) {
            if (entry.getValue().get() > maxOccurrence) {
                maxOccurrence = entry.getValue().get();
            }
        }

        // Вывод наиболее повторяемых слов
        for (Map.Entry<String, AtomicInteger> entry : occurrenceMap.entrySet()) {
            if (entry.getValue().get() == maxOccurrence)
                System.out.println("Наиболее повторяемое слово: " + entry.getKey());
        }
    }
}
