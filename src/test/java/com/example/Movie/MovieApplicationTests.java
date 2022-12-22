package com.example.Movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieApplicationTests {

	@Test
	public void testProduct() {
		Snacks snacks = new Snacks("Djungelvrål", 15.99,"djungelvrål.jpg", "Vrålsalta lakritsdjur har varit en av Malacos favorit hos många godisälskare. Passar dig som älskar extra salt salmiak." );
		String result = snacks.getProduct();
		Assertions.assertEquals("Djungelvrål", result);
	}

}
