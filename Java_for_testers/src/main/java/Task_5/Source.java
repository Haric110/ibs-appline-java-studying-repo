package Task_5;

import Task_5.Calculators.AdvancedCalculator;
import Task_5.Calculators.BasicCalculator;

public class Source {
    public static void main(String[] args) {

        try {
            // ((1 + 4 - 2) * 10 / 3) * (e - 1) = 10 * (e - 1) = 17.18281828...
            BasicCalculator calculator = new BasicCalculator(1)
                    .add(4).sub(2).mul(10).div(3).mul(
                            new AdvancedCalculator(1).exp().sub(1).getResult());

            System.out.printf("Результаты вычислений: %.6f\n", calculator.getResult());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            // Попробуем разделить на 0
            // ((1 + 4 - 2) * 10 / 0) * (e - 1) = ...
            BasicCalculator calculator = new BasicCalculator(1)
                    .add(4).sub(2).mul(10).div(0).mul(
                            new AdvancedCalculator(1).exp().sub(1).getResult());

            System.out.printf("Результаты вычислений: %.6f\n", calculator.getResult());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        AdvancedCalculator calc2 = new AdvancedCalculator();

        try {
            calc2.initialize(Math.PI).div(8).div(
                    new AdvancedCalculator(30).sin(AdvancedCalculator.AngleBase.deg).getResult());
            calc2.tan(AdvancedCalculator.AngleBase.rad).add(1);

            System.out.printf("Результаты вычислений: %.6f\n", calc2.getResult());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        double deg = Math.PI;

        System.out.printf("%.4f радиан = %.0f градусов\n", deg, calc2.initialize(deg).toDegrees().getResult());
    }
}
