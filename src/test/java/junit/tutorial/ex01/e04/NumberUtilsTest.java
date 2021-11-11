package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e01.StringUtils;

class NumberUtilsTest {

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
	void testIsEven() {
		fail("まだ実装されていません");
	}
	
	@Test
	@DisplayName("入力値「１０」 -> trueを返す")
	void test1() {
		assertTrue( NumberUtils.isEven(10) );
	}
	
	@Test
	@DisplayName("入力値「7」 -> falseを返す")
	void test2() {
		assertFalse( NumberUtils.isEven(7) );
	}
	
}
