package edu.bu.met.cs665.dataimplementation;

import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataOverHttps;
import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataUsb;
import edu.bu.met.cs665.customers.Customer;

/**
 * Name: Lakshmi Swethadri. Date: 03/24/2021. Course: CS-665. Assignment 4.
 * Description: Adapter class. It follows the signature that we are used to
 * using: printCustomer(), getCustomer_withUSBConnect. but maps it to the
 * adaptee and handles it.
 *
 */

public class UsbToHttpsAdapter implements CustomerDataUsb {
  private CustomerDataOverHttps dataHttps;

  public UsbToHttpsAdapter(CustomerDataOverHttps dataHttps) {
    super();
    this.dataHttps = dataHttps;
  }

  // rewiring printCustomer to invoke printing through https connection.
  @Override
  public int printCustomer(Customer id) {
    return dataHttps.printCustomer(id);
  }

  // rewiring getCustomer to invoke get customer data through https connection.
  @Override
  public Customer getCustomer_withUsbConnect(Customer id) {
    return dataHttps.getCustomer_withHttpsConnect(id);
  }

}
