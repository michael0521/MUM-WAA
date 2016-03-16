package mum.edu.cs.repository;

import mum.edu.cs.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by su on 3/14/16.
 */

@Repository
public interface AdminRepository extends CrudRepository<User,Long>  {

    @Query("select p from User p where username = :username")
    public User getUserByUsername(@Param("username") String Username);
}
