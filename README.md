# Tripti1028976

This framework has been created as automation exercise:

In order to exeute the test cases, 
1. Clone the project in your local drive
2. Download maven and set up the path
3. Download java 1.8 and set up the path

The project flow is as given:
There are two scenarios in feature file
First scenario: 
User adds a T-Shirt to cart by clicking on Add to cart on Sign In page
Then completes the order using credentials:
Email :someone@xample.com
Password: Password123
And completes the order and verifies the order history

Second scenario:
User sign in into the account using credentials:
Email :someone@xample.com
Password: Password123
And updates first name in My Account page

1. Go to the project and then src/test/java
2. Open TestCaseRunner.java class from com.assess.runner package
3. From there go to the feature file mentioned in features attribute of @CucumberOptions annotation
4. In featurefile.feature file there are two scenarios mentioned
   Background is used to open the url for both the scenarios
5. Go to the StepDefinition.java class in com.assess.stepDefinition package
6. StepDefinition.java contains the steps definitions of all the steps mentioned in feature file
7. com.assess.pageObjects package contains all the page objects used in designing the framework
8. SignInPage.java page object is used for both the scenarios i.e. for ordering a tshirt and udating personal information
   Tshirt.java page object is used for selecting a tshirt and adding it to cart and navigate to Adrress page
   Address.java page object is used to Proceed To CheckOut and navigate to shipping page
   Shipping.java page object is used to opt for shipping option and navigate to payment page
   Payment.java page object is used to select payment method and navigate to Orderhistory page after successfully placing the order
   OrderHistory.java page object is usde to verify the details of order placed
   MyAccount.java page object is used to update the first name in personal information and navigate to home page after success message is displayed
9. BasePage.java class in com.assess.setup package is used to select and open the browser and to impose an implicit wait of 12 seconds 
10. Right click on the project and select Run As Maven Test
11. Can be run as JUnit Test also.


Improvements that could be considered to develop the framework :

==> Since Behavior Driven Development (BDD) is one of the powerful development style. 
    When BDD integrate with agile then it becomes more dynamic.
