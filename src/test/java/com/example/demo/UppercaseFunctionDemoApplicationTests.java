package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.cloud.function.context.FunctionCatalog;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = UppercaseFunctionDemoApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UppercaseFunctionDemoApplicationTests {

	@Autowired
	private FunctionCatalog catalog;

	@Test
	public void test() throws Exception {

		Function<String, String> function = catalog.lookup(Function.class,
				"uppercase");
		assertEquals(function.apply("hello"), "HELLO");
	}

}
