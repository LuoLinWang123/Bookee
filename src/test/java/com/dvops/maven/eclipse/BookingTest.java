package com.dvops.maven.eclipse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookingTest {
	
	Booking book = new Booking("1/3/2023", "4/3/2023" , "Hello@mail.com" , 1000);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetStartDate() {
		//Arrange
		String expected = "1/3/2023";
		//Act
		String actual = book.getStartDate();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetEndDate() {
		//Arrange
		String expected = "4/3/2023";
		//Act
		String actual = book.getEndDate();
		//Assert
		assertEquals(expected , actual);

	}

	@Test
	void testGetBookerEmail() {
		//Arrange
		String expected = "Hello@mail.com";
		//Act
		String actual = book.getBookerEmail();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetHotelId() {
		//Arrange
		double expected = 1000;
		//Act
		double actual = book.getHotelId();
		//Assert
		assertEquals(expected , actual);
	}

}