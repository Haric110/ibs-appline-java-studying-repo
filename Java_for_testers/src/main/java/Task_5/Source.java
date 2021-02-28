package Task_5;

public class Source {
    public static void main(String[] args) {

        // ((1 + 4 - 2) * 10 / 3) * (e - 1) = 10 * (e - 1) = 17.18281828...
        Calculator calculator = new Calculator(1)
                .add(4).sub(2).mul(10).div(3).mul(
                        new Calculator(1).exp().sub(1).getResult());

        System.out.printf("Результаты вычислений: %.6f", calculator.getResult());
    }
}
