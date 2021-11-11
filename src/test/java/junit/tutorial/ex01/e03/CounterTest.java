package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e01.StringUtils;

class CounterTest {

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
	@DisplayName("初期状態で、incrementメソッドを実行 -> １が取得できる")
	void test1() {
		
		Counter counter = new Counter();
		
		assertEquals(1, counter.increment() );
	}
	
	@Test
	@DisplayName("incrementメソッドを１回実行した状態で、incrementメソッドを実行 -> ２が取得できる")
	void test2() {
		Counter counter = new Counter();
		counter.increment();
		assertEquals(2, counter.increment() );
	}
	
	@Test
	@DisplayName("incrementメソッドを50回実行した状態で、incrementメソッドを実行 -> 51が取得できる")
	void test3() {
		Counter counter = new Counter();
		
		for (int i = 1; i <= 50; i++) {
			counter.increment();
		}
		
		assertEquals(51, counter.increment() );
	}
	

}
