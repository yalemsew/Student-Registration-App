package edu.miu.CS544.project.repositories;

import edu.miu.CS544.project.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
