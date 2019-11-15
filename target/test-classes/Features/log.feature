Feature: Validate the login page

  Scenario Outline: 
    Given user launch the browser"<browserType>"
    When user can enter the "<user_name>","<password>"
    And user can able to click the checkbox
    Then user can navigate to signin
    Examples: 
      |browserType| user_name  | password   |
      |Chrome| labuser    | labuser@01 |      
     |Chrome| labuser@01 | labuser    |
    |Chrome| labuser    | lab@02     |
    |Chrome| labuser@01 | labuser@01 |
      

   #  Scenario Outline:

    #  Given user launch the browser
     #  When user can enter the "<user_name>","<password>"
     #  And user can able to click the checkbox
      # Then user can navigate to signin
      # And user can navigate to home
       # And user can navigate to accounts
        # And user can navigate to transfer
        # And user can navigate to appointment
        
      # Examples: 
        # | user_name  | password   |
        # | labuser    | labuser@01 |
