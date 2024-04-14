import employees.*;
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5]; //tablica z piecioma pracownikami
        employees[0] = new Manager("Jan Tura" , 4000); //zmodyfikowane
        employees[1] = new Worker("Konrad Duda", 5000);
        employees[2] = new Employee("Kuba Dym", 6000);
        employees[3] = new Employee("Damian Noga", 4500);
        employees[4] = new Worker("Patryk Stary", 7000);

        System.out.println("Pracownik o indeksie 3: " + employees[3]); //dane pracownika o indeksie 3

        employees[3].setSalary(7500);

        System.out.println("/nEmplyees:"); //wyswietla dane dla wszystkich pracownikow
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
