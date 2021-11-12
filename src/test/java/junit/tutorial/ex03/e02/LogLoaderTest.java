package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;

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
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

class LogLoaderTest {


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
	
	
	
	 @Mock // テスト対象で使用するクラスに対してつけるアノテーション
	  private LogLoader logLoader;
	 // @Spy   一部のメソッドだけモックにしたいときはこれを定義
	   
	 
	
	 @InjectMocks  // テスト対象のクラスに対してつけるアノテーション
	  LogAnalyzer logAnalyzer  = new LogAnalyzer();
	
	 private static final String file = "/aaa/employee.pdf";
	 
	@Test
	@DisplayName("LogLoaderのloadメソッドが呼び出されたときにIOExceptionを送出した場合 -> AnalyzeExeptionが送出される")
	void test3() throws IOException {
	

		try {
			
			//モック化したメソッドで例外を発生させる
			doThrow(new IOException("IOExceptionが発生しました")).when(logLoader).load(eq(file)); 

			logAnalyzer.analyze(file);
			
			fail("AnalyzeExeption例外が発生しませんでした");
			
		} catch (AnalyzeException e) {
			Throwable t = e.getCause();
			assertTrue(t instanceof IOException); //instanceof　= 型が一致しているか
			assertEquals("IOExceptionが発生しました",t.getMessage(), "例外のメッセージが異なります");
		}
		
	}

}
