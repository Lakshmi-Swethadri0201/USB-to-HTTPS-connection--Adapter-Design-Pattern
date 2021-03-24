package edu.bu.met.cs665.dataimplementation;

import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataUsb;
import edu.bu.met.cs665.customers.Customer;

/**
 * Name: Lakshmi Swethadri. Date: 03/24/2021. Course: CS-665. Assignment 4.
 * Description: Concrete class implementing CustomerDataUSB interface.
 *
 */
public class DataImplUsb implements CustomerDataUsb {

  // print customer method to print customer id using usb connection
  @Override
  public int printCustomer(Customer id) { // <-- requestSpecific()
    System.out.println("Printing customer id using usb connection");
    System.out.println(" Customer Id: " + id.getCustomerId());
    return id.getCustomerId();
  }

  // getCustomer_withUSBConnect method to get customer data using usb connection
  @Override
  public Customer getCustomer_withUsbConnect(Customer id) {
    System.out.println("Accessing customer data using usb connection");
    System.out.println(" For Customer Id: " + id.getCustomerId());
    return id;
  }

}
