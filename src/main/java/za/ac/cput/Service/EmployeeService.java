package za.ac.cput.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Repository.EmployeeRepository;
import za.ac.cput.domain.Employee;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {


    private IEmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee read(String id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee delete(String id) {
       employeeRepository.deleteById(id);
       return null;

    }

    @Override
    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }
}
