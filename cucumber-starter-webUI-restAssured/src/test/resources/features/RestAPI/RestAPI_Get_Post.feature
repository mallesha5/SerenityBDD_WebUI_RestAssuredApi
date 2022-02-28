Feature: Rest API Automation

  Scenario: Submit GET request for OpenWeatherMap Api
    Given The user submits the GET request for weather api
    Then The response status code should be 200

  Scenario: Submit POST request for Creating an user
    Given The user submits the POST request for creating an user
    Then The response status code should be 201