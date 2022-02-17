package peaksoft.inyterface;

public class Eagle extends Animals implements Flyable{
    public Eagle() {
    }

    public Eagle(String name, byte age, double weight, String colour) {
        super(name, age, weight, colour);
    }

    @Override
    void sleep() {
        System.out.println(" Eagle can't sleep in the sky");

    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying above the mountains.");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating the caught prey.");

    }
}
