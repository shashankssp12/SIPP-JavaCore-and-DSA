
// Base class
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display common employee details
    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager | Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer | Language: " + programmingLanguage);
    }
}

// Subclass: Intern
class Intern extends Employee {
    int internshipDuration; // in months

    Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern | Duration: " + internshipDuration + " months");
    }
}

// Main class to test the hierarchy
public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 95000, 10);
        Developer developer = new Developer("Bob", 102, 75000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, 6);

        System.out.println("--- Employee Details ---");
        manager.displayDetails();
        System.out.println();

        developer.displayDetails();
        System.out.println();

        intern.displayDetails();
    }
}
