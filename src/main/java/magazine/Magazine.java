package magazine;

import Models.Employee;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Magazine {
    private String nameOfShop;
    private String address;
    private String specializationOfShop;
    private String nameOfDirector;
    private HashMap<String, Integer> employeesList = new HashMap<>();

    public Magazine(String nameOfShop, String address, String specializationOfShop, String nameOfDirector) {
        this.nameOfShop = nameOfShop;
        this.address = address;
        this.specializationOfShop = specializationOfShop;
        this.nameOfDirector = nameOfDirector;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public HashMap<String, Integer> getEmployeesList() {
        return employeesList;
    }

    public void addEmployee(Employee employee){
        employeesList.put(employee.getName(),employee.getSalary());
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecializationOfShop() {
        return specializationOfShop;
    }

    public void setSpecializationOfShop(String specializationOfShop) {
        this.specializationOfShop = specializationOfShop;
    }

    public String getNameOfDirector() {
        return nameOfDirector;
    }

    public void setNameOfDirector(String nameOfDirector) {
        this.nameOfDirector = nameOfDirector;
    }
}
