package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class StringUtilsTest {

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
	@DisplayName("「aaa」を入力 ->「aaa」が取得できる")
	void test1() {
		String result = "aaa";
		assertEquals("aaa", StringUtils.toSnakeCase(result));
	}

	@Test
	@DisplayName("「HelloWorld」を入力 ->「hello_world」が取得できる")
	void test2() {
		String result = "HelloWorld";
		assertEquals("hello_world", StringUtils.toSnakeCase(result));
	}
	
	@Test
	@DisplayName("「practiceJunit」を入力 ->「practice_junit」が取得できる")
	void test3() {
		String result = "practiceJunit";
		assertEquals("practice_junit", StringUtils.toSnakeCase(result));
	}
	

}
