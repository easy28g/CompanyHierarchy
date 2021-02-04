package Megacom.Base;


import Megacom.InterfaceBase.*;

public class Employee extends Names implements DirInterface, DepInterface, PosInterface,
                                                SalaryInterface, CompanyInterface {

    private Position position;

    public Employee(String namep, Position position) {
        super(namep);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String getNameDir() {
        return getPosition().getDepartment().getDirectorate().getNameDir();
    }

    @Override
    public String getDepName() {
        return getPosition().getDepartment().getDepName();
    }


    @Override
    public String getPosName() {
        return getPosition().getPosName();
    }

    @Override
    public double getSalary() {
        return getPosition().getSalary();
    }

    @Override
    public String getCompanyName() {
        return getPosition().getDepartment().getDirectorate().getCompany().getComName();
    }

    public void InfoEmployee(){
        System.out.println("FIO: "+getNamep());
        System.out.println("Salary: "+getSalary());
        System.out.println("Position: "+getPosName());
        System.out.println("Department: "+getDepName());
        System.out.println("Directorate: "+getNameDir());
        System.out.println("Company: "+getCompanyName());
    }
}
