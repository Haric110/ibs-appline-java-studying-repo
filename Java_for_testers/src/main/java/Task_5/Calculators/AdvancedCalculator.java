package Task_5.Calculators;

public class AdvancedCalculator extends Calculator {
    private static final double PI = 3.141592653589793;
    private static final double E = 2.718281828459045;

    public enum base {
        deg, rad
    }

    public AdvancedCalculator(double initialValue, base angleBase) {
        super(initialValue);
        this.angleBase = angleBase;
    }

    public AdvancedCalculator(double initialValue) {
        super(initialValue);
    }

    private base angleBase = base.rad;

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

    public void switchAngleBase (base angleBase) {
        this.angleBase = angleBase;
    }

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

     /*public double sin() {
        double x, x1 = 0, eps = 1e-8;

        if (this.angleBase == base.deg) x = toRadians();
        else x = this.result;

        do {

        }while (abs(x - x1) > eps);

        this.result = x1;
        return result;
    }*/
}
