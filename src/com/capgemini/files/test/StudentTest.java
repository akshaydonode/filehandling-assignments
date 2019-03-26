package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.files.model.MyClass;



public class StudentTest {

	private ArrayList<MyClass> student;
	private MyClass student1;
	private MyClass student2;
	private MyClass student3;
	private MyClass student4;
	private MyClass student5;


	@Before
	public void setUp()
	{
		student1 = new MyClass(1, "Ram");
		student2 = new MyClass(2, "Akshay");
		student3 = new MyClass(3, "Ruchir");
		student4 = new MyClass(4, "John");
		student5 = new MyClass(5, "Ram");
		student = new ArrayList<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
	}
	
	@Test
	public void testArrayListSerialization() throws IOException {
		
		assertTrue(new MyClass().serialization("student.ser", student));
	}
	
	@Test
	public void testArrayListDeserialization() throws IOException, ClassNotFoundException {
		
		MyClass student = new MyClass();
		ArrayList<MyClass> expected = (ArrayList<MyClass>) student.deserialization("student.ser");
		Iterator<MyClass> iterator = expected.iterator();
		assertEquals(student1, iterator.next());
		assertEquals(student2, iterator.next());
		assertEquals(student3, iterator.next());
		assertEquals(student4, iterator.next());
		assertEquals(student5, iterator.next());
	}

}
