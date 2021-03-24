package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataUsb;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.dataimplementation.DataImplUsb;

/**
 * Name: Lakshmi Swethadri Date: 03/24/2021 Course: CS-665 Assignment 4
 * Description: Testing concrete implementation of interface CustomerDataOverUSB
 * 
 */

public class TestDataImplUSB {
  Customer cust1 = new Customer(10);
  Customer cust2 = new Customer(20);
  CustomerDataUsb custUSB = new DataImplUsb();

  @Test
  public void testPrintCustomer() {
    assertEquals(10, custUSB.printCustomer(cust1));
  }

  @Test
  public void testPrintCustomerNegative() {
    assertNotEquals(100, custUSB.printCustomer(cust1));
  }

  @Test
  public void testgetCustomer_withHTTPSConnection() {
    assertEquals(cust1, custUSB.getCustomer_withUsbConnect(cust1));
  }

  @Test
  public void testgetCustomer_withHTTPSConnectionNegative() {
    assertNotEquals(cust2, custUSB.getCustomer_withUsbConnect(cust1));
  }

}
