# Testng_Selenium_Cucumber
This frame work is built to develop both the TDD and BDD tests using Selenium and TestNG

Steps to use this framework for TDD scripts development:
a)Create a row with testcase details as shown in the functional test suite sheet of test suite management.xlsx
b)Write your @Test in your testng class and make sure its test case details are updated in the test suite management.xlsx
c)To run this test case, mark the RUN CRITERIA value to YES and run the SuiteLauncher.java class in the package router. Code is written such that the testng.xml is created with the test selected and the xml will be triggered.
d)Once the execution is done, you will be able to see the report similar to Test Automation Report.html shared in this repository.

Steps to use this framework for TDD scripts execution:
a)Modify/Update and save the test data for the test cases to run in the functional test suite sheet of test suite management.xlsx
b)Mark the RUN CRITERIA to YES for those test cases under the current execution suite
c)Run the SuiteLauncher.java class in the package router.
d)Once the execution is done, you will be able to see the report similar to Test Automation Report.html shared in this repository.

Steps to use this framework for BDD scripts development:
a)Write your feature files in the folder Feature Files of Src/Test/Java
b)Right click on the feature file and select Run as cucumber feature. You will able to see void methods created for the steps in console
c)Now copy and paste the methods into the testng class. Create a @Test where in you can use the methods. A sample is given in the InvalidGmailSignin.java
d)Create a row with testcase details as shown in the behavioural test suite sheet of test suite management.xlsx
e)To run this test case, mark the RUN CRITERIA value to YES and run the SuiteLauncher.java class in the package router. Code is written such that the testng.xml is created with the test selected and the xml will be triggered.
f)Once the execution is done, you will be able to see the report similar to cucumber BDD Report.html shared in this repository.

Note: 
a)To view the reports online, right click on the link, select copy link address. Now open this link: http://htmlpreview.github.io/ and use paste the link address.
b) for TDD tests use
<dependency>
    <groupId>com.relevantcodes</groupId>
    <artifactId>extentreports</artifactId>
    <version>2.41.1</version>
</dependency>
c) for BDD tests use
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.0.5</version>
</dependency>
