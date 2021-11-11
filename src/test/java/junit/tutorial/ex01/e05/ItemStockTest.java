package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.tutorial.ex01.e01.StringUtils;

class ItemStockTest {

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
	@DisplayName("初期状態で、getNum -> ０が取得できる")
	void test1() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("syoki",0);
		assertEquals(0, itemStock.getNum(item));
	}
	
	@Test
	@DisplayName("初期状態で、addでItemを追加 -> 1が取得できる")
	void test2() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("syoki",0);
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item));
	}
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、getNum ->１が取得できる")
	void test3() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book",1);
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item));
	}
	
	@Test
	@DisplayName("Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加 -> getNumで２が取得できる")
	void test4() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book",1);
		itemStock.add(item);
		itemStock.add(item);
		assertEquals(2, itemStock.getNum(item));
	}
	

	@DisplayName("Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加 -> getNumで１が取得できる")
	void test5() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book",1);
		itemStock.add(item);
		Item item2 = new Item("CD",1);
		itemStock.add(item2);
		assertEquals(1, itemStock.getNum(item));
	}

}
