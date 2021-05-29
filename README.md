# Into
The test task was implemented using the following technologies:
- Selenium Webdriver
- Serenity BDD as a wrapper for tests
- Cucumber as BDD framework
- TestNG as testing framework
- Maven as bulding system
- Java as programming language
The tests are written in BDD style. In folder `src/test/resources/features` there is a feature file with the two test scenarios: frontend part and the API part.

# Preconditions
- JVM 1.8 or later
- Apache Maven 3.6.3
- Inside the package I added the chromedriver, which is compatible with the chrome 90. Make sure the chrome 90 is installed or download and place the appropriate driver for
the browser in the `src/test/resources/webdrivers`. If running tests on mac after downloading the new webdriver - it is required to run:
 `xattr -d com.apple.quarantine <name-of-executable>`once before the first test run.
- make chromedriver executable `chmod +x chromedriver`
- 
 P.S. I know it would be better and earsier to use WebdriverManger to handle webdriver, but I had no time to implement it.

# Run the tests
- to run all 2 task: `mvn clean verify`- Maven will install all the necessary dependencies and run the tests
- to run only frontend task - `mvn clean verify -Dccucumber.options=--tags=@frontend`
- to run only API task - `mvn clean verify -Dccucumber.options=--tags=@api``
After test execution - the test report with the screenshot (for the frontend part) or the requests/responses (for the web part) is located in the 
`target/site/serenity/index.html`
