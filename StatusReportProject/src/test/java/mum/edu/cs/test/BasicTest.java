package mum.edu.cs.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import mum.edu.cs.domain.User;
import mum.edu.cs.serviceimpl.AdminServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicTest {

	@Test
	public void test() {
		AdminServiceImpl service = new AdminServiceImpl();
		User user = new User();
		user.setUsername("admin");
		user.setPassword("admin");

		service.saveUser(user);
	}

}
