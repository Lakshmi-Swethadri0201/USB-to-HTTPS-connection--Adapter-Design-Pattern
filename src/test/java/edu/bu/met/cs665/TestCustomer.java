package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
/**
 * Name: Lakshmi Swethadri
 * Date: 03/24/2021
 * Course: CS-665
 * Assignment 4
 * Description: Testing Customer class methods.
 * 
 * */

import java.lang.reflect.Field;

import org.junit.Test;

import edu.bu.met.cs665.customers.Customer;

public class TestCustomer {
  @Test
  public void testSetter_setCustId() throws NoSuchFieldException, IllegalAccessException {
    // given
    final Customer c1 = new Customer();
    c1.setCustomerId(10);
    // then
    Field s = c1.getClass().getDeclaredField("customerId");
    s.setAccessible(true);
    assertEquals("Fields didn't match", s.get(c1), 10);
  }

  @Test // test getter
  public void testGetter_getCustId() throws NoSuchFieldException, IllegalAccessException {
    // given
    final Customer c2 = new Customer();
    Field s = c2.getClass().getDeclaredField("customerId");
    s.setAccessible(true);
    s.set(c2, 20);

    // when
    final int result = c2.getCustomerId();

    // then
    assertEquals("field wasn't retrieved properly", result, 20);
  }

  @Test
  public void testGetId() {
    Customer c3 = new Customer(11);
    assertEquals(11, c3.getCustomerId());
  }

  @Test
  public void testGetCustomerName() {
    Customer c4 = new Customer();
    c4.setCustomerName("John");
    assertEquals("John", c4.getCustomerName());
  }

  @Test
  public void testGetCEmail() {
    Customer c5 = new Customer();
    c5.setCustomerEmail("John666@gmail.com");
    assertEquals("John666@gmail.com", c5.getCustomerEmail());
  }

  @Test
  public void testGetCPhone() {
    Customer c6 = new Customer();
    c6.setCustomerContactNo("7812334567");
    assertEquals("7812334567", c6.getCustomerContactNo());
  }

}