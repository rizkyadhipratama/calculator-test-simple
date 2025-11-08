Feature: Show Shipping Progress
 Scenario: User view the product shipping progress
   Given the user is on the historical transaction
   When the user click the latest product transaction
   Then the page will shows the shiping progress