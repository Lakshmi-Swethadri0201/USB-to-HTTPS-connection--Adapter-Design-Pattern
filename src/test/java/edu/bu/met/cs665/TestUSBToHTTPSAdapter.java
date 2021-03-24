package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataOverHttps;
import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataUsb;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.dataimplementation.DataImplHttps;
import edu.bu.met.cs665.dataimplementation.UsbToHttpsAdapter;

/**
 * Name: Lakshmi Swethadri Date: 03/24/2021 Course: CS-665 Assignment 4
 * Description: Testing adapter implementation.
 * 
 */

public class TestUSBToHTTPSAdapter {
  Customer c1 = new Customer(100);
  Customer c2 = new Customer(200);
  CustomerDataOverHttps cDataHTTPS = new DataImplHttps();
  CustomerDataUsb cData = new UsbToHttpsAdapter(cDataHTTPS);

  @Test
  public void testUSBToHTTPSAdapterPrintCustomer() {
    assertEquals(100, cData.printCustomer(c1));
  }

  @Test
  public void testUSBToHTTPSAdapterPrintCustomerNegative() {
    assertNotEquals(200, cData.printCustomer(c1));
  }

  @Test
  public void testGetCustomer_withUSBConnect() {
    c1.setCustomerName("John");
    c1.setCustomerEmail("Johnhop@gmail.com");
    c1.setCustomerContactNo("7812345678");
    assertEquals(c1, cData.getCustomer_withUsbConnect(c1));
  }

  @Test
  public void testGetCustomer_withUSBConnectNegative() {
    c2.setCustomerName("Lux");
    c2.setCustomerEmail("LuxMary@gmail.com");
    c2.setCustomerContactNo("7812345777");
    assertNotEquals(c2, cData.getCustomer_withUsbConnect(c1));
  }

}
