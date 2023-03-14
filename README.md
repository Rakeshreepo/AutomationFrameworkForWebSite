# MyRepository
First Challenge (UI Test Automation)
This exercise is to examine your testing and analysis skills, and your technical knowledge to demonstrate your experience and skill using current testing technologies and methodologies.
Create an account here https://www.amazon.in/
On the first challenge, we need you to perform a UI automation to test a task - “Search & add a product to the cart & come till payments page ”
Create a boilerplate automation project with any automation tool (if you can use cypress/playwright will be a bonus point)
Open amazon in the browser
Search for a "dress"
Select any "dress" from the search page 
Go to the product detail page & select the size
Click on “ADD TO CART”
Click on “GO TO CART”
Validate Order summary - Price & Quantity - Print & assert them 
Lastly, click “Proceed to buy” & on the Login popup screen take a screenshot


Solution 
For Automation I used Java + Selenium and Hybrid Framework.
Platform - Eclipse 
Language - Java 
Tool - Selenium
Project - Maven Project 

Maven -> Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's                build, reporting and documentation from a central piece of information.

TestNG - I user TestNG Annotation for managing the Test Excution.
I created 4 Package 
 1. com.CommonFunction
 2.          commonFunction.java -> Store the all common method inside the class so we dont need to repeat the code just call the method from commonFunction class
 3. com.PageObject
 4.          pageObject.java     -> Store all element in one common class ( e.g. in future if change the object so we don't need to change in all script                                                     we have change in one place)
 5. com.TestCases
 6.         testCases.java       -> All application functionlity store in testCase classs.
 7. com.TestData
 8.         testData.java        -> All test data store inside the class.


Thanks.
 10. 
