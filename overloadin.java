class Display {

    // Method for int
    void show(int number) {
        System.out.println("Integer: " + number);
    }

    // Overloaded method for String
    void show(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        Display d = new Display();

        d.show(100);
        d.show("Hello");
    }
}
