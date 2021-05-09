**PURCHASEFLOW AUTOMATION**
 
 In this project; 
1.	This framework contains Selenium code to drive the browser and test the web application.
2.	Uses a Maven project structure and written in Java.
3.	Tests are written in Gherkin and are stored in feature files.
4.	The framework utilizes the Page Object pattern.
5.  This framework I used OOP concept.
6.  In my Utilities package I have reusable utilities which can be used across different classes of my framework.
7.  I have in my framework configuration.properties file to store the important test data, like usernames, passwords, url’s.   

**BACKGROUND**

For this project I prefer to use Cucumber which is a test automation tool following the principles of Behavioural Driven Design and living documentation. 
Specifications are written in a concise human readable form and executed in continuous integration.
This project allows you to have a comprehensive overview on how to implement a BDD framework in Selenium Webdriver with Junit test framework.

**PAGES**

For this project I created pages folder which I store web elements,constractors and some methods.

**FEATURE FILES**

A Feature File is the entry point for a Cucumber test where the features are described in BDD format/style. I’ve built feature files in the feature package. Each of them contains a list of scenarios. For example,

PurchaseFlow.feature

**STEP DEFINITIONS**

A Step Definition is a java method in a class with an annotation above it. An annotation (@Given/ @When/ @Then) followed by the pattern is used to link the Step Definition to all the matching Steps, and the code is what Cucumber will execute when it sees a Gherkin Step.
Based on that, I’ve created the test suite classes in the stepdefinition package. For each of them I’ve defined all the methods with Gherkin annotation (@Given/ @When/ @Then).I also have package with my step definitions. Also it has my Hooks class where I have Before and After methods that set up my tests, take screenshots for failed tests 


**HOW TO RUN**

Option 1

Cukes Runner

With a complete set of stepdefinions I proceeded to the creation of a class for running the tests.Under PurchaseFlow file , I created runners/cukesRunner class to run specific tests or all the test cases by using tags.

Option 2

Finally, select the Testrun Junit option and then all the tests will be running correctly.





