Using Legacy Systems

1.The purpose of this application is to allow accessing customer data from an old usb connection system
to a cloud https system for a company.

2.There are two interfaces as provided in the requirement, CustomerDataOverUSB and CustomerDataOverHTTPS.
These 2 interfaces are not compatible and hence using adapter design pattern works as a bridge between two incompatible interfaces. 

3.There are 2 concrete classes implementing these two interfaces.
DataImplUsb and DataImplHttps respectively.

4.There is an adapter class, UsbToHttpsAdapter which acts as an adapter.
i.e., class which is  responsible to handle functionalities of independent or incompatible interfaces.

5.The client (main) makes a request to the adapter (UsbToHttpsAdapter) by calling a method on it using the target interface (CustomerDataOverUSB).
The adapter translates that request on the adaptee using the adaptee interface.(CustomerDataOverHTTPS)
Client receive the results of the call and is unaware of adapter’s presence.

6.And hence here client can access customer data using https connection.

Assumptions:
1.Customer class consists of attributes like id, name, email and phone number, which are considered as customer data.

2.Methods printCustomer() and getCustomerData() return types are changed to int and Customer type for better usage purpose and junit testing purpose 
instead of void.

3.In future customer data can be extended to other attributes or scale.

4.Junit tests are covered for adapter implementation, 2 concrete classes and also to customer class.

Git Repo Link :https://github.com/metcs/met-cs665-assignment-4-Lakshmi-Swethadri0201.git

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the Main Java executable. 




# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




