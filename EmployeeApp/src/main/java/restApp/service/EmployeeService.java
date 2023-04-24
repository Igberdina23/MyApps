package restApp.service;

import org.springframework.stereotype.Service;
import restApp.api.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private List<Employee> employeeList;
    public EmployeeService() {
        employeeList = new ArrayList<>();
        Employee employee1 = new Employee(1, "Ivan", "Ivanov", "ivanov@outlook.com");
        Employee employee2 = new Employee(2, "Olga", "Krashova", "krasnova@outlook.com");
        Employee employee3 = new Employee(3, "Anna", "Sidorova", "sidorova@outlook.com");
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3));
    }

    public List<Employee> getEmployees() {
        return employeeList;
    }

        public Employee getEmployee(Integer id) {
            Employee result = null;
            for (Employee employee : employeeList) {
                if (id == employee.getId()) {
                    result = employee;
                }
            }
            return result;
        }


    public String addEmployee (Employee employee) {
        employeeList.add(employee);
        return  "Added new Employee!";}

    }


