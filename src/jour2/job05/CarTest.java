package jour2.job05;

public class CarTest {
    public static void main(String[] args) {
        try {
            Car car = new Car();
            car.start();
            car.accelerate();
            car.accelerate();
            car.accelerate();
            car.accelerate();
            car.accelerate();
            car.accelerate();
        } catch (LimitedSpeed e) {
            System.out.println(e.getMessage());
        }
    }
}
