package com.example.JavaSpringMicroservice;

import com.example.JavaSpringMicroservice.Repository.ProductRepository;
import com.example.JavaSpringMicroservice.controller.ProductController;
import com.example.JavaSpringMicroservice.model.Product;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

//@SpringBootTest
@WebMvcTest(ProductController.class)
public class JavaSpringMicroserviceApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper mapper;
	//Unsatisfied dependency expressed through field 'mapper'

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

	@Test
	public void getOneRecord_success() throws  Exception {
		Mockito.when(productRepository.findById(1L)).thenReturn(Optional.of(Record_1));
		mockMvc.perform(MockMvcRequestBuilders
						.get("/api/product/1")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().is3xxRedirection())
				.andExpect(jsonPath("$",notNullValue()))
				.andExpect(jsonPath("$.no",is(1)));
	}

	@Test
	public void createRecord_success() throws Exception {
		Product product = Product.builder()
				.colum1("tenthdata")
				.colum2(2000).build();

		Mockito.when(productRepository.save(product)).thenReturn(product);

		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/api/product")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(this.mapper.writeValueAsString(product));

		mockMvc.perform(mockRequest)
				.andExpect(status().isOk())
				.andExpect(jsonPath("$",notNullValue()))
				.andExpect(jsonPath("$.colum1",is("tenthdata")));
	}
	@Test
	public void updateProductRecord_success() throws Exception{
		Product product = Product.builder()
				.colum1("eleventhdata")
				.colum2(11111).build();
		Mockito.when(productRepository.findById(Record_1.getNo())).thenReturn(Optional.of(Record_1));
		Mockito.when(productRepository.save(product)).thenReturn(product);

		MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/api/product")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(this.mapper.writeValueAsString(product));

		mockMvc.perform(mockRequest)
				.andExpect(status().is3xxRedirection())
				.andExpect(jsonPath("$",notNullValue()))
				.andExpect(jsonPath("$.colum1",is("eleventhdata")));
	}

}
