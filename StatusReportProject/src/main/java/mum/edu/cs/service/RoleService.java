package mum.edu.cs.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by su on 3/15/16.
 */

//@Service
public class RoleService {
    public Map<String,String> getAllRoleMap(){
        Map<String,String> roleMap = new HashMap<>();
        roleMap.put("ROLE_ADMIN","admin");
        roleMap.put("ROLE_STU","student");
        roleMap.put("ROLE_PRO","professor");
        return roleMap;
    }
}
