package edu.bu.met.cs665.dataimplementation;

import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataOverHttps;
import edu.bu.met.cs665.customers.Customer;

/**
 * Name: Lakshmi Swethadri. Date: 03/24/2021. Course: CS-665. Assignment 4.
 * Description: This is the Adaptee. Implementing CustomerDataOverHTTPS
 * interface.
 *
 */

public class DataImplHttps implements CustomerDataOverHttps {

  // print customer method to print customer id using https connection
  @Override
  public int printCustomer(Customer id) { // <-- requestSpecific()
    System.out.println("Printing customer id using https connection");
    System.out.println(" Customer Id: " + id.getCustomerId());
    return id.getCustomerId();
  }

  // getCustomer_withHTTPSConnect method to get customer data using https
  // connection
  @Override
  public Customer getCustomer_withHttpsConnect(Customer id) { // <-- requestSpecific()
    System.out.println("Accessing customer data using https connection");
    System.out.println(" For Customer Id: " + id.getCustomerId());
    return id;
  }

}
