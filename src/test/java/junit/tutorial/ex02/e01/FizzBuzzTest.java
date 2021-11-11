package junit.tutorial.ex02.e01;

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

import junit.tutorial.ex01.e05.Item;
import junit.tutorial.ex01.e05.ItemStock;
import junit.tutorial.ex02.e01.FizzBuzz;

class FizzBuzzTest {

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
	@DisplayName("１６を指定してcreateFizzBuzzListメソッドを実行 ->"
					+ " 「1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16」が取得できる")
	void test1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		

		
		List<String> result = fizzBuzz.createFizzBuzzList(16);
		
		String regex  = ",";
		String answerSt = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16";
		String[] answerHi = answerSt.split(regex, 0);
		
		List<Object> answer = Arrays.asList(answerHi);
		
		//
		
//		answer.add("1");
//		answer.add("2");
//		answer.add("Fizz");
//		answer.add("4");
//		answer.add("Buzz");
//		answer.add("Fizz");
//		answer.add("7");
//		answer.add("8");
//		answer.add("Fizz");
//		answer.add("Buzz");
//		answer.add("11");
//		answer.add("Fizz");
//		answer.add("13");
//		answer.add("14");
//		answer.add("FizzBuzz");
//		answer.add("16");
		
		assertIterableEquals(result, answer );
	}

}
