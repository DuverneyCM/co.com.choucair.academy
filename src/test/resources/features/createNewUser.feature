# language: en

Feature: create new user

  @HappyPath
  Scenario Outline: DuverneyCM wants to fill the register form so that create a new user in UTest website
    Given DuverneyCM want to register in UTest website
    And he click on the button Join Today
    When he fill the page 1/4 of the register form with the following data:
      | firstName   | lastName   | email   | month   | day   | year   | language   |
      | <firstName> | <lastName> | <email> | <month> | <day> | <year> | <language> |
    And he fill the page 2/4 of the register form with the following data:
      | city    | zipCode   | country   |
      | <city>  | <zipCode> | <country> |
    And he fill the page 3/4 of the register form with the following data:
      | os   | osVersion   | osLanguage   | mobileBrand   | mobileModel    | mobileOS     |
      | <os> | <osVersion> | <osLanguage> | <mobileBrand> | <mobileModel>  | <mobileOS>   |
    And he fill the page 4/4 of the register form with the following data, and accept terms and polices:
      | newPassword   |
      | <newPassword> |
    Then he should be ready to be registered in UTest website

    Examples:
      | firstName | lastName | email              | month | day | year | language | city  | zipCode | country  | os      | osVersion | osLanguage | mobileBrand | mobileModel  | mobileOS   | newPassword      |
      | Duverney  | Corrales | duver5@hotmail.com | July  | 26  | 1987 | Spanish  | Tulua | 763022  | Colombia | Linux   | Ubuntu    | English    | Motorola    | Moto G8 Plus | Android 10 | a1B2c3D4e5F6g7H8 |