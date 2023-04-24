package restApp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restApp.api.model.Employee;
import restApp.service.EmployeeService;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee")
    public Employee getEmployee(@RequestParam Integer id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/newEmployee")
    public String addEmployee (@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
}