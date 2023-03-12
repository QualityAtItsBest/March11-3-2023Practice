Feature: Free CRM Login Feature




#with Examples Keyword
Scenario Outline: Register a User

Given User is on Register Page
When Title of page is My Store
And Click on Sign In
And Enter a Valid Email ID
And Click on Create an Account

And Enter a Title
And Enter First Name
And Enter Last Name
And Enter Password
And Date of Birth
And Enter Company
And Enter Address
And Enter City
And Enter State
And Enter ZIP
And Enter Country
And Enter Additional Details
And Enter Home Phone
And Enter Mobile Phone
And Click on Register
Then Verify User is Created


	