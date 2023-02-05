package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	
	private User us;

	@BeforeEach
	void setUp() throws Exception {
		us = new User("profile.jpg", "user@example.com", "username", "password", "male", "Hougang Ave 123");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetProfilePicture() {
		//fail("Not yet implemented");
		String profilePicture = us.getProfilePicture();
		String actualProfilePicture = "profile.jpg";
	    
	    assertEquals(actualProfilePicture, profilePicture);
	}

	@Test
	void testGetEmail() {
		//fail("Not yet implemented");
		String email = us.getEmail();
		String actualEmail = "user@example.com";
	    
	    assertEquals(actualEmail, email);
	}

	@Test
	void testGetUsername() {
		//fail("Not yet implemented");
		String username = us.getUsername();
		String actualUsername = "username";
	    
	    assertEquals(actualUsername, username);
	}

	@Test
	void testGetPassword() {
		//fail("Not yet implemented");
		String password = us.getPassword();
		String actualPassword = "password";
		
		assertEquals(actualPassword, password);
	}

	@Test
	void testGetGender() {
		//fail("Not yet implemented");
		String gender = us.getGender();
		String actualGender = "male";
	    
	    assertEquals(actualGender, gender);
	}

	@Test
	void testGetAddress() {
		//fail("Not yet implemented");	
		String address = us.getAddress();
	    String actualAddress = "Hougang Ave 123";
		
	    assertEquals(actualAddress, address);
	}

	@Test
	void testSetProfilePicture() {
		//fail("Not yet implemented");
		User testUser = us;
		
		testUser.setProfilePicture("newProfile.jpg");
		
		assertEquals("newProfile.jpg", testUser.getProfilePicture());
	}

	@Test
	void testSetUsername() {
		//fail("Not yet implemented");
		User testUser = us;
		
		testUser.setUsername("newUsername");
        
        assertEquals("newUsername", testUser.getUsername());
	}

	@Test
	void testSetPassword() {
		//fail("Not yet implemented");
		User testUser = us;
		
		testUser.setPassword("newPassword");
        
        assertEquals("newPassword", testUser.getPassword());
	}

	@Test
	void testSetAddress() {
		//fail("Not yet implemented");
		User testUser = us;
		
		testUser.setAddress("Seng Kang Ave 8");
        
        assertEquals("Seng Kang Ave 8", testUser.getAddress());
		
		
	}

}
