package jour3.job04;

public class Generic<T> {
    private T t;

    public Generic(T t) {
        this.setT(t);
    }

    public T getT() {
        return this.t;
    }

    public void setT(T t) {
        if (t == null) throw new NullPointerException("Null is not permit!");
        this.t = t;
    }
}
