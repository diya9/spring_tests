package com.demo.spring_tests.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;;

public class SaveAndGetQuoteTest extends TestDemo {


	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mockMvc;

	@Before
	public void stetup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void checkGetQuote() throws Exception {
		mockMvc.perform(post("/save")).andExpect(jsonPath("$.contractNumber").value(""))
				.andExpect(jsonPath("$.workflowId").value(""));
	}
}
