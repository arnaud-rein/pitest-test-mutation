package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.*;
import org.junit.jupiter.api.Test;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSomething() {
		CalculateAdd add = new CalculateAdd();
		int result = add.add(1, 2);
		Assertions.assertEquals(3, result);
		// assertions ici
	}



}
