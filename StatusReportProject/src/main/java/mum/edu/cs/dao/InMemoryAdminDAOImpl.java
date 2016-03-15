package mum.edu.cs.dao;

import mum.edu.cs.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by su on 3/14/16.
 */

@Repository
public class InMemoryAdminDAOImpl implements AdminDAO {

    private List<Student> studentList;

    public InMemoryAdminDAOImpl(){
        studentList = new ArrayList<>();
        Student tmp = new Student();
        tmp.setId(1);
        tmp.setStudentId(123);
        studentList.add(tmp);

        tmp = new Student();
        tmp.setId(2);
        tmp.setStudentId(123);
        studentList.add(tmp);
    }

    @Override
    public List<Student> getAllStudent() {

        return studentList;
    }

    @Override
    public boolean deleteUser(long uid) {

        for(Student item : studentList){
            if(item.getId() == uid){
                studentList.remove(item);
                return true;
            }
        }

        return  false;
    }
}
