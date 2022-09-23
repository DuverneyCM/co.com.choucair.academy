# language: en

Feature: create new user

  @HappyPath
  Scenario Outline: DuverneyCM wants to fill the register form so that create a new user in UTest website
    Given DuverneyCM want to register in UTest website
    When he fill the register form with the following data:
      | firstName   | lastName   | email   | month   | day   | year   | language   | city    | zipCode   | country    | os   | osVersion   | osLanguage   | mobileBrand   | mobileModel    | mobileOS     | newPassword   |
      | <firstName> | <lastName> | <email> | <month> | <day> | <year> | <language> | <city>  | <zipCode> | <country>  | <os> | <osVersion> | <osLanguage> | <mobileBrand> | <mobileModel>  | <mobileOS>   | <newPassword> |
    Then he should be registered in UTest website
    Examples:
      | firstName | lastName | email              | month | day | year | language | city  | zipCode | country  | os      | osVersion | osLanguage | mobileBrand | mobileModel  | mobileOS   | newPassword      |
      | Duverney  | Corrales | duver5@hotmail.com | July  | 26  | 1987 | Spanish  | Tulua | 763022  | Colombia | Linux   | Ubuntu    | English    | Motorola    | Moto G8 Plus | Android 10 | a1B2c3D4e5F6g7H8 |