package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	
	@Test
	@DisplayName( "第２引数に０を指定＆divideを呼び出す -> IllegalArgumentException発生")
	void test1() {
		try {
			Calculator calculator = new Calculator();
		    calculator.divide(1, 0);
			fail("IllegalArgumentException例外が発生しませんでした");
			
		} catch (IllegalArgumentException e) {
			assertEquals("divide by zero.",e.getMessage(), "例外のメッセージが異なります");
		}
		
	}
}
