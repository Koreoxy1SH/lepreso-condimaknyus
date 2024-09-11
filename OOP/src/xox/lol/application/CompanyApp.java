package xox.lol.application;

import xox.lol.data.Company;

public class CompanyApp {

    public static void main(String[] args) {
        
        Company company = new Company();
        company.setName("Tesla");

        Company.Employee employee = company.new Employee();
        employee.setName("Budi santoso");

        System.out.println(employee.getName() + employee.getCompany());
    }
    
}
