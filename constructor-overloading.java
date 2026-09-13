class Student {

    String name;
    int age;

    // Constructor 1: No parameter
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2: One parameter
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3: Two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Saif");
        Student s3 = new Student("Saif", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}
