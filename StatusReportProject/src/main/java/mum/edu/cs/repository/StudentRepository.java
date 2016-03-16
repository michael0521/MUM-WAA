package mum.edu.cs.repository;

import org.springframework.data.repository.CrudRepository;

import mum.edu.cs.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
