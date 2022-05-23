@sc2
Feature:  user want to sign up in facebook

 In order to register
 as a unregister uger 
 i want to visit facebook web page and type first name, last name, email and select date from dropdown menu
  
 Scenario Outline: 
   Given  user visit facebook home page "<url>"
   When user click on create account button
   When user type Valid "<First name>","<Last name>","<email>",and valid "<password>"
   Then user select dropdown Month and dropdown Day and dropdown Year
   Then user select  gender

Examples:

| url | First name | Last name | email | password |
| www.facebook.com | Mohammad | Mamun | mamun8122@gmail.com | 123456789 |