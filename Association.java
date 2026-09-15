class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach(Student student) {
        System.out.println(name + " teaches " + student.name);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Rahim");
        Student s = new Student("Saif");

        t.teach(s);
    }
}
