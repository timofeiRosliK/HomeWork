package inheritance.puppy;

import inheritance.puppy.Animal;

public class Dog extends Animal {
    protected String kind;
    public Dog(String name, String kind){
        super(name);
        this.kind = kind;
    }


}
