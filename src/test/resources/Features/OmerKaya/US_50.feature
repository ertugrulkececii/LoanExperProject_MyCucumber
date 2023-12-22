@omerKaya

Feature: [US_050] As an administrator (admin), I want to be able to send notifications to all users

  Scenario:[TC_01>US_050] Test that the admin can send notifications to all users

    * go to admin "adminLoginPage" page
    * admin clicks on the login button and enters the system with the registered "adminValidUserName" and "adminValidPassword"
    * On the dashbord page, the administrator views and clicks on the notification to all tab under manage user.
    * In the being sent section on the page that opens, the admin can filter all users or the selected user.
    * The admin sends a message to the user has identified on the page that opens, including the topic, message, specific start date and period.
    * The admin sees the warning message indicating a successful send.
    * The admin will see the error message warning when an error is encountered