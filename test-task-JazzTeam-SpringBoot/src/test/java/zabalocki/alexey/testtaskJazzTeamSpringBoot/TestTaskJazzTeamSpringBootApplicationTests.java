package zabalocki.alexey.testtaskJazzTeamSpringBoot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zabalocki.alexey.testtaskJazzTeamSpringBoot.service.ConversionService;

@SpringBootTest
class TestTaskJazzTeamSpringBootApplicationTests {

	@Autowired
	private ConversionService conversionService;

	@Test
	void conversionServiceShouldReturnExpectedResult() {
		String actual = conversionService.conversionToString(1L);
		String expected = "один";
		Assertions.assertEquals(expected, actual);
	}

}
