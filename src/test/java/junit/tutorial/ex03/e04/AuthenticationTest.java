package junit.tutorial.ex03.e04;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class AuthenticationTest {

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

	// テスト対象で使用するクラスに対してつけるアノテーション

	 // @Spy   一部のメソッドだけモックにしたいときはこれを定義
	   
	 @Mock
	 private AccountDao dao;
	
	 @InjectMocks  // テスト対象のクラスに対してつけるアノテーション
	 Authentication authentication = new Authentication();
	 
	 @Test
		@DisplayName("AccountDaoがnullを返す場合 -> authenticateメソッドはnullを返す")
		void test1()  {
		 doReturn(null)
		  .when(dao).findOrNull("1");
		 
		 assertNull(authentication.authenticate("1", "")); //password部分は任意＝nullでも良いしなんでも

			
		}
	 
	 @Test
		@DisplayName("AccountDaoがAccountオブジェクトを返し、かつパスワードが一致する場合 -> "
						+ "authenticateメソッドはAccountオブジェクトを返す")
		void test2()  {
		 doReturn(new Account("","pass"))
		  .when(dao).findOrNull("");
		 assertTrue(authentication.authenticate("", "pass") instanceof Account);

		}
	 
	 @Test
		@DisplayName("AccountDaoがAccountオブジェクトを返し、かつパスワードが一致しない場合 -> "
				+ "authenticateメソッドはnullを返す")
	 
		void test3()  {
		 doReturn(new Account("","pass"))
		  .when(dao).findOrNull("");
		 assertNull(authentication.authenticate("", ""));

		}

}
