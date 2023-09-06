package jour1.job02;

public class Car {
    private String brand;
    private String color;
    private int speed;

    public void start() {
        System.out.println("The car starts.");
    }

    public void stop() {
        this.speed = 0;
        System.out.println("The car stops. Speed Reset to 0 km/h.");
    }

    public void accelerate() {
        this.speed += 10;
        System.out.println("The speed of the car is now " + this.speed + " km/h.");
    }
}
