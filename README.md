# SwagLabAutomation

## About Project
Purpose of this project is to automate web application "https://www.saucedemo.com/" using Selenium with Java as a programming language and BDD Cucumber framework.
It generates an HTML report, using extend spark report. Screenshots for both passeda nd failed test cases are attached in report after each step.

It is a maven project, meaning all the dependencies are in the pom.xml file, allowing anyone to easily install the dependencies of the project on their local.
It is a Page Object model framework, using Page Factory to make it simpler and easier to maintain.
(Page factory instantiates an instance of the given class and sets a lazy proxy for each of the WebElement and List<WebElement> fields that have been declared).

*The project is structured in 3 main parts:*
- Page Objects (one java class for each screen of the application containing the declared elements and actions / methods);
- Step Definitions (one java class for each screen of the application containing the Given / When / Then steps);
- Feature files (one feature file for each screen of the application containing the actual gherkin scenarios).

***This project supports cross-browser functionality and could be run with following browsers:***
1. Chrome
2. Firefox
3. IE EDge
4. Safari

***This project supports multi-device testing and could be run with following device :***
1. Desktop
2. Mobile
3. Tablet

***This project covers following functional scenario:***


-> This project covers following two scenarios:
A) User should be able to log in with valid credentials only
- Multiple user login
- Error Message for invalid credentials
B) User should be able to place orders
- Single order
- With single item
- With multiple item
- Multiple order
- With single item
- With multiple item

# How do I get set up? ##

### Summary of set up

Fork / Clone repository from [here](https://github.com/bintu27/SwagLabAutomation.git)
or download zip and set it up in your local workspace.

### Dependencies

**Pre-requisite**
1. JDK  (make sure Java class path is set)
2. Maven & Maven CLI plugin(make sure .m2 class path is set)
3. Eclipse, Intelli J, VS Code, etc
4. Plugin for Cucumber based on your IDE
   [Eclipse](https://marketplace.eclipse.org/content/cucumber-eclipse-plugin), [Intelli J](https://www.jetbrains.com/help/idea/enabling-cucumber-support-in-project.html), [VS Code](https://marketplace.visualstudio.com/items?itemName=alexkrechik.cucumberautocomplete)

#### With an IDE

1. Clone the repository;
2. Open your IDE (Eclipse, Intelli J, VS Code, etc);
3. Import the project into IDE (for Eclipse: File -> Import -> Maven -> Existing maven projects);
4. Wait until all dependencies are downloaded and installed;
5. Install Cucumber IDE plugin for IDE to view the feature files better and be able to navigate to the step definition from the feature file.

#### Without an IDE

In order to run tests from the Command Line, you need to download Maven and set it up properly.

### Execution

#### With an IDE

1. Open the TestRunner java class in the IDE (located here: src/test/java/Runner/TestRunner.java);
2. Update the 'tags' option with the tag for which tests you want to run (e.g. the tags = `”@Regression or @Smoke”` will run all scenarios
3. Right click on the root folder and select Run
4. On the right panel of Run, select Run As TestNG
   **Steps to follow to execute the tests:**

#### Without an IDE via command line

The command to run tests from the Command Line (Terminal) is: `mvn clean test`.
You can pass the various arguments

For Eg: `mvn clean test -DbrowserName=Safari -DdeviceType=Mobile`


### Reporting

**View reports**
Generated reports can be viewed from below path:
1) /test-output/SparkReport/Spark.html

### Arguments

**For Cross Browser testing**
Default browser is set as Chrome, to update browser type use anyone option from below
1. Update config.properties
1. Navigate to /src/test/resources/config.properties
2. Update browserName=Chrome to browserName=Edge or browserName=Firefox or browserName=Safari
**OR**
2. -DbrowserName=<nameOfBrowser> in arguments from command line

**For Cross Device testing**
Default device is set as desktop, to update device type use any one option from below:
1. Update config.properties
1. Navigate to /src/test/resources/config.properties
2. Update deviceType=Desktop to deviceType=Mobile or deviceType=Tablet
**OR**
2. -DdeviceType=<typeOfDevice> in arguments from command line


Report at Overview level
![Screenshot](https://github.com/bintu27/SwagLabAutomation/blob/master/test-output/Report%201.png)

Report at Status at each level
![Screenshot](https://github.com/bintu27/SwagLabAutomation/blob/master/test-output/Report%202.png)

Report at tag level
![Screenshot](https://github.com/bintu27/SwagLabAutomation/blob/master/test-output/Report%203.png)

Report at steps level
![Screenshot](https://github.com/bintu27/SwagLabAutomation/blob/master/test-output/Report%204.png)

