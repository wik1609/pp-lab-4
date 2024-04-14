import employees.Employee;
import employees.Manager;
import employees.Worker;
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7]; //tablica zmieniona na 7 pracownikow
        employees[0] = new Manager("Jan Tura" , 4000); //zmodyfikowane jako dodanie managera dla indeksu 0
        employees[1] = new Worker("Konrad Duda", 5000, "Technik"); //zmodyfikowane jako dodanie Worker
        employees[2] = new Employee("Kuba Dym", 6000);
        employees[3] = new Employee("Damian Noga", 4500);
        employees[4] = new Worker("Patryk Stary", 7000, "Inżynier"); //zmodyfikowane jako dodanie Worker
        employees[5] = new Employee("Piotrek Bąk", 3500); //nowy pracownik
        employees[6] = new Manager("Michał Nowark", 5600); //nowy manager

        employees[3].setSalary(5000); //zmiana wynagrodzenia dla pracownika 3 a potem dodanie +500
        
        for (Employee employee : employees) { //zwiekszenie wynagrodzenia pracownikow o 500
            if (employee != null) {
                double newSalary = employee.getSalary() + 500;
                employee.setSalary(newSalary);
            }
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setNumberOfSubordinates(5); //5 to liczba pracownikow
                manager.setSalary(7500); //zmiana wynagrodzenia dla managerów na 7500
            }
        }


        System.out.println("Nowe informacje o pracownikach: "); //wyswiietlanie nowych informacji o pracownikach
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}
