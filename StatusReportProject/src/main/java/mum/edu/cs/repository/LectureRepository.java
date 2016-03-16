package mum.edu.cs.repository;

import org.springframework.data.repository.CrudRepository;

import mum.edu.cs.domain.Lecture;

public interface LectureRepository extends CrudRepository<Lecture, Integer> {

}
