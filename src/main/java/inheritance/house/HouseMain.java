package inheritance.house;

public class HouseMain {
    public static void main(String[] args) {
        Door[] doors = {new Door("Hall door",Lock.CLOSED), new Door( "Bathroom door",Lock.OPEN)};
        Window[] windows = {new Window(Types.BOW),new Window(Types.FIXED),new Window(Types.JALOUSIE)};
        House house = new House(doors,windows);
        house.closeDoor(1);
        house.countWindows();
        house.countDoors();
    }
}
