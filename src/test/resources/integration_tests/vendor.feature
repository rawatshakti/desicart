Feature: Demo Karate Tests

    Background:
        * url baseUrl

    Scenario: DesiCart page for vendor
        Given path '/vendor/'
        When method get
        Then status 200