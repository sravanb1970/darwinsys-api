package com.darwinsys.security;

import org.junit.*;
import static org.junit.Assert.*;

public class BasicAuthTest {

	@Before
	public void foo() {
		// empty
	}

	@Test
	public void testBasicAuth() {

		String user = "rintintin", pass = "superdog";
		assertEquals("cmludGludGluOnN1cGVyRG9n", 
			BasicAuth.makeHeader(user,pass));
	}
}