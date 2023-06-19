public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Ford");
        Boat boat = new Boat("Sunseeker");

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
