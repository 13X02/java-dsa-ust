package Assignment_Course_2.Problem2;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class MemberProblem {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "John";
        emp.age = 30;
        emp.phoneNumber = "1234567890";
        emp.address = "123 Main St";
        emp.salary = 50000;
        emp.specialization = "Software Engineering";

        Manager manager = new Manager();
        manager.name = "Alice";
        manager.age = 35;
        manager.phoneNumber = "9876543210";
        manager.address = "456 Elm St";
        manager.salary = 70000;
        manager.department = "Human Resources";

        System.out.println("Employee details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println("\nManager details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}

