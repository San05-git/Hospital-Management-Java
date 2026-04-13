import java.util.*;

public class HospitalManager {
public static final String R = "\u001b[0m";
public static final String G = "\u001b[32m";

private Queue<Patient> q = new LinkedList<>();

public void addPatient(int id, String name, String issue) {
q.add(new Patient(id, name, issue));
}

public void treatPatient() {
if (q.isEmpty()) {
System.out.println("EMPTY");
} else {
Patient p = q.poll();
System.out.println(G + "----------" + R);
System.out.println("CALLING");
System.out.println(G + "----------" + R);
System.out.println("NAME:" + p.name);
System.out.println("ID:" + p.id);
System.out.println(G + "----------" + R);
}
}

public void displayQueue() {
if (q.isEmpty()) {
System.out.println("EMPTY");
} else {
for (Patient p : q) {
System.out.println(p.id + ":" + p.name);
}
}
}
}

class Patient {
int id;
String name;
String issue;
Patient(int id, String name, String issue) {
this.id = id;
this.name = name;
this.issue = issue;
}
}