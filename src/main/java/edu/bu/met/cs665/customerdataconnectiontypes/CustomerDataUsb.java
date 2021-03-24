package edu.bu.met.cs665.customerdataconnectiontypes;

import edu.bu.met.cs665.customers.Customer;

/**
 * Name: Lakshmi Swethadri Date: 03/24/2021 Course: CS-665 Assignment 4.
 * Description: Interface to access customer data with USB connection. This is
 * the << interface >> Target.
 */
public interface CustomerDataUsb {
  int printCustomer(Customer id); // <-- request()

  Customer getCustomer_withUsbConnect(Customer id); // <-- request()
}
