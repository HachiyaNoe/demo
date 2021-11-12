package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	@DisplayName("テキストファイルを指定してメソッドを実行 ->"
			+ " 名前、名字、メールアドレスが反映されたEmployeeオブジェクトのリストを取得できる")
	void test1() {
		

		InputStream fileStream = getClass().getResourceAsStream("Employee.txt");
			List<Employee> emp = Employee.load(fileStream);
			
			
			

			

			assertEquals("Ichiro", String.valueOf(emp.get(0).getFirstName()) );
			assertEquals("Tanaka", String.valueOf(emp.get(0).getLastName()) );
			assertEquals("ichiro@example.com", String.valueOf(emp.get(0).getEmail()) );
			
		
		
	}

}
