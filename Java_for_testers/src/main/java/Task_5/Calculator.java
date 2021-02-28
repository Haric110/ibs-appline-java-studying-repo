package Task_5;

public class Calculator {
    private static final double PI = 3.141592653589793;
    private static final double E = 2.718281828459045;

    public enum base {
        deg, rad
    }

    private double result = 0;
    private base angleBase = base.rad;

    public Calculator(double initialValue) {
        this.result = initialValue;
    }

    public Calculator(double initialValue, base angleBase) {
        this.result = initialValue;
        this.angleBase = angleBase;
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

    /**
     * Возвращает число e (число Эйлера), возведённое в степень текущего результата цепочки вычислений.
     * Использует Math.pow().
     *
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public Calculator exp() {
        this.result = Math.pow(E, this.result);
        return this;
    }

    public double getResult() {
        return this.result;
    }




    public static double pow(double base, int degree) {
        if (degree == 0) return 1.0;
        else if (degree == 1) return base;


        return pow(base, --degree);
    }

    public static double abs(final double arg) {
        if (arg < 0) return -arg;
        return arg;
    }

    /*public double sin() {
        double x, x1 = 0, eps = 1e-8;

        if (this.angleBase == base.deg) x = toRadians();
        else x = this.result;

        do {

        }while (abs(x - x1) > eps);

        this.result = x1;
        return result;
    }*/

    /**
     * Принимает, текущий результат цепочки вычислений за угловое значение в градусах и переводит в радианы.
     *
     * @return угловое значение в радианах
     */
    public double toRadians() {
        this.result *= PI;
        this.result /= 180.0;
        return this.result;
    }

    /**
     * Принимает текущий результат цепочки вычислений за угловое значение в радианах и переводит в градусы.
     *
     * @return угловое значение в градусах
     */
    public double toDegrees() {
        this.result *= 180;
        this.result /= PI;
        return this.result;
    }

    public void switchAngleBase (base angleBase) {
        this.angleBase = angleBase;
    }
}
