Feature: Demo Karate Tests

    Background:
        * url baseUrl

    Scenario: DesiCart page for login
        Given path '/login'
        When method GET
        Then status 200

    Scenario: POST DesiCart page for login
        Given path '/login'
        And params ({"userName":"shaktirawat","password":"shakti"})
        And request {}
        When method POST
        Then status 200