package employees;

public class Manager extends Employee {
    public int numberOfSubordinates; //ilosc pracownikow managera

    public Manager(String fullName, double salary) {
        super(fullName, salary);
        this.numberOfSubordinates = 0; //liczba 0 oznacza ilosc pracownikow domyslną
    }

    public int getNumberOfSubordinates() { //zwracanie liczby pracownikow managera
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int newNumberOfSubordinates) { //metoda ktora ustawia nowa liczbe pracownikow managera
        this.numberOfSubordinates = newNumberOfSubordinates;
    }

    public String toString() { //metoda zwracajaca informacje o managerze
        return "Manager - " + getFullName() + ", Salary - " + getSalary() + ", Subordinates - " + numberOfSubordinates;
    }

}
