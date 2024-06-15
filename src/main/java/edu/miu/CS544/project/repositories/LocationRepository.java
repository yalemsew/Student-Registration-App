package edu.miu.CS544.project.repositories;

import edu.miu.CS544.project.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
