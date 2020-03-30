package it.totolook.demo.microservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import it.totolook.demo.microservice.controllers.DemoController;
import it.totolook.demo.microservice.dto.UserDTO;

@SpringBootTest
class DemoApplicationTests {

	@SpyBean
	private DemoController demoController;

	@Test
	void testGetUser() {
		UserDTO user = UserDTO.builder().name("Toto").surname("Look").email("totolook@totolook.it").age("25").build();

		assertThat("Not match!", demoController.getUser(), is(user));

	}

}
