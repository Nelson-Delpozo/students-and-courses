package io.bootify.students_and_classes.repos;

import io.bootify.students_and_classes.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, Long> {

    boolean existsByTitleIgnoreCase(String title);

}
