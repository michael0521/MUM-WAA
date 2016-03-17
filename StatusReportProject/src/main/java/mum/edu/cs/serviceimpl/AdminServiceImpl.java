package mum.edu.cs.serviceimpl;

import mum.edu.cs.domain.User;
import mum.edu.cs.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by su on 3/14/16.
 */

@Service
public class AdminServiceImpl {
    @Autowired
    private AdminRepository adminRepository;

    public List<User> getAll(){
        return (List<User>) adminRepository.findAll();
    }

    public boolean deleteUser(long uid){
        adminRepository.delete(uid);
        return true;
    }

    public User saveUser(User user){
        if(user.getId() > 0 ){
            User tmp = adminRepository.findOne(user.getId());
            if(tmp != null && !tmp.getPassword().equals(user.getPassword())){

                PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            }
//            adminRepository.delete(user.getId());
        }

        return adminRepository.save(user);
    }

    public User getUserById(Long uid){
        return adminRepository.findOne(uid) ;
    }

    public User getUserByUsername(String username){
        return adminRepository.getUserByUsername(username);
    }

}
