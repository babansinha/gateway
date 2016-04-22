package com.schooldost.gateway.service.auth;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.schooldost.gateway.mongodb.model.Role;
import com.schooldost.gateway.mongodb.model.User;
import com.schooldost.gateway.user.UserService;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("username : " + username);
		//init();
		//initMongoScript();
		User user = userService.findByUsername(username);
		
		if(user == null) {
			user = userService.findByEmail(username);
		}
		
		if(user == null) {
			user = userService.findByMobileNumber(username);
		}
		
		/*if (user != null && user.getUsername() == null) {
			user.setUsername(username);
		}
		*/
		System.out.println("UserDetailsService.user : " + user);
		
		if(user != null) {
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
					true, true, true, true, getAuthorities(user.getRole().getPermissions()));
		}
		
		return null;
	}


	public List<SimpleGrantedAuthority> getAuthorities(List<String> permissions) {
		List<SimpleGrantedAuthority> authList = permissions.stream()
		        .map(permission -> new SimpleGrantedAuthority(permission)).collect(Collectors.toList());
		System.out.println("authList :: " + authList);
		return authList;
	}
	
	public void init() {
		// Drop existing collections
		mongoTemplate.dropCollection("role");
		mongoTemplate.dropCollection("user");
		mongoTemplate.dropCollection("class_teacher_subject");
		mongoTemplate.dropCollection("fs.chunks");
		mongoTemplate.dropCollection("fs.files");
		mongoTemplate.dropCollection("transport");
		/*mongoTemplate.dropCollection("student");
		mongoTemplate.dropCollection("teacher");
		mongoTemplate.dropCollection("parents");*/

		// Create new records
		Role adminRole = new Role();
		adminRole.setDomainId(UUID.randomUUID().toString());
		adminRole.setRole("ROLE_ADMIN");
		//adminRole.setPermissions(AuthUtils.getPermissions(AuthConstants.ROLE_ADMIN) );
		
		Role userRole = new Role();
		userRole.setDomainId(UUID.randomUUID().toString());
		userRole.setRole("ROLE_USER");
		//userRole.setPermissions(AuthUtils.getPermissions(AuthConstants.ROLE_USER));
		
		Role studentRole = new Role();
		studentRole.setDomainId(UUID.randomUUID().toString());
		studentRole.setRole("ROLE_STUDENT");
		//studentRole.setPermissions(AuthUtils.getPermissions(AuthConstants.ROLE_STUDENT));
		
		Role teacherRole = new Role();
		teacherRole.setDomainId(UUID.randomUUID().toString());
		teacherRole.setRole("ROLE_TEACHER");
		//teacherRole.setPermissions(AuthUtils.getPermissions(AuthConstants.ROLE_TEACHER));
		
		Role parentsRole = new Role();
		parentsRole.setDomainId(UUID.randomUUID().toString());
		parentsRole.setRole("ROLE_PARENTS");
		//parentsRole.setPermissions(AuthUtils.getPermissions(AuthConstants.ROLE_PARENTS));

		Role driverRole = new Role();
		driverRole.setDomainId(UUID.randomUUID().toString());
		driverRole.setRole("ROLE_DRIVER");
		//driverRole.setPermissions(AuthUtils.getPermissions(AuthConstants.ROLE_DRIVER));

		User admin = new User();
		admin.setDomainId(UUID.randomUUID().toString());
		admin.setFirstName("Admin");
		admin.setLastName("Sinha");
		admin.setPassword("admin");
		admin.setDob(new Date());
		admin.setRole(adminRole);
		admin.setUsername("admin@schooldost.com");
		admin.setMobileNumber("12345");
		
		User user = new User();
		user.setDomainId(UUID.randomUUID().toString());
		user.setFirstName("User");
		user.setLastName("Sinha");
		user.setPassword("user");
		user.setRole(userRole);
		user.setDob(new Date());
		user.setUsername("user@schooldost.com");
		user.setMobileNumber("123456");
		
		User teacher = new User();
		teacher.setDomainId(UUID.randomUUID().toString());
		teacher.setFirstName("Teacher");
		teacher.setLastName("Sinha");
		teacher.setPassword("teacher");
		teacher.setRole(teacherRole);
		teacher.setDob(new Date());
		teacher.setUsername("teacher@schooldost.com");
		teacher.setMobileNumber("1234567");
		
		User student = new User();
		student.setDomainId(UUID.randomUUID().toString());
		student.setFirstName("Student");
		student.setLastName("Sinha");
		student.setPassword("student");
		student.setRole(studentRole);
		student.setDob(new Date());
		student.setUsername("student@schooldost.com");
		student.setMobileNumber("12345678");
		
		User parents = new User();
		parents.setDomainId(UUID.randomUUID().toString());
		parents.setFirstName("Parents");
		parents.setLastName("Sinha");
		parents.setPassword("parents");
		parents.setRole(parentsRole);
		parents.setDob(new Date());
		parents.setUsername("parents@schooldost.com");
		parents.setMobileNumber("123456789");
		
		// Insert to db
		userService.create(admin);
		userService.create(user);
		userService.create(teacher);
		userService.create(student);
		userService.create(parents);
		userService.createRole(driverRole);
	}
	
	/*private void initMongoScript() {
		System.out.println("initMongoScript . . .");
		mongoTemplate.dropCollection("class_details");
		ClassDetails classDetails = new ClassDetails();
		classDetails.setClassName(SchoolDostConstants.CLASS_1);
		classDetails.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("1 . . .");
		ClassDetails d = userService.createClass(classDetails);
		System.out.println("d ::" + d);
		
		ClassDetails classDetails1 = new ClassDetails();
		classDetails1.setClassName(SchoolDostConstants.CLASS_2);
		classDetails1.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d1 ::" + userService.createClass(classDetails1));
		
		ClassDetails classDetails2 = new ClassDetails();
		classDetails2.setClassName(SchoolDostConstants.CLASS_3);
		classDetails2.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d2 ::" + userService.createClass(classDetails2));
		
		ClassDetails classDetails3 = new ClassDetails();
		classDetails3.setClassName(SchoolDostConstants.CLASS_4);
		classDetails3.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d3 ::" + userService.createClass(classDetails3));
		
		ClassDetails classDetails4 = new ClassDetails();
		classDetails4.setClassName(SchoolDostConstants.CLASS_5);
		classDetails4.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d4 ::" + userService.createClass(classDetails4));
		
		ClassDetails classDetails5 = new ClassDetails();
		classDetails5.setClassName(SchoolDostConstants.CLASS_6);
		classDetails5.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d5 ::" + userService.createClass(classDetails5));
		
		ClassDetails classDetails6 = new ClassDetails();
		classDetails6.setClassName(SchoolDostConstants.CLASS_7);
		classDetails6.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d6 ::" + userService.createClass(classDetails6));
		
		ClassDetails classDetails7 = new ClassDetails();
		classDetails7.setClassName(SchoolDostConstants.CLASS_8);
		classDetails7.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d7 ::" + userService.createClass(classDetails7));
		
		ClassDetails classDetails8 = new ClassDetails();
		classDetails8.setClassName(SchoolDostConstants.CLASS_9);
		classDetails8.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d8 ::" + userService.createClass(classDetails8));
		
		ClassDetails classDetails9 = new ClassDetails();
		classDetails9.setClassName(SchoolDostConstants.CLASS_10);
		classDetails9.setSectionName(SchoolDostConstants.SECTION_A);
		System.out.println("d9 ::" + userService.createClass(classDetails9));
	}*/

}
