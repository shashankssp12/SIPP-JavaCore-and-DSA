import java.util.*;

class Employee {
    private String name;
    private double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
         return name;
         }
    public double getSalary() {
         return salary;
         }
    public int getAge() {
         return age; }

    @Override
    public String toString() {
        return String.format("%s, %.2f, age%d", name, salary, age);
    }
}

public class SmartSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shashank", 700000, 30));
        employees.add(new Employee("Madhu", 800000, 28));
        employees.add(new Employee("Pushpendra", 500000, 25));
        employees.add(new Employee("Aditya", 600000, 35));

        Comparator<Employee> byName = Comparator.comparing(Employee::getName);
        Comparator<Employee> bySalary = Comparator.comparingDouble(Employee::getSalary);
        Comparator<Employee> byAge = Comparator.comparingInt(Employee::getAge);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort by: 1-Name 2-Salary 3-Age");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(employees, byName);
                break;
            case 2:
                Collections.sort(employees, bySalary);
                break;
            case 3:
                Collections.sort(employees, byAge);
                break;
            default:
                System.out.println("Invalid choice. Sorting by name.");
                Collections.sort(employees, byName);
        }

        System.out.println("Sorted Employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}