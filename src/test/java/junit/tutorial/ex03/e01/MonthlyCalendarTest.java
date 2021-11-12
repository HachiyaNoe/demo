package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e01.StringUtils;

class MonthlyCalendarTest {

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
	@DisplayName("現在時刻が2012/1/31の場合 -> ０を返す")
	void test1() {
	
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
		
		
		if ( monthlyCalendar.equals("2012/1/31") ) {
			assertEquals(0, monthlyCalendar.getRemainingDays() );
		}
		
	}

	@Test
	@DisplayName("現在時刻が2012/1/30の場合 -> １を返す")
	void test2() {
	
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
		
		
		if ( monthlyCalendar.equals("2012/1/30") ) {
			assertEquals(1, monthlyCalendar.getRemainingDays() );
		}
		
	}
	
	@Test
	@DisplayName("現在時刻が2012/2/1の場合 -> ２８を返す")
	void test3() {
	
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
		
		
		if ( monthlyCalendar.equals("2012/2/1") ) {
			assertEquals(28, monthlyCalendar.getRemainingDays() );
		}
		
	}

}
