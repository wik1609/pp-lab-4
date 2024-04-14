import employees.Employee;
import employees.Manager;
import employees.Worker;
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5]; //tablica z piecioma pracownikami
        employees[0] = new Manager("Jan Tura" , 4000); //zmodyfikowane jako dodanie managera dla indeksu 0
        employees[1] = new Worker("Konrad Duda", 5000, "Technik"); //zmodyfikowane jako dodanie Worker
        employees[2] = new Employee("Kuba Dym", 6000);
        employees[3] = new Employee("Damian Noga", 4500);
        employees[4] = new Worker("Patryk Stary", 7000, "Inżynier"); //zmodyfikowane jako dodanie Worker

        int numberOfNonManagers = 0; //liczenie pracownikow ktorzy nie sa managerem
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                numberOfNonManagers++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(numberOfNonManagers); //ustawiamy liczbe pracownikow ktorzy nie sa managerami jako liczbe pracownikow z indeksem 0

        System.out.println("Pracownik o indeksie 3: " + employees[3]); //dane pracownika o indeksie 3

        employees[3].setSalary(7500); //zmienione wynagrodzenie dla pracownika 3

        System.out.println("\nEmployees:"); //wyswietla dane dla wszystkich pracownikow
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}
