package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Student;
import jakarta.persistence.Id;
@Repository
public interface StudentRepository extends JpaRepository<Student,Id> {
	
}