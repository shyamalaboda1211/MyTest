Instructions To Run:
Switch To master Branch for the code.
TestNG using selenium and Java 
It is a POM framework where we have test classes and page classes.
Under src/test/java we have all the test classes and under src/main/java we have all the page classes.
In test class we have ClickTest class which has the test method to run. In page classes we have ClickPage class where we have all the locators of the elements and the methods used for actions performed on the elements.
We have extent reporting where a report generated in the project level which have all the details like number of tests passed, failed and skipped and we have all the logs there which we have given in the classes
Steps To run the tests
  1.Start the Appium Server GUI with Server Address as localhost and Server port as 4723
  2.Start the emulator using Android Studio.
  3.Run the Testng.xml file as TestNG Suite.Right click ->Run As ->TestNG Suite
You can view the execution in the emulator.
Refresh the target folder and open the spark.html file under target folder.You can view the extent report with all the logs.

My Observations on the release v0.9 is Default Text is 0,When clicking on the ClickMe Btn the label text changes to 1,when clicking second time it will be changing to MAX.Where As In release v1.0 Default Text is 0,When clicking on the ClickMe Btn the label text changes to 1,when clicking second time it will be changing to 2,then third time it will be changing to MAX.
