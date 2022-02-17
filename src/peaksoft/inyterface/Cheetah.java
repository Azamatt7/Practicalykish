package peaksoft.inyterface;

public class Cheetah extends Animals implements Runnable {
    public Cheetah() {
    }

    public Cheetah(String name, byte age, double weight, String colour) {
        super(name, age, weight, colour);
    }

    @Override
    void sleep() {
        System.out.println("Cheetah is sleeping on safari.");

    }

    @Override
    public void run() {
        System.out.println("Cheetah runs about 80km/h");

    }

    @Override
    public void stop() {
        System.out.println("Cheetah can stop ");

    }
}
