package com.example.Spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Spring.controller.PersonController;

@SpringBootTest
class CrudToHtmlPractice2ApplicationTests 
{
	private PersonController personController;

	@Test
	void contextLoads()
	{
		assertThat(personController.equals(personController));
	}

}
