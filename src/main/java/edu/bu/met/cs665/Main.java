package edu.bu.met.cs665;

import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataOverHttps;
import edu.bu.met.cs665.customerdataconnectiontypes.CustomerDataUsb;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.dataimplementation.DataImplHttps;
import edu.bu.met.cs665.dataimplementation.DataImplUsb;
import edu.bu.met.cs665.dataimplementation.UsbToHttpsAdapter;

/**
 * Name: Lakshmi Swethadri. Date: 03/24/2021. Course: CS-665. Assignment 4.
 * Description: Main class. This is the Client.
 */

public class Main {
  /**
   * Main method to run examples for usb and https connection.
   */
  public static void main(String[] args) {
    // creating 2 customer instances with id 10 and 20.
    Customer cust1 = new Customer(10);

    // accessing customer data using old method USB connection.
    CustomerDataUsb custUsb = new DataImplUsb();
    custUsb.printCustomer(cust1);
    custUsb.getCustomer_withUsbConnect(cust1);
    System.out.println("\n");

    Customer cust2 = new Customer(20);

    // accessing customer data using https connection with the help of adapter
    // class.
    CustomerDataOverHttps dataHttps = new DataImplHttps(); // <-- adaptee
    CustomerDataUsb custData = new UsbToHttpsAdapter(dataHttps); // <-- adapter
    custData.printCustomer(cust2);
    custData.getCustomer_withUsbConnect(cust2);

  }
}