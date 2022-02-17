package peaksoft.inyterface;

public abstract class Animals {
    private String name;
    private byte age;
    private double weight;
    private String colour;

    public Animals() {
    }

    public Animals(String name, byte age, double weight, String colour) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
    }

    abstract void sleep();

    public void makeSound(){
        System.out.println("each animal is making sound");
    }
    public void sense(){
        System.out.println("each animal is smelling");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Animals: " +
                "name is " + name +
                ", age is " + age +"years old"+
                ", weight is " + weight +"kg"+
                ", colour is " + colour ;

    }
}
