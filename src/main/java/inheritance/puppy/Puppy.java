package inheritance.puppy;

import inheritance.puppy.Actions;
import inheritance.puppy.Dog;

public class Puppy extends Dog implements Actions {

    public Puppy(String name, String kind) {
        super(name, kind);
    }


    @Override
    public void voice() {
        System.out.println("Gav, gav!");
    }

    @Override
    public void jump() {
        System.out.println("Puppy can jump");
    }

    @Override
    public void run() {
        System.out.println("Puppy can run");
    }

    @Override
    public void bite() {
        System.out.println("Puppy can bite");
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
