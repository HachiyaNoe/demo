package junit.tutorial.ex03.e05;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex03.e04.Account;

class HelloServletTest {

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
		@DisplayName("引数:nameパラメータに「JUnit」を設定したHttpRequestオブジェクト -> "
				+ "HttpResponseオブジェクトに「Hello JUnit」を書き出す")
		void test1()  {
		
//		 doReturn(new Account("","pass"))
//		  .when(dao).findOrNull("");
//		 
//		 assertTrue(authentication.authenticate("", "pass") instanceof Account);

		}

}
