#Author: softwaretestlab@hotmail.com
  #Given
  #When
  #Then
  #And
  #But
  #*

  Feature: Create An Account on abc website
    Scenario Outline: Create an Account on abc
     Given Navigate to abc website
      Then Enter username as "<username>"
      Then Enter password as "<password>"
      Examples:
        |username|password|
        |FirstName01|LastName01|
        |FirstName02|LastName02|


