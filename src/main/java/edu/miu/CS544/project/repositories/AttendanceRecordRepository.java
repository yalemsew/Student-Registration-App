package edu.miu.CS544.project.repositories;

import edu.miu.CS544.project.domain.AttendanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRecordRepository extends JpaRepository<AttendanceRecord, Integer>{
}
