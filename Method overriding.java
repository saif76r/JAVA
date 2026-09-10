class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.run();
    }
}
