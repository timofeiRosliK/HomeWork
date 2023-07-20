package inheritance.bird;

public class Sparrow extends Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow can sing");
    }
}
