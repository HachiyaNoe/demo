package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junit.tutorial.ex02.e05.ConsumptionTax;

class FrameworksTest {

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
	@DisplayName("表で〇の組み合わせの場合 -> isSupportはtrueを返す（×の組み合わせでfalseを返す）")
	@CsvSource({
	    "GlassFish, Oracle, true",
	    "GlassFish, DB2, true",
	    "GlassFish, PostgreSQL, true",
	    "GlassFish, MySQL, true",
	    
	    "JBoss, Oracle, false",
	    "JBoss, DB2, true",
	    "JBoss, PostgreSQL, true",
	    "JBoss, MySQL, false",
	    
	    "Tomcat, Oracle, false",
	    "Tomcat, DB2, false",
	    "Tomcat, PostgreSQL, false",
	    "Tomcat, MySQL, true",
	})
	
	
	
	void test1(ApplicationServer appServer, Database db) {
		
		if ( appServer.equals("GlassFish")) {
			assertTrue(Frameworks.isSupport(appServer, db));
		}
		
		if (appServer.equals("JBoss")) {
		
			if ( appServer.equals("JBoss") && db.equals("DB2") || db.equals("PostgreSQL")) {
				assertTrue(Frameworks.isSupport(appServer, db));
			} else  {
				assertFalse(Frameworks.isSupport(appServer, db));
			} 
				
		}
			
		if (appServer.equals("Tomcat")) {
		
			if ( appServer.equals("Tomcat") && db.equals("MySQL") ) {
				assertTrue(Frameworks.isSupport(appServer, db));
			} else  {
				assertFalse(Frameworks.isSupport(appServer, db));
			} 
				
		}
	}
		
		
	

}
