package com.myproject.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListMock {

	@Test
	void listSizeTest() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3,listMock.size());
	}
	
	@Test
	void listMultipleSizeTest() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(1).thenReturn(5);
		assertEquals(1,listMock.size());
		assertEquals(5,listMock.size());
	}
	
	@Test
	void listElementsTest() {
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn(1);
		assertEquals(1,listMock.get(0));
	}
	
	@Test
	void listNullElementsTest() {
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn(null);
		when(listMock.get(1)).thenReturn(5);
		assertEquals(null,listMock.get(0));
		assertNull(listMock.get(0));
		assertNotNull(listMock.get(1));
	}
	
	
}
