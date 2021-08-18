package CalculatorTests;

import Task_5.Calculators.BasicCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CalculatorTests {
    @Test
    public void initialBasicCalculatorResultIsZero() {
        Assert.assertEquals("Начальное значение результата должно быть равно 0.",
                0,
                new BasicCalculator().getResult(),
                0);
    }

    @Test
    public void preassignedInitialValue() {
        Random random = new Random();
        final double INITIAL_RESULT = random.nextDouble();

        Assert.assertEquals("Заданное в конструкторе начальное значение не соответствует начальному результату",
                INITIAL_RESULT,
                new BasicCalculator(INITIAL_RESULT).getResult(),
                0);
    }

    @Test
    public void testInitializing() {
        Random random = new Random();

        final double INITIAL_RESULT = random.nextDouble();
        BasicCalculator bc = new BasicCalculator();
        bc.initialize(INITIAL_RESULT);

        Assert.assertEquals("Не работает инициализация.",
                INITIAL_RESULT,
                bc.getResult(),
                0);
    }

    @Test
    public void testSum() {
        Random random = new Random();
        BasicCalculator bc = new BasicCalculator();

        for (int i = 0; i < 100; i++) {
            double
                    initial = random.nextDouble(),
                    rightArg = random.nextDouble();

            bc.initialize(initial);
            bc.add(rightArg);

            Assert.assertEquals("Несоответствие суммы.",
                    initial + rightArg,
                    bc.getResult(),
                    0);
        }
    }

    @Test
    public void testSubtraction() {
        Random random = new Random();
        BasicCalculator bc = new BasicCalculator();

        for (int i = 0; i < 100; i++) {
            double
                    initial = random.nextDouble(),
                    rightArg = random.nextDouble();

            bc.initialize(initial);
            bc.sub(rightArg);

            Assert.assertEquals("Несоответствие разности.",
                    initial - rightArg,
                    bc.getResult(),
                    0);
        }
    }

    @Test
    public void testMultiplication() {
        Random random = new Random();
        BasicCalculator bc = new BasicCalculator();

        for (int i = 0; i < 100; i++) {
            double
                    initial = random.nextDouble(),
                    rightArg = random.nextDouble();

            bc.initialize(initial);
            bc.mul(rightArg);

            Assert.assertEquals("Несоответствие произведения.",
                    initial * rightArg,
                    bc.getResult(),
                    0);
        }
    }

    @Test
    public void testDivisionByNonZeroValue() {
        Random random = new Random();
        BasicCalculator bc = new BasicCalculator();

        for (int i = 0; i < 100; i++) {
            // Генеринуем гарантированно положительные аргументы от 10^-4 до 10^4
            double
                    initial = 1e-4 + random.nextDouble() * 1e+4,
                    rightArg = 1e-4 + random.nextDouble() * 1e+4;

            bc.initialize(initial);
            bc.div(rightArg);

            Assert.assertEquals("Несоответствие частного.",
                    initial / rightArg,
                    bc.getResult(),
                    0);
        }
    }

    /*@Test
    public void testDivisionByZero() {
        Random random = new Random();
        BasicCalculator bc = new BasicCalculator();

        double
                initial = 1e-4 + random.nextDouble() * 1e+4;

        bc.initialize(initial);

        IllegalArgumentException thrownException = Assert.assertThrows(
                "Ожидалось исключение IllegalArgumentException, но его нет.",
                IllegalArgumentException.class,
                () -> bc.div(0) );

        Assert.assertTrue(thrownException.getMessage().contains("Деление на 0 недопустимо."));
    }*/

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero2() {
        Random random = new Random();
        BasicCalculator bc = new BasicCalculator();

        double
                initial = 1e-4 + random.nextDouble() * 1e+4;

        bc.initialize(initial);

        try {
            bc.div(0);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Деление на 0 недопустимо.", e.getMessage());
            throw e;
        }
        Assert.fail("Ожидалось исклюючение IllegalОжидалось исключение IllegalArgumentException, но его нет.");
    }
}
