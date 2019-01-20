package com.naztech.maven_customListGeneric;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomListTest {

	@Test
	public void testAdd() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("Romi","Romi",1));
		assertEquals(1,list.size());
	}

	@Test
	public void testGet() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("Romi","Romi",1));
		list.add(new Book("java","java",1));
		Book b1 = new Book("java","java",1);
		list.get(1);
		assertEquals(b1,list.get(1));
	}

	@Test
	public void testClear() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("Romi","Romi",1));
		list.add(new Book("java","java",1));
		
		list.clear();
		assertEquals("Expected size to be 0", 0, list.size());
	}

	@Test
	public void testRemove() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("Romi","Romi",1));
		list.add(new Book("java","java",1));
		Book b = new Book("java", "java", 300);
		list.remove(1);
		assertEquals(1, list.size());
		
		
	}

	@Test
	public void testAddAll() {
		CustomList<Book> list = new CustomList<Book>();
		list.add(new Book("feluda", "Satyajit Roy", 300));
	    list.add(new Book("Misir Ali", "Humayun Ahmed", 300));
	    CustomList<Book> list2 = new CustomList<>();
	    list2.add(new Book("Sherlock Holmes", "Sir Conan Doyale ", 300));
	    list2.add(new Book("Byomkesh Bakshi", "Sharadhindho chaterjiee", 300));
	    list.addAll( list2);
	    
	    assertEquals(4, list.size());
	}
   
}
 