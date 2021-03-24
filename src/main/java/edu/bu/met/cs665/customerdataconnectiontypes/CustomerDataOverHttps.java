package edu.bu.met.cs665.customerdataconnectiontypes;

import edu.bu.met.cs665.customers.Customer;

/**
 * Name: Lakshmi Swethadri Date: 03/24/2021 Course: CS-665 Assignment 4
 * Description: Interface to access customer data over https connection.
 *
 */

public interface CustomerDataOverHttps {
  int printCustomer(Customer id); // <-- specificRequest()

  Customer getCustomer_withHttpsConnect(Customer id); // <-- specificRequest()
}
