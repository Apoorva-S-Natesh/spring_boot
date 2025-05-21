package crud.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee.entities.Employee;
import crud.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImplementation 
	implements EmployeeService {
	
	@Autowired // automatically spring creates an object for the repository and give
	EmployeeRepository repo;// REpositpory will interact with the database not the service directly

	@Override
	public void addEmployee(Employee emp) {
		repo.save(emp); // To save the emp object into database using "save"
	}

}
