package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.excel.XlsDataSet;
import org.dbunit.ext.postgresql.PostgresqlDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MemberRepositoryTest {
	
	@Autowired
	private MemberRepository repository;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private Sample sample;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		// DBコネクション取得
		Connection conn = jdbcTemplate.getDataSource().getConnection();
		IDatabaseConnection dbconn = new DatabaseConnection(conn);

		DatabaseConfig config = dbconn.getConfig();
//		config.setProperty(DatabaseConfig.PROPERTY_METADATA_HANDLER, new PostgresqlMetadataHandler());
		// new PostgresqlDataTypeFactory()
		config.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new PostgresqlDataTypeFactory());
		// Excel用データセット作成
		File f = new File(ClassLoader.getSystemResource("test_data.xlsx").getFile());
		IDataSet dataset = new XlsDataSet(f);

		// データの全削除
		DatabaseOperation.DELETE_ALL.execute(dbconn, dataset);

		// データの挿入
		DatabaseOperation.INSERT.execute(dbconn, dataset);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("20歳以上はfugaとpiyo")
	void testProc() throws Exception {
		List<String> expected = Arrays.asList("fuga", "piyo");
		assertIterableEquals(expected, sample.proc());
		
	}
	
	@Test
	@DisplayName("3件取得できること")
	void test1() {
	
		
		List<Member> memberList = repository.findAll();
		
		
		assertEquals(3, memberList.size());
		
	}

	@Test
	@DisplayName("3件目の名前がpiyoであること、3件目の名前がpiyoであること")
	void test2() {
	
		
		List<Member> memberList = repository.findAll();
		Member m = memberList.get(2); 
		
		assertEquals("piyo", m.getName());
		
	}
	
	@Test
	@DisplayName("2件目の年齢が20であること")
	void test3() {
	
		List<Member> memberList = repository.findAll();
		Member m = memberList.get(1); 
		
		assertEquals(20, m.getAge());
		
	}
	
}
