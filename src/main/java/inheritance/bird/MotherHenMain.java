package inheritance.bird;

public class MotherHenMain {
    public static void main(String[] args) {
        MotherHen hen = new MotherHen();
        System.out.println("Could hen fly ?");
        hen.fly();
        System.out.println("Could hen sing ?");
        hen.sing();
        System.out.println("Is hen able to carry eggs? " + hen.isAbleToCarryEggs());
        System.out.println("Is hen able to hatch? " + hen.isAbleToCarryEggs());


    }
}
