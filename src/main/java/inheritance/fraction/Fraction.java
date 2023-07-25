package inheritance.fraction;

public class Fraction implements Method {
    protected Number[] numbers;

    public Fraction(Number[] numbers) {
        this.numbers = numbers;
    }

    public void sum(){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].getValue();
        }
        System.out.println("sum = " + sum);
    }

    @Override
    public void substraction(double n) {
        double sub = n;
        for (int i = 0; i < numbers.length; i++) {
            sub -= numbers[i].getValue();

        }
        System.out.println("sub = " + sub);
    }

    @Override
    public void division(double n) {
        double div = n;
        for (int i = 0; i < numbers.length; i++) {
            div /= numbers[i].getValue();

        }
        System.out.println("div = " + div);

    }

    @Override
    public void multiplication() {
        double mult = 1;
        for (int i = 0; i < numbers.length; i++) {
            mult *= numbers[i].getValue();
        }
        System.out.println("mult = " + mult);
    }
}
