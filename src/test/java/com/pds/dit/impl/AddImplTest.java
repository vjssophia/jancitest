package com.pds.dit.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pds.dit.IAdd;

public class AddImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		IAdd addImpl = new AddImpl();
		assertTrue(addImpl.add(2, 3) == 5);
	}

}
