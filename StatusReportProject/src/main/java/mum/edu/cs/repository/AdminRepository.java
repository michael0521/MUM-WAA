package mum.edu.cs.repository;

import mum.edu.cs.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by su on 3/14/16.
 */

@Repository
public interface AdminRepository extends CrudRepository<User,Long>  {
}
