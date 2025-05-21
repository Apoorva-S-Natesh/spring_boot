package crud.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.employee.entities.Employee;

public interface EmployeeRepository 
	extends JpaRepository<Employee, Integer> { // for which class the object has to be mapped and the type of the primary key

}
