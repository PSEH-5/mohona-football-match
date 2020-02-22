package io.mohona.footballmatch;

import io.mohona.footballmatch.resources.FoootballMatchResource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class FootballMatchApplicationTests {
	@Autowired
	private FoootballMatchResource foootballMatchResource;

	@Autowired
	private MockMvc  mockMvc;

	@Test
	void contextLoads() throws Exception{
       assertThat(foootballMatchResource).isNotNull();

	}
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;

	@Autowired
	//private TestRestTemplate restTemplate;
	RestTemplate restTempalte = new RestTemplate();

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		//assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/getStanding/c/l/t",
		//		String.class).contains("Sapient"));
	}
}

}
