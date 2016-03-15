package mum.edu.cs.service;

import mum.edu.cs.dao.AdminDAO;
import mum.edu.cs.dao.TeacherDAO;
import mum.edu.cs.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by su on 3/14/16.
 */

//@Service
public class AdminService {
//    @Autowired
    private AdminDAO adminDAO;

    public List<Student> getAllStudent(){
        return adminDAO.getAllStudent();
    }

    public boolean deleteUser(long uid){
        return adminDAO.deleteUser(uid);
    }

}
