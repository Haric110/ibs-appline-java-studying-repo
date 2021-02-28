package Task_5;

public class Source {
    public static void main(String[] args){
        Calculator calculator = new Calculator(1);
        Calculator additionalCalcs = new Calculator();

        calculator.add(4);
        calculator.sub(2);
        calculator.mul(10);
        calculator.div(3);

        additionalCalcs.initialize(2.5);
        additionalCalcs.exp();

//        calculator.mul(additionalCalcs.getResult());

        System.out.printf("Результаты вычислений: %.6f", calculator.getResult());
    }
}
