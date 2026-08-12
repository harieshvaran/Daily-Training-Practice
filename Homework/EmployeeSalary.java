// Q2. EMPLOYEE SALARY SYSTEM

// A company has different types of employees.

// Every employee has:
// - Employee ID
// - Employee Name
// - Basic Salary

// But the final salary calculation differs depending on the employee type.

// The company has:
// - Developer
// - Tester

// Requirements:
// - Create an abstract class Employee.
// - Add common employee details.
// - Create an abstract method calculateSalary().
// - Create Developer and Tester classes.
// - Override calculateSalary() in both classes.
// - Display the final salary.

// Example:
// Developer Salary = Basic Salary + Developer Bonus
// Tester Salary = Basic Salary + Testing Allowance

abstract class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.basicSalary = salary;
    }

    abstract double calculateSalary();
}

class Developer extends Employee {
    double developerBonus;

    Developer(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.developerBonus = bonus;
    }

    double calculateSalary() {
        return basicSalary + developerBonus;
    }
}

class Tester extends Employee {
    double testingAllowance;

    Tester(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.testingAllowance = allowance;
    }

    double calculateSalary() {
        return basicSalary + testingAllowance;
    }
}

class EmployeeSalary {
    public static void main(String[] args) {
        Employee dev = new Developer(1, "Arun", 50000, 10000);
        System.out.println("Developer Salary: " + dev.calculateSalary());

        Employee tester = new Tester(2, "Maha", 40000, 5000);
        System.out.println("Tester Salary: " + tester.calculateSalary());
    }
}