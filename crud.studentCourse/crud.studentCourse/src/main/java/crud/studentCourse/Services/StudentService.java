package crud.studentCourse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.studentCourse.Entities.Student;
import crud.studentCourse.Repositories.studentRepository;

@Service 
public class StudentService {
	@Autowired private studentRepository repo;
	
	public List<Student> findAll() {
		return repo.findAll();
	}
	
	public Student findById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public void save(Student student) {
        repo.save(student);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
