public class Employee {
    private String fullName; //pole prywant fullName
    private double salary;   //pole prywatne salary

    public Employee(String fullName, double salary) {
        this.fulllName = fullName;
        this.salary = salary;
    }

    public String getName() { //zwracanie employee
        return fullName;
    }

    public double getSalary(double newSalary) { //metoda ktora ustawia nowe wynagrodzenie (salary)
        this.salary = newSalary;
    }

    public String toString() { //metoda publiczna zwracająca Employee i salary
        return "Employee: " + fullName + " Salary: " + salary;
        }
}
