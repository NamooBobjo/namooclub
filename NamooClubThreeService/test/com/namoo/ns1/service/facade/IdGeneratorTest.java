package com.namoo.ns1.service.facade;

import static org.junit.Assert.*;

import org.junit.Test;

import dom.entity.Community;

public class IdGeneratorTest {

	@Test
	public void test() {
		
		System.out.println(IdGenerator.getNextId(this.getClass()));
		
	}

}
