package inheritance.house;

public class House {
    protected Door[] doors;
    protected Window[] windows;


    public House(Door[] doors, Window[] windows) {
        this.doors = doors;
        this.windows = windows;
    }

    public void closeDoor(int i) {
        if (doors[i].lock == Lock.CLOSED) {
            System.out.println("Door is closed");
        } else {
            System.out.println("Door is open");
        }
    }

    public void countWindows() {
        int count = 0;
        for (Window window : windows) {
            if (window != null) {
                count++;
            }
        }
        System.out.println("The number of windows is " + count);
    }

    public void countDoors() {
        int count = 0;
        for (Door door : doors) {
            if (door != null) {
                count++;
            }
        }
        System.out.println("The number of doors is " + count);
    }
}
