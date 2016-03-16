package mum.edu.cs.dao;

import org.springframework.data.repository.CrudRepository;

import mum.edu.cs.domain.Lecture;

public interface LectureRepository extends CrudRepository<Lecture, Long> {

}
