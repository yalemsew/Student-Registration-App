package edu.miu.CS544.project.repositories;

import edu.miu.CS544.project.domain.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseOfferingRepository extends JpaRepository<CourseOffering, Integer> {
}
