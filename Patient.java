public class Patient {
    int id;
    String name;
    String ailment;

    public Patient(int id, String name, String ailment) {
        this.id = id;
        this.name = name;
        this.ailment = ailment;
    }

    @Override
    public String toString() {
        return "[ID: " + id + " | Name: " + name + " | Issue: " + ailment + "]";
    }
}