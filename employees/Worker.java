package employees;

public class Worker extends Employee {
    public String position; //stanowiska pracownikow

    public Worker(String fullName, double salary, String position) {
        super(fullName, salary);
        this.position = position;
    }

    public String getPosition() { //metoda ktora zwraca stanowisko pracownika
        return position;
    }

    public void setPosition(String newPosition) { //ustawianie nowego stanowiska pracownika
        this.position = newPosition;
    }

    public String toString() { //zwracanie informacji o pracowniku
        return "Worker - " + getFullName() + ", Salary - " + getSalary() + ", Position - " + position;
    }

}
