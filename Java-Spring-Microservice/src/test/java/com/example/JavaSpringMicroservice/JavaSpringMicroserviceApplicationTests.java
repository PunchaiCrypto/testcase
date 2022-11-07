package com.example.JavaSpringMicroservice;

import com.example.JavaSpringMicroservice.Repository.ProductRepository;
import com.example.JavaSpringMicroservice.controller.ProductController;
import com.example.JavaSpringMicroservice.model.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

//@SpringBootTest
@WebMvcTest(ProductController.class)
public class JavaSpringMicroserviceApplicationTests {

	@Autowired
	MockMvc mockMvc;



	@MockBean
	ProductRepository productRepository;
	Product Record_1 = new Product(1L,"firstdata",200);
	Product Record_2 = new Product(2L,"secounddata",350);
	Product Record_3 = new Product(3L,"thirddata",7654);
	Product Record_4Err = new Product(4L,"forthdata",4444);
	Product Record_5Err = new Product(1L,"fifthdata",55511);


	@Test
	public void getAllRecords_success() throws Exception {
		List<Product> records = new ArrayList<>(Arrays.asList(Record_1,Record_2,Record_3));

		Mockito.when(productRepository.findAll()).thenReturn(records);

		mockMvc.perform(MockMvcRequestBuilders
				.get("/api/product")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().is3xxRedirection())
				.andExpect(jsonPath("$",hasSize(3)))
				.andExpect(jsonPath("$[1].colum1",is("secounddata")));
	}

	public void getOneRecord_success() throws  Exception {

	}
}
