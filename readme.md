# Title
UISeleniumWithJavaProject - Soucedemo selenium with java project test. 

# Introduction
This is a java with seleninium test automation project for the soucedemo site: https://www.saucedemo.com
The automated tests cover the scenarios from the login, through the adding product to the cart, and checking the content of the cart, to finalizing the purchase item process.

# Technology used:
### Technology Used 
Java, TestNG, Selenium, Maven 
### Framework Used: 
Page Object Model

# Requrements
The test requires the java version 10 or later instalation.
To install java, visit www.oracle.com and download the version appropriate to your operating system.
On mac machines the unzipped jdk file should be stored in Library/Java/JavaVirtualMachines.

Download intelliJ editor to be able to read the code and to run tests from https://www.jetbrains.com. On mac machines move the intelliJ to the applications folder and open the project from it.

Install Maven version 3.

# Configuration
To run the tests some dependencies need to be installed in pom.xml file from the https://mvnrepository.com/:
1. selenium-java dependency - on the project the version 4.5.0 is installed.
2. webdrivermanager - on the project the version 5.3.0 is installed.
3. testng - on the project the version 7.6.1 is installed.

# Project structure
1. Tests package - The tests are included in this package with TestsSetUp super class.
2. Pages package - All elements and methodes used in tests are present in the package. Every page is represented by one class. 
There is also Pages super class with the initialization of all the pages. TestSetUp class extends the Pages class.
3. Models package - Classes that represent data models of the application under the test are in this package.
4. Helper package - Constant variables and assert helper are included in this package.

# Test execution
Select tests package in the project and select Run Tests in tests.
