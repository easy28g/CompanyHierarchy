package Megacom;

import Megacom.Base.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Company company = new Company("MegaCom", "Bishkek");
        Directorate directorate = new Directorate("Telecom", "Adis", company);
        Department department = new Department("ITschool", "Dolon", directorate);
        Position position = new Position("Middle", 90000, department);
        Employee employee = new Employee("Azamat", position);


        employee.InfoEmployee();




    }
}
