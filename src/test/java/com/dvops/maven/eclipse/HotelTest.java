package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HotelTest {
	
	private Hotel hotel;
	@BeforeEach
	void setUp() throws Exception {
		hotel = new Hotel("1", "Hotel.png" , "Four season" , "12 Orchard road", "www.fourseason.com", "Fourseason@mail.com", "63889999", "1 king bed", "30sqf", "2 pax", 300);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetId() {
		//Arrange
		String expected = "1";
		//Act
		String actual = hotel.getId();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetHotelImage() {
		//Arrange
		String expected = "Hotel.png";
		//Act
		String actual = hotel.getHotelImage();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetHotelName() {
		//Arrange
		String expected = "Four season";
		//Act
		String actual = hotel.getHotelName();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetHotelAddress() {
		//Arrange
		String expected = "12 Orchard road";
		//Act
		String actual = hotel.getHotelAddress();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetHotelWebsite() {
		//Arrange
		String expected = "www.fourseason.com";
		//Act
		String actual = hotel.getHotelWebsite();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetHotelEmail() {
		//Arrange
		String expected = "Fourseason@mail.com";
		//Act
		String actual = hotel.getHotelEmail();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetHotelPhoneNumber() {
		//Arrange
		String expected = "63889999";
		//Act
		String actual = hotel.getHotelPhoneNumber();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetRoomBeds() {
		//Arrange
		String expected = "1 king bed";
		//Act
		String actual = hotel.getRoomBeds();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetRoomSize() {
		//Arrange
		String expected = "30sqf";
		//Act
		String actual = hotel.getRoomSize();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetSleepingCapacity() {
		//Arrange
		String expected = "2 pax";
		//Act
		String actual = hotel.getSleepingCapacity();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetPricePerNight() {
		//Arrange
		int expected = 300;
		//Act
		int actual = hotel.getPricePerNight();
		//Assert
		assertEquals(expected , actual);
	}

}