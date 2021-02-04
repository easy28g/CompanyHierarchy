package Megacom.Base;

public class Position {

    private String posName;
    private double salary;
    private Department department;

    public Position(String posName, double salary, Department department) {
        this.posName = posName;
        this.salary = salary;
        this.department = department;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
