package inheritance.bird;

public class MotherHen extends Bird{
    @Override
    public void fly() {
        System.out.println("Mother hen can fly");
    }

    @Override
    public void sing() {
        System.out.println("Mother Hen can sing");
    }

    public boolean isAbleToCarryEggs(){
        return true;
    }

    public boolean isAbleToHatch(){
        return true;
    }


}
