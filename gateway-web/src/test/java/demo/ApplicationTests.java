package demo;

import java.util.Arrays;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.schooldost.service.constants.SchoolDostConstants;
import com.schooldost.service.mongodb.model.ClassDetails;

/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GatewayApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
@Ignore*/
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = { DemoApplication.class })
//@WebAppConfiguration
public class ApplicationTests {

	/*
	 * @Value("${local.server.port}") private int port;
	 * 
	 * private RestTemplate template = new TestRestTemplate();
	 * 
	 * //@Test public void homePageLoads() { ResponseEntity<String> response =
	 * template.getForEntity("http://localhost:" + port + "/", String.class);
	 * assertEquals(HttpStatus.OK, response.getStatusCode()); }
	 */

	@Test
	public void restCallTest() {
		System.out.println("Hello . . .");
		initMongoScript();
	}

	private void initMongoScript() {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8090/service/classDetail";
		
		ClassDetails classDetails1 = new ClassDetails();
		classDetails1.setClassName(SchoolDostConstants.CLASS_1);
		classDetails1.setSectionName(SchoolDostConstants.SECTION_A);
		HttpHeaders headers = createHeader();
		HttpEntity<ClassDetails> entity = new HttpEntity<ClassDetails>(classDetails1, headers);
		ResponseEntity<ClassDetails> response = restTemplate.exchange(url, HttpMethod.POST, entity, ClassDetails.class);
		
		
		ClassDetails responseBody = response.getBody();
		System.out.println("responseBody :: " + responseBody);
	}

	HttpHeaders createHeader() {
		String plainCreds = "admin@schooldost.com:admin";
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Creds);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return headers;
	}

}
