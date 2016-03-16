package mum.edu.cs.service;

import mum.edu.cs.dao.AdminDAO;
import mum.edu.cs.dao.TeacherDAO;
import mum.edu.cs.domain.Professor;
import mum.edu.cs.domain.Student;
import mum.edu.cs.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * Created by su on 3/14/16.
 */

//@Service
public class AdminService {
//    @Autowired
    private AdminDAO adminDAO;

    public List<User> getAll(){
        return adminDAO.getAll();
    }

    public boolean deleteUser(long uid){
        return adminDAO.deleteUser(uid);
    }

    public boolean saveUser(User user){
        if(user.getId() > 0 ){
            User tmp = adminDAO.getUserById(user.getId());
            if(tmp != null && !tmp.getPassword().equals(user.getPassword())){

                PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            }
        }

        return adminDAO.save(user);
    }

    public User getUserById(Long uid){
        return adminDAO.getUserById(uid);
    }

}
