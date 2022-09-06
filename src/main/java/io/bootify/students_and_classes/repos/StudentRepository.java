package io.bootify.students_and_classes.repos;

import io.bootify.students_and_classes.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
