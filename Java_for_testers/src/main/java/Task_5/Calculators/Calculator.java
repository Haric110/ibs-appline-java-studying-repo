package Task_5.Calculators;

public class Calculator {

    protected double result = 0;

    public Calculator(double initialValue) {
        this.result = initialValue;
    }

    public Calculator() {}

    /**
     * Инициализирует начальное значение. Левый аргумент для последующих операторов.
     * @param arg первичный аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public Calculator initialize(double arg){
        this.result = arg;
        return this;
    }

    /**
     * Прибавляет правый аргумент к результату вычислений.
     *
     * @param rArg правый аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public Calculator add(double rArg) {
        this.result += rArg;
        return this;
    }

    /**
     * Вычитает правый аргумент из промежуточного результата.
     *
     * @param rArg правый аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public Calculator sub(double rArg) {
        this.result -= rArg;
        return this;
    }

    /**
     * Выполняет деление результата вычислений на правый аргумент.
     *
     * @param rArg правый аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public Calculator div(double rArg) {
        this.result /= rArg;
        return this;
    }

    /**
     * Выполняет умножение результата цепочки вычислений на правый аргумент.
     *
     * @param rArg правый аргумент
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public Calculator mul(double rArg) {
        this.result *= rArg;
        return this;
    }

    public double getResult() {
        return this.result;
    }

}
