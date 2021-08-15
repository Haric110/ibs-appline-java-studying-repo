package Task_5.Calculators;

public class BasicCalculator {

    protected double result = 0;

    public BasicCalculator(final double initialValue) {
        this.result = initialValue;
    }

    public BasicCalculator() {}

    /**
     * Инициализирует начальное значение. Левый аргумент для последующих операторов.
     * @param arg первичный аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public BasicCalculator initialize(final double arg){
        this.result = arg;
        return this;
    }

    /**
     * Прибавляет правый аргумент к результату вычислений.
     *
     * @param R_ARG правый аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public BasicCalculator add(final double R_ARG) {
        this.result += R_ARG;
        return this;
    }

    /**
     * Вычитает правый аргумент из промежуточного результата.
     *
     * @param R_ARG правый аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public BasicCalculator sub(final double R_ARG) {
        this.result -= R_ARG;
        return this;
    }

    /**
     * Выполняет деление результата вычислений на правый аргумент.
     *
     * @param R_ARG правый аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public BasicCalculator div(final double R_ARG) throws IllegalAccessException {
        if(R_ARG == 0) {
            throw new IllegalAccessException("Деление на 0 недопустимо.");
        }
        this.result /= R_ARG;
        return this;
    }

    /**
     * Выполняет умножение результата цепочки вычислений на правый аргумент.
     *
     * @param R_ARG правый аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public BasicCalculator mul(final double R_ARG) {
        this.result *= R_ARG;
        return this;
    }

    public double getResult() {
        return this.result;
    }

}
