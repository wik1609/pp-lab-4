package employees;
public class Employee {
    private String fullName; //pole prywant fullName
    private double salary;   //pole prywatne salary

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() { //zwracanie employee
        return fullName;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }
    

    public String toString() { //metoda publiczna zwracająca Employee i salary
        return "Employee: " + fullName + " Salary: " + salary;
        }
}
