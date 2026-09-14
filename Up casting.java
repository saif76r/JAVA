class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Upcasting
        Animal a = d;

        a.sound();
    }
}
