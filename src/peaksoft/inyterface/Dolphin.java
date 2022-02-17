package peaksoft.inyterface;

public class Dolphin extends Animals implements Swimable{
    public Dolphin() {
    }

    public Dolphin(String name, byte age, double weight, String colour) {
        super(name, age, weight, colour);
    }

    @Override
    void sleep() {
        System.out.println("Dolphin can't sleeping in the sea. ");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming in the Sea.");

    }

    @Override
    public void breath() {
        System.out.println("Dolphin has to breathe.");

    }
}
