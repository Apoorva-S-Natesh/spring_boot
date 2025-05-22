package crud.employee.services;

import java.util.List;

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

	@Override
	public void updateEmployee(Employee emp) {
		repo.save(emp); // to update the emp object (save for both save and update) 		
	}
	
	@Override
	public Employee searchEmployee(int id) {
		return repo.findById(id).get(); // returns an object of different class so use get to get an object of Employee type
	}

	@Override
	public void deleteEmployee(Employee emp) {
		repo.delete(emp);
		// Or get id as argument and use repo.deleteById(id);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return repo.findAll();
	}
}
