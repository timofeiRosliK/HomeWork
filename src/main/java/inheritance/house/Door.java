package inheritance.house;

import inheritance.flower.Shape;

public class Door {
    protected String name;
    protected Lock lock;

    public Door(String name,Lock lock) {
        this.lock = lock;
        this.name = name;
    }
}
