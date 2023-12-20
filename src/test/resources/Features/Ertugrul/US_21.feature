@ert
Feature:  The registered user must be able to access the website from the browser with the given URL


  Scenario: [TC_001] Test to access website from browser with URL as a registered user

    Given go to "homePageURL"
    Then  Test access to the website with the given URL
    #And   close page

    Scenario: [TC_002] Activation test of Contact information and Links in the home page top bar
      Given go to "homePageURL"
      Then Verify that the email information in the top bar of the homepage is visible.
      Then Verify that the adress information in the top bar of the home page is visible.
      Then Verify that the phone information in the top bar of the home page is visible.
      And close page

    Scenario: [TC_003] Verify that the Buttons banner on the top bar of the home page is visible and clickable.

      Given go to "homePageURL"
      Then Verify that the About banner on the top bar of the home page is visible and clickable.
      Then Verify that the Plans banner on the top bar of the home page is visible and clickable.
      Then Verify that the Blogs banner on the top bar of the home page is visible and clickable.
      Then Verify that the Contact banner on the top bar of the home page is visible and clickable.
      Then Verify that the Login icon banner on the top bar of the home page is visible and clickable.
      Then Verify that the Home banner on the top bar of the home page is visible and clickable.
      Then Verify that the Get Started Icon banner on the top bar of the home page is visible and clickable.
      And  close page

    Scenario: [TC_004] Verify that the banners in the top bar of the homepage redirect to relevant pages

      Given go to "homePageURL"
      Then Verify that clicking on the About banner in the top bar of the home page takes you to the desired page.
      Then Verify that clicking on the PLans banner in the top bar of the home page takes you to the desired page.
      Then Verify that clicking on the Blogs banner in the top bar of the home page takes you to the desired page.
      Then Verify that clicking on the Contact banner in the top bar of the home page takes you to the desired page.
      Then Verify that clicking on the Login banner in the top bar of the home page takes you to the desired page.
      Then Verify that clicking on the Home banner in the top bar of the home page takes you to the desired page.
      Then Verify that clicking on the Get Started banner in the top bar of the home page takes you to the desired page.
      And close page



