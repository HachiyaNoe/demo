package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
		InputStream fileStream;
		try {
			fileStream = new FileInputStream("Employee.txt");
			List<Employee> list = Employee.load(fileStream);
		
		Employee employee = new Employee();
		
			assertEquals(employee.getFirstName(),list.get(1) );
			assertEquals(employee.getLastName(),list.get(2) );
			assertEquals(employee.getEmail(),list.get(3) );
			
		} catch (IOException e) {
			
		}
		
	}

}
