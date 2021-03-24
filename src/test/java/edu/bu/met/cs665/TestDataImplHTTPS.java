package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
/**
 * Name: Lakshmi Swethadri
 * Date: 03/24/2021
 * Course: CS-665
 * Assignment 4
 * Description: Testing concrete implementation of interface CustomerDataOverHTTPS
 * 
 * */

import org.junit.Test;

import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataOverHttps;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.dataimplementation.DataImplHttps;

public class TestDataImplHTTPS {
  Customer cust1 = new Customer(10);
  Customer cust2 = new Customer(20);
  CustomerDataOverHttps httptest = new DataImplHttps();

  @Test
  public void testPrintCustomer() {
    assertEquals(10, httptest.printCustomer(cust1));
  }

  @Test
  public void testPrintCustomerNegative() {
    assertNotEquals(100, httptest.printCustomer(cust1));
  }

  @Test
  public void testgetCustomer_withHTTPSConnection() {
    assertEquals(cust1, httptest.getCustomer_withHttpsConnect(cust1));
  }

  @Test
  public void testgetCustomer_withHTTPSConnectionNegative() {
    assertNotEquals(cust2, httptest.getCustomer_withHttpsConnect(cust1));
  }

}
