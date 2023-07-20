package inheritance.puppy;

import inheritance.puppy.Puppy;

public class PuppyMain {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Gera","Shih tzu");
        System.out.println("puppy = " + puppy);
        System.out.println("What kind of voice does puppy make ?");
        puppy.voice();
        System.out.println("Could puppy run ?");
        puppy.run();
        System.out.println("Could puppy bite ?");
        puppy.bite();
        System.out.println("Could puppy jump ?");
        puppy.jump();

    }
}
