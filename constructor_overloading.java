class Car {

    String model;
    int year;

    // Constructor 1
    Car() {
        model = "Unknown";
        year = 0;
    }

    // Constructor 2
    Car(String m) {
        model = m;
        year = 0;
    }

    // Constructor 3
    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car("Toyota");
        Car c3 = new Car("BMW", 2025);

        c1.display();
        c2.display();
        c3.display();
    }
}
