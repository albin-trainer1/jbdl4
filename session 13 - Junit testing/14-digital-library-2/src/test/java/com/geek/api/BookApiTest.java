package com.geek.api;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.geek.entity.Authour;
import com.geek.service.BookService;

@WebMvcTest(BookApi.class)
public class BookApiTest {

	//if /books/authour
	    //--pass json data
	@MockBean
	private BookService bookService;
	 @Autowired
	private MockMvc mockMvc;
	 Authour authour=new Authour();
	 {
		 authour.setAuthourId(101);
		 authour.setName("Test Authour");
	 }
	 @Test
	 public void testAddAuthour() throws Exception {
		// Authour authour=new Authour();
		// authour.setAuthourId(101);
		// authour.setName("Test Authour");
		when(bookService.addAuthour(authour)).thenReturn(authour);
		mockMvc.perform(post("/books/authour")
				 .contentType(MediaType.APPLICATION_JSON)
				 .content("{\"authourId\":101,\"name\":\"Test Authour\"}")
				)
		  .andExpect(status().isCreated());
		    //.andExpect(jsonPath("$.name").value("Test Authour"));//return json type .....
	 }
	
	
}
