package crud.studentCourse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.studentCourse.Entities.Course;
import crud.studentCourse.Repositories.courseRepository;

@Service
public class CourseService {
	@Autowired private courseRepository repo;
	
	 public List<Course> findAll() {
	        return repo.findAll();
	    }

	    public Course findById(Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    public void save(Course course) {
	        repo.save(course);
	    }

	    public void delete(Long id) {
	        repo.deleteById(id);
	    }
}
