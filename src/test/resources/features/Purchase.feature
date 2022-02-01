#Autor: Valentina Ramirez Grajales (valentinaramirez375@gmail.com)

  Feature:  As a Customer when I search for Alexa, I want to see if the third option on the second page is
    available for purchase and can be added to the cart


    Scenario Outline:
      Given The user enters the page
      When  The user search Alexa
      | product |
      | <productAlexa>|
      Then The user add the product the cart
      Examples:
      | productAlexa|
      | Alexa     |