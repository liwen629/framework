package com.my.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test3 {

@Before

public void setUp() throws Exception {

}

@After

public void tearDown() throws Exception {

}

@Test

public void test1() {

try {

Thread.sleep(1000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

assertEquals(1,2);

}

@Test

public void test2() {

try {

Thread.sleep(1000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

assertEquals(1,1);

}

@Test

public void test3() {

try {

Thread.sleep(1000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

assertEquals(11,11);

}

}