package com.idianjiang.www.test;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.idianjiang.www.User;
import static org.hamcrest.Matchers.*;
public class userTest {

	@Test
	public void testGetName() {
		assertThat(new User().getName(), is("ËÎ»ÛÇÇ"));
	}

}
