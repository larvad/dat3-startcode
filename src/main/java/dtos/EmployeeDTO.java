package dtos;

import entities.Employee;
import entities.User;

public class EmployeeDTO {

    private Integer id;
    private String name;
    private String address;

    private Integer salary;



    public EmployeeDTO(Employee employee) {
        if(employee.getId() != null)
            this.id = employee.getId();
        this.name = employee.getName();
        this.address = employee.getAddress();
        this.salary = employee.getSalary();
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getSalary() {
        return salary;
    }
}

