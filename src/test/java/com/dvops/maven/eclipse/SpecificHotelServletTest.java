package com.dvops.maven.eclipse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.Test;


public class SpecificHotelServletTest {
	
	@Test
	public void testDoPost() throws ServletException, IOException {
		SpecificHotelServlet servlet = new SpecificHotelServlet();
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);
		
		when(request.getSession()).thenReturn(session);
		when(request.getParameter("id")).thenReturn("12345");
		
		servlet.doPost(request, response);
		verify(session).setAttribute("hotelID", "12345");
		verify(response).sendRedirect("hotelDetails.jsp");
	}
}