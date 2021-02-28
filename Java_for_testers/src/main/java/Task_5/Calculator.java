package Task_5;

public class Calculator {
    private static final double PI = 3.141592653589793;
    private static final double E = 2.718281828459045;

    public enum base {
        deg, rad
    }

    private double result = 0;
    private base angleBase = base.rad;

    public Calculator(double result) {
        this.result = result;
    }

    public Calculator(double result, base angleBase) {
        this.result = result;
        this.angleBase = angleBase;
    }

    public Calculator() {}

    public void initialize(double arg){
        this.result = arg;
    }

    /**
     * Прибавляет правый аргумент к результату вычислений.
     *
     * @param rArg правый аргумент
     */
    public void add(double rArg) {
        this.result += rArg;
    }

    /**
     * Вычитает правый аргумент из промежуточного результата.
     *
     * @param rArg правый аргумент
     */
    public void sub(double rArg) {
        this.result -= rArg;
    }

    /**
     * Выполняет деление результата вычислений на правый аргумент.
     *
     * @param rArg правый аргумент
     */
    public void div(double rArg) {
        this.result /= rArg;
    }

    /**
     * Выполняет умножение результата цепочки вычислений на правый аргумент.
     *
     * @param rArg правый аргумент
     */
    public void mul(double rArg) {
        this.result *= rArg;
    }

    public double getResult() {
        return this.result;
    }




    /**
     * Возвращает число e (число Эйлера), возведённое в степень текущего результата цепочки вычислений.
     *
     */
    public void exp() {
        this.result = Math.pow(E, this.result);
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
