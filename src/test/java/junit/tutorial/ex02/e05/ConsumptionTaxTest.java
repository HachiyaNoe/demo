package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ConsumptionTaxTest {

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
	@DisplayName("表のパラメータに関してそれぞれテスト")
	@CsvSource({
	    "5, 100, 105",
	    "5, 3000, 3150",
	    "10, 50, 55",
	    "5, 50, 52",
	    "3, 50, 51"
	})
	void test1(int taxRate, int input, int answer) {
		ConsumptionTax consumptionTax = new ConsumptionTax(taxRate);
		
		assertEquals(answer, consumptionTax.apply(input));
	}
	
//	@ParameterizedTest
//	@CsvSource({
//	    "税率, 入力値（価格）,期待値"
//	})
//	void test2(String title) {
//		
//	}
}
