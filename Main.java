import java.util.Scanner;

public class Main {
public static final String RESET = "\u001B[0m";
public static final String CYAN = "\u001B[36m";

public static void main(String[] args) {
HospitalManager hospital = new HospitalManager();
Scanner sc = new Scanner(System.in);
int choice = 0;

while (choice != 4) {
System.out.println(CYAN + "=== HOSPITAL_SYSTEM ===" + RESET);
System.out.println("1.Add");
System.out.println("2.Treat");
System.out.println("3.View");
System.out.println("4.Exit");
System.out.print("Choice: ");

try {
choice = Integer.parseInt(sc.nextLine());
} catch (Exception e) {
continue;
}

if (choice == 1) {
System.out.print("ID: ");
int id = Integer.parseInt(sc.nextLine());
System.out.print("Name: ");
String name = sc.nextLine();
System.out.print("Issue: ");
String issue = sc.nextLine();
hospital.addPatient(id, name, issue);
} else if (choice == 2) {
hospital.treatPatient();
} else if (choice == 3) {
hospital.displayQueue();
}
}
sc.close();
}
}