@alltestrun
Feature: verify nopcommerce site

 @tag1
 Scenario: verify login function
  Given user launches browser
  When user enters url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
  And user enters email "admin@yourstore.com" and password "admin"
  And user clicks on login button
  Then verify title of page as "Dashboard / nopCommerce administration"
  #When user clicks on logout
  #Then verify title of page as follows "Your store. Login"