package edu.miu.CS544.project.repositories;

import edu.miu.CS544.project.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer>{
}
