package mum.edu.cs.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class BasicTest {

	@Test
	public void test() {
		
		System.out.println(LocalDate.now().toString());
	}

}
