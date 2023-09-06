package jour1.job07;

public class Square {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public void area() {
        float result = (float) Math.pow(this.length, 2);
        System.out.println("Area of the square of length " + this.length + ": " + result);
    }
}
