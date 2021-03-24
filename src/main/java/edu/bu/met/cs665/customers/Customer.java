package edu.bu.met.cs665.customers;

/**
 * Name: Lakshmi Swethadri Date: 03/24/2021 Course: CS-665 Assignment 4
 * Description: Customer class. Has data like customer ID, Name, Email and phone
 * number
 */

public class Customer {
  private int customerId;
  private String customerName;
  private String customerEmail;
  private String customerContactNo;

  public Customer() {
  }

  public Customer(int customerId) {
    super();
    this.customerId = customerId;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerContactNo() {
    return customerContactNo;
  }

  public void setCustomerContactNo(String customerContactNo) {
    this.customerContactNo = customerContactNo;
  }

  @Override
  public String toString() {
    return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail=" + customerEmail
        + ", customerContactNo=" + customerContactNo + "]";
  }

}
