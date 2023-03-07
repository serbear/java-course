public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return this.getClass().getName() + " -> " + "engine started";
    }

    public String accelerate() {
        return this.getClass().getName() + " -> " + "accelerating";
    }

    public String brake() {
        return this.getClass().getName() + " -> " + "braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
