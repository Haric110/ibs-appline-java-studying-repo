import java.util.Random;

public class Source {
    public static void main(String[] args) {
        final int
                ARRAY_LENGTH = 20,
                MIN_BOUND = -10,
                MAX_BOUND = 10;

        int[] numbers = new int[ARRAY_LENGTH];

        int indOfMaxNeg, indOfMinPos;

        Random random = new Random();


        // Заполнение массива целыми числами от MIN_BOUND (-10) до MAX_BOUND (10)
        for (int i = 0; i < ARRAY_LENGTH; i++)
            numbers[i] = MIN_BOUND + random.nextInt(MAX_BOUND - MIN_BOUND + 1);

        System.out.println("Был сгенерирован массив целых чисел:");
        for (int number : numbers) System.out.printf("%d ", number);
        System.out.println();

        indOfMaxNeg = getIndOfMaxNeg(numbers);

        if (indOfMaxNeg >= 0)
            System.out.println("Максимальный отрицательный элемент в массиве: " + numbers[indOfMaxNeg]
                    + " (индекс: " + indOfMaxNeg + ")");
        else {
            System.out.println("В данном массиве нет отрицательных элементов, поэтому менять ничего не будем.");
            System.exit(0);
        }


        indOfMinPos = getIndOfMinPos(numbers);

        if (indOfMinPos >= 0)
            System.out.println("Минимальный положительный элемент в массиве: " + numbers[indOfMinPos]
                    + " (индекс: " + indOfMinPos + ")");
        else {
            System.out.println("В данном массиве нет положительных элементов, поэтому менять ничего не будем.");
            System.exit(0);
        }

        // Меняем местами найденные элементы, выводим массив ищем заново ищем в нём минимальный положительный
        // и максимальный отрицательный элементы и выводим их значения и позиции.
        switchTwoElements(numbers, indOfMaxNeg, indOfMinPos);


        System.out.println("\nБыл произведён обмен значений минимального отрицательного и максимального" +
                " положительного элементов:");
        for (int number : numbers) System.out.printf("%d ", number);
        System.out.println();

        indOfMaxNeg = getIndOfMaxNeg(numbers);
        System.out.println("Максимальный отрицательный элемент в массиве: " + numbers[indOfMaxNeg]
                + " (индекс: " + indOfMaxNeg + ")");

        indOfMinPos = getIndOfMinPos(numbers);
        System.out.println("Минимальный положительный элемент в массиве: " + numbers[indOfMinPos]
                + " (индекс: " + indOfMinPos + ")");

    } //end of main


    /**
     * Производит поиск минимального положительного элемента в массиве, возвращает его индекс или -1,
     * если в передаваемом массиве нет положительных элементов.
     *
     * @param array массив, в котором нужно произвести поиск.
     * @return индекс минимального положительного элемента в массиве или -1, если положительных элементов нет.
     */
    private static int getIndOfMinPos(final int[] array) {
        final int ARRAY_LENGTH = array.length;

        boolean positiveElementFound = false;
        int indOfMinPos = -1;

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (array[i] > 0) {
                if (positiveElementFound) {
                    if (array[i] < array[indOfMinPos]) indOfMinPos = i;
                } else {
                    indOfMinPos = i;
                    positiveElementFound = true;
                }
            }
        }
        return indOfMinPos;
    }


    /**
     * Производит поиск максимального отрицательного элемента в массиве, возвращает его индекс или -1,
     * если в передаваемом массиве нет отрицательных элементов.
     *
     * @param array массив, в котором нужно произвести поиск
     * @return индекс максимального отрицательного элемента в массиве или -1, если отрицательных элементов нет.
     */
    private static int getIndOfMaxNeg(final int[] array) {
        final int ARRAY_LENGTH = array.length;

        boolean negativeElementFound = false;
        int indOfMaxNeg = -1;

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (array[i] < 0) {
                if (negativeElementFound) {
                    if (array[i] > array[indOfMaxNeg]) indOfMaxNeg = i;
                } else {
                    indOfMaxNeg = i;
                    negativeElementFound = true;
                }
            }
        }
        return indOfMaxNeg;
    }


    /**
     * Меняет значения двух элементов массива методом побитового исключающего ИЛИ.
     *
     * @param array   Массив целых чисел, в котором нужно поменять местами 2 элемента.
     * @param INDEX_1 - индекс первого элемента.
     * @param INDEX_2 - индекс второго элемента.
     */
    private static void switchTwoElements(final int[] array, final int INDEX_1, final int INDEX_2) {
        array[INDEX_1] ^= array[INDEX_2];
        array[INDEX_2] ^= array[INDEX_1];
        array[INDEX_1] ^= array[INDEX_2];
    }
}
