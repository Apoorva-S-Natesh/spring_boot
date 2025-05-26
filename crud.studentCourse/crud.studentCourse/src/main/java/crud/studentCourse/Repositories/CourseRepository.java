package crud.studentCourse.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.studentCourse.Entities.Course;

public interface courseRepository extends JpaRepository<Course, Long>{

}
