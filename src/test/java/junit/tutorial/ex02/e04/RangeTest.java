package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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
	
	
	@ParameterizedTest
	@ValueSource(doubles = {-1.0,10.6})
	@DisplayName("aaa Rangeがmin=0.0、max=10.5 & containsメソッドに-0.1,10.6を与える -> falseを返す")
	void test01(double n) {
		Range range = new Range(0.0, 10.5);
		boolean result = range.contains(n);
		assertFalse(result);
	}

	@ParameterizedTest
	@ValueSource(doubles = {0.0,10.5})
	@DisplayName("Rangeがmin=0.0、max=10.5 & containsメソッドに0.0,10.5を与える -> trueを返す")
	void test02(double n) {
		Range range = new Range(0.0, 10.5);
		assertTrue(range.contains(n));
	}
	
	
	
//  ---------------------------

 @ParameterizedTest
	@ValueSource(doubles = {-5.2,5.2})
	@DisplayName("Rangeがmin=-5.1、max=5.1 & containsメソッドに-5.2,5.2を与える -> falseを返す")
	void test03(double n) {
		Range range = new Range(-5.1, 5.1);
		assertFalse(range.contains(n));
	}
 
 @ParameterizedTest
	@ValueSource(doubles = {-5.1,5.1})
	@DisplayName("Rangeがmin=-5.1、max=5.1 & containsメソッドに-5.1,5.1を与える -> trueを返す")
	void test04(double n) {
		Range range = new Range(-5.1, 5.1);
		assertTrue(range.contains(n));
	}


}
