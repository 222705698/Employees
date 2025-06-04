package za.ac.cput.Service;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Employee;

import java.util.List;

@Repository
public interface IEmployeeService extends IService<Employee, String> {

    List<Employee> getAll();
}
