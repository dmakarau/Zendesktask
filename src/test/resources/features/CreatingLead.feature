Feature: Working with Leads
  @frontend
  Scenario: Creating a lead and update the status
    Given I am on the zendesk login page
    Then I login with the credentials
    And I am in the Zendesk dashboard
    Then I create a Lead with firstname 'John' and lastname 'Smith'
    And I am in the Zendesk dashboard
    Then I navigate to the Leads Table
    Then I search the lastname 'Smith' in the filter
    And I verify the status is 'New'
    Then I change the status to 'Working'
    Then I navigate to the Leads Table
    And I verify the status is 'Working'
     # Clean the created data
    And I delete the lead with lastname 'Smith' via API

  @api
  Scenario: Creating and updating Lead via API
    Given I create a Lead via API with the first name 'Mark' and the last name 'Johnson'
    And I verify the lead with lastname 'Johnson' exist
    Then I add to the lead with lastname 'Johnson' city 'London', country 'UK' and address 'Highstreet 2'
    And I verify the lead with lastname 'Johnson' has address with city 'London', country 'UK', and street 'Highstreet 2'
    # Clean the created data
    And I delete the lead with lastname 'Johnson' via API


