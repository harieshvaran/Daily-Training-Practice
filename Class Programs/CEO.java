import java.util.Scanner;
class Employee {
    String employeeName;
    double basicsalary;
    Employee(String employeeName, double basicsalary) {
        this.employeeName = employeeName;
        this.basicsalary = basicsalary;     
    }
    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicsalary);
    }
}
class Manager extends Employee {
    double bonus;
    Manager(String employeeName, double basicsalary, double bonus) {
        super(employeeName, basicsalary);
        this.bonus = bonus;
    }
    void display() {
        displayEmployee();
        double totalsal = basicsalary + bonus;
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalsal);
    }
}

class CEO extends Manager {
    double stockOptions;
    CEO(String employeeName, double basicsalary, double bonus, double stockOptions) {
        super(employeeName, basicsalary, bonus);
        this.stockOptions = stockOptions;
    }

    void display(){
        displayEmployee();
        System.out.println("Stock option : "+ stockOptions);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        CEO ceo = new CEO("arun", 10000, 5000, n);


        ceo.display();
    }
}

