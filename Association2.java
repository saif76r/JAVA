class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void treat(Patient patient) {
        System.out.println(name + " is treating " + patient.name);
    }
}

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        Doctor d = new Doctor("Dr. Ahmed");
        Patient p = new Patient("Karim");

        d.treat(p);
    }
}
