package task.task5;

public class SuperPair<T1, T2, T3 extends Number> {
    private T1 parameter1;
    private T2 parameter2;
    private T3 parameter3;

    public SuperPair(T1 parameter1, T2 parameter2, T3 parameter3) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.parameter3 = parameter3;
    }

    @Override
    public String toString() {
        return "SuperPair{" +
                "parameter1=" + parameter1 +
                ", parameter2=" + parameter2 +
                ", parameter3=" + parameter3 +
                '}';
    }

    public T1 getParameter1() {
        return parameter1;
    }

    public void setParameter1(T1 parameter1) {
        this.parameter1 = parameter1;
    }

    public T2 getParameter2() {
        return parameter2;
    }

    public void setParameter2(T2 parameter2) {
        this.parameter2 = parameter2;
    }

    public T3 getParameter3() {
        return parameter3;
    }

    public void setParameter3(T3 parameter3) {
        this.parameter3 = parameter3;
    }
}
