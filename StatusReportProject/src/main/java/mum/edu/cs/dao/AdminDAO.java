package mum.edu.cs.dao;

import mum.edu.cs.domain.Professor;
import mum.edu.cs.domain.Student;
import mum.edu.cs.domain.User;

import java.util.List;

/**
 * Created by su on 3/14/16.
 */
public interface AdminDAO {
    public boolean deleteUser(long uid);
    public boolean save(User user);
    public User getUserById(Long uid);
    public List<User> getAll();

}
