package com.curddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.curddemo.antites.student52;
import com.curddemo.reporsitory.studentRepository;

@SpringBootTest
class Curddemo52ApplicationTests {
@Autowired
	private studentRepository studentrepo;
	
	@Test
	void saveOnestudent() {
		student52 s = new student52();
		s.setCourse("b.com");
		s.setName("adnan");
		s.setFee(60000);
		studentrepo.save(s);
		
			}
@Test
	void deleteonestudent() {
studentrepo.deleteById(1L);	
	}
@Test
void updateonestudent() {
	student52 s = new student52();
	s.setCourse("b.com");
	s.setName("adnan");
	s.setId(2);
	s.setFee(6000);
	studentrepo.save(s);
}
@Test
void getonestudent() {
	Optional<student52> id = studentrepo.findById(2L);
	student52 s = id.get();
	System.out.println(s.getCourse());
System.out.println(s.getFee());
System.out.println(s.getName());
}
}
