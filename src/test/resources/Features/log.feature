@techfish
Feature: Validate the login page
 @home 
  Scenario Outline: TC_01_Validate the login page
    Given user launch the browser"<browserType>"
    When user can enter the "<user_name>","<password>"
    And user can able to click the checkbox
    Then user can navigate to signin
    Examples: 
      |browserType| user_name  | password   |
     # |Chrome| labuser    | labuser@01 |      
       |chrome| labuser@01 | labuser    |
    #|Chrome| labuser    | lab@02     |
    #|Chrome| labuser@01 | labuser@01 |     
@home1 
     Scenario Outline: TC_02_Validate the login page_Accounts
      Given user launch the browser"<browserType>"
      When user can enter the "<user_name>","<password>"
      And user can able to click the checkbox
      Then user can navigate to signin
      And user can navigate to home
      And user can navigate to accounts
     
        
       Examples: 
         |browserType| user_name       | password   |
         |chrome     | labuser         | labuser@01 |      
@home2
     Scenario Outline:TC_03_Validate the login page_Transfer
      Given user launch the browser"<browserType>"
      When user can enter the "<user_name>","<password>"
      And user can able to click the checkbox
      Then user can navigate to signin
      And user can navigate to home    
      And user can navigate to transfer
     
        
       Examples: 
         |browserType| user_name       | password   |
         |IE     | labuser         | labuser@01 |  
         
             
@home3
     Scenario Outline:TC_04_Validate the login page_Appointment
      Given user launch the browser"<browserType>"
      When user can enter the "<user_name>","<password>"
      And user can able to click the checkbox
      Then user can navigate to signin
      And user can navigate to home        
      And user can navigate to appointment
        
       Examples: 
         |browserType| user_name       | password   |
         |firefox    | labuser         | labuser@01 | 
             
   
   
