package mum.edu.cs.dao;

import mum.edu.cs.domain.Student;

import java.util.List;

/**
 * Created by su on 3/14/16.
 */
public interface AdminDAO {
    public List<Student> getAllStudent();
    public boolean deleteUser(long uid);
}
