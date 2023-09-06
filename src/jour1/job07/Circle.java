package jour1.job07;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        float result = (float) (Math.PI*Math.pow(radius, 2));
        System.out.println("Area of the circle of radius " + this.radius + ": " + result);
    }
}
