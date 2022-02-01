#Autor: Valentina Ramirez Grajales (valentinaramirez375@gmail.com)

  Feature:  As a Customer when I search for Alexa, I want to see if the third option on the second page is
    available for purchase and can be added to the cart


    Scenario Outline: The user select product Alexa
      Given The user enters the page
      When  The user search Alexa
      | product |
      | <productAlexa>|

      And User navigates to the second page
      And User selects the third item

      Then The user not add the product the cart
      Examples:
      | productAlexa|
      | Alexa     |


    Scenario Outline: The user select product Nintendo Switch
      Given The user enters the page Amazon
      When  The user search Nintendo Switch
        | product |
        | <productNintendo>|

      Then The user add the product the cart
      Examples:
        | productNintendo|
        | NintendoSwitch    |