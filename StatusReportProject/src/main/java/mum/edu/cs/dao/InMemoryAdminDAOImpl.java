package mum.edu.cs.dao;

import mum.edu.cs.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by su on 3/14/16.
 */

@Repository
public class InMemoryAdminDAOImpl implements AdminDAO {


    private List<User> userList = new ArrayList<>() ;

    public InMemoryAdminDAOImpl(){
        User user = new User();
        user.setId(1);
        user.setName("suzhaoyang");
        user.setAccount("su");
        user.setPassword("123456");
        user.setAuthorities("ROLE_ADMIN");
        userList.add(user);
    }

    @Override
    public boolean deleteUser(long uid) {

        for(User item : userList){
            if(item.getId() == uid){
                userList.remove(item);
                return true;
            }
        }

        return  false;
    }

    @Override
    public boolean save(User user) {
        for (User item : userList){
            if(item.getId() == user.getId()){
                userList.remove(item);
                userList.add(user);
                return true;
            }
        }
        userList.add(user);
        return true;
    }

    @Override
    public User getUserById(Long uid) {
        for (User item : userList){
            if(item.getId() == uid){
                return item;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return userList;
    }
}
