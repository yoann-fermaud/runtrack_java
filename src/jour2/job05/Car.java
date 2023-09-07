package jour2.job05;

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

    public void accelerate() throws LimitedSpeed {
        this.speed += 20;
        if (this.speed >= 100) {
            throw new LimitedSpeed();
        }
        System.out.println("The speed of the car is now " + this.speed + " km/h.");
    }
}
