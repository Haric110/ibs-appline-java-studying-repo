package Task_5.Calculators;

public class AdvancedCalculator extends BasicCalculator {
    /**
     * Число пи, математическая константа, равная отношению длины окружности к её диаметру.
     */
    public static final double PI = 3.141592653589793;

    /**
     * Число Эйлера, основание натурального логарифма.
     */
    public static final double E = 2.718281828459045;

    public enum AngleBase {
        deg, rad
    }

    private AngleBase angleBase = AngleBase.rad;

    public AdvancedCalculator(final double initialValue, final AngleBase angleBase) {
        super(initialValue);
        this.angleBase = angleBase;
    }

    public AdvancedCalculator(final double initialValue) {
        super(initialValue);
    }

    public AdvancedCalculator() {
    }

    /*Переопределение и сокрытие метода из базового класса*/
    public AdvancedCalculator initialize(final double arg){
        this.result = arg;
        return this;
    }

    public AngleBase getAngleBase() {
        return angleBase;
    }

    public void setAngleBase(AngleBase angleBase) {
        this.angleBase = angleBase;
    }

    /**
     * Возвращает абсолютное значение аргумента.
     *
     * @param ARG аргумент
     * @return фасолютное значение аргумента
     */
    public static double abs(final double ARG) {
        if (ARG < 0) return -ARG;
        else return ARG;
    }

    /**
     * Возвращает число e (число Эйлера), возведённое в степень текущего результата цепочки вычислений.
     * Использует Math.pow().
     *
     * @return возвращает цепочку вычислений после выполнения операции
     */
    public AdvancedCalculator exp() {
        this.result = Math.pow(E, this.result);
        return this;
    }

    public void switchAngleBase (AngleBase angleBase) {
        this.angleBase = angleBase;
    }

    /**
     * Принимает, текущий результат цепочки вычислений за угловое значение в градусах и переводит в радианы.
     * @return возвращает цепочку вычислений после преобразования результата в угловое значение в градусах
     */
    public AdvancedCalculator toRadians() {
        this.result *= PI;
        this.result /= 180.0;
        return this;
    }

    /**
     * Принимает текущий результат цепочки вычислений за угловое значение в радианах и переводит в градусы.
     * @return возвращает цепочку вычислений после преобразования результата в угловое значение в градусах
     */
    public AdvancedCalculator toDegrees() {
        this.result *= 180;
        this.result /= PI;
        return this;
    }

    /**
     * Вычисляет синус от текущего результата цепочки вычислений.
     * @return возвращает цепочку объекта после вычисления синуса
     */
    public AdvancedCalculator sin() {
        if (this.angleBase != AngleBase.rad) toRadians();
        this.result = Math.sin(this.result);
        return this;
    }

    /**
     * Вычисляет синус от текущего результата цепочки вычислений.
     * @param angleBase угловые единицы: градусы (base.deg) или радианы (base.rad)
     * @return возвращает цепочку объекта после вычисления синуса
     */
    public AdvancedCalculator sin(AngleBase angleBase) {
        if (angleBase != AngleBase.rad) toRadians();
        this.result = Math.sin(result);
        return this;
    }

    /**
     * Вычисляет косинус от текущего результата цепочки вычислений.
     *
     * @return возвращает цепочку объекта после вычисления косинуса
     */
    public AdvancedCalculator cos() {
        if (this.angleBase != AngleBase.rad) toRadians();
        this.result = Math.cos(this.result);
        return this;
    }

    /**
     * Вычисляет косинус от текущего результата цепочки вычислений.
     * @param angleBase угловые единицы: градусы (base.deg) или радианы (base.rad)
     * @return возвращает цепочку объекта после вычисления косинуса
     */
    public AdvancedCalculator cos(AngleBase angleBase) {
        if (angleBase != AngleBase.rad) toRadians();
        this.result = Math.cos(result);
        return this;
    }

    /**
     * Вычисляет тангенс от текущего результата цепочки вычислений.
     *
     * @return возвращает цепочку объекта после вычисления тангенса
     */
    public AdvancedCalculator tan() {
        if (this.angleBase != AngleBase.rad) toRadians();
        this.result = Math.tan(this.result);
        return this;
    }

    /**
     * Вычисляет тангенс от текущего результата цепочки вычислений.
     *
     * @param angleBase угловые единицы: градусы (base.deg) или радианы (base.rad)
     * @return возвращает цепочку объекта после вычисления тангенса
     */
    public AdvancedCalculator tan(AngleBase angleBase) {
        if (angleBase != AngleBase.rad) toRadians();
        this.result = Math.tan(result);
        return this;
    }

    /**
     * Вычисляет котангенс от текущего результата цепочки вычислений.
     *
     * @return возвращает цепочку объекта после вычисления котангенса
     */
    public AdvancedCalculator ctg() {
        if (this.angleBase != AngleBase.rad) toRadians();
        this.result = 1 / Math.tan(this.result);
        return this;
    }

    /**
     * Вычисляет котангенс от текущего результата цепочки вычислений.
     *
     * @param angleBase угловые единицы: градусы (base.deg) или радианы (base.rad)
     * @return возвращает цепочку объекта после вычисления котангенса
     */
    public  AdvancedCalculator ctg(AngleBase angleBase) {
        if (angleBase != AngleBase.rad) toRadians();
        this.result = 1.0 / Math.tan(result);
        return this;
    }


    /**
     * Вычисляет арксинус от текущего результата цепочки вычислений.
     *
     * @return возвращает цепочку объекта после вычисления арксинуса
     */
    public AdvancedCalculator asin() {
        this.result = Math.asin(this.result);
        if (this.angleBase == AngleBase.deg) return toDegrees();
        return this;
    }

    /**
     * Вычисляет арксинус от текущего результата цепочки вычислений.
     *
     * @param angleBase угловые единицы: градусы (base.deg) или радианы (base.rad). Значения должны лежать от -1 до 1
     *                  (в радианах) или от -90 до 90 в градусах
     * @return возвращает цепочку объекта после вычисления арксинуса
     */
    public AdvancedCalculator asin(AngleBase angleBase) {
        this.result = Math.asin(this.result);
        if (angleBase == AngleBase.deg) return toDegrees();
        return this;
    }

    /**
     * Вычисляет арккосинус от текущего результата цепочки вычислений.
     *
     * @return возвращает цепочку объекта после вычисления арккосинуса
     */
    public AdvancedCalculator acos() {
        this.result = Math.acos(this.result);
        if (this.angleBase == AngleBase.deg) return toDegrees();
        return this;
    }

    /**
     * Вычисляет арккосинус от текущего результата цепочки вычислений.
     *
     * @param angleBase угловые единицы: градусы (base.deg) или радианы (base.rad)
     * @return возвращает цепочку объекта после вычисления арккосинуса
     */
    public AdvancedCalculator acos(AngleBase angleBase) {
        this.result = Math.acos(this.result);
        if (angleBase == AngleBase.deg) return toDegrees();
        return this;
    }
}
