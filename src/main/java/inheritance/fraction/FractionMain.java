package inheritance.fraction;

public class FractionMain {
    public static void main(String[] args) {
        Number[] numbers = {new Number(12.0),new Number(15.0),new Number(3.0)};
        Fraction fraction = new Fraction(numbers);
        fraction.sum();
        fraction.division(120);
        fraction.substraction(100);
        fraction.multiplication();
    }
}
