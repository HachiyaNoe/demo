package junit.tutorial.ex03.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
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

class NetworkResourcesTest {

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
	  private NetworkLoader networkLoader;
	 // @Spy   一部のメソッドだけモックにしたいときはこれを定義
	   
	 
	
	 @InjectMocks  // テスト対象のクラスに対してつけるアノテーション
	  NetworkResources networkResources = new NetworkResources();
	
//	 private static final String hello = "Hello World";
	 
	 @Test
		@DisplayName("NetworkLoaderが「Hello World」を返すInputStreamを返すとき -> NetworkResourcesのloadメソッドは「Hello World」を返す")
		void test1() throws IOException {
		 
		 
		 
		 Mockito.when(this.networkLoader.getInput()) // このモックを呼び出したとき
         .thenReturn( new ByteArrayInputStream("Hello World".getBytes()));
		 
		 
		 assertEquals("Hello World", networkResources.load());

			
		}

}
