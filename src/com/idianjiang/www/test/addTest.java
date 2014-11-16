package com.idianjiang.www.test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.idianjiang.www.UserTest;

public class addTest {

	@Test
	public void testAdd() {
		int z = new UserTest().add(3,5);

		assertThat(z, is(8));
	}
	
	@Test
	public void testDivide(){
		int z = new UserTest().divide(8, 2);
		assertThat(z, is(4));
	}

}
