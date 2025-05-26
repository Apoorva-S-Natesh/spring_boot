package crud.studentCourse.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.studentCourse.Entities.Student;

public interface studentRepository extends JpaRepository<Student, Long>{

}
