Feature: Verifying Adactinhotel details

  Scenario Outline: Verifying Adactinhotel login details with valid credentials
    Given User is on the Adactinhotel page
    When User should login using "<username>" and "<password>"
    And User should search hotel "<location>", "<hotels>", "<room type>", "<no of rooms>", "<checkin date>", "<checkout date>", "<adults per room>"and "<childs per room>"
    And User should search hotel using Search
    And User should select hotel using Radio button and continue
    And User should book a hotel by providing "<firstname>", "<lastname>", "<address>", "<CCno>", "<CCType>", "<expirymonth>", "<expiryyear>"and "<CVV>"
    And User should book hotel using Book now
    Then User should conform booking using Order no

    Examples: 
      | username  | password    | location  | hotels         | room type | no of rooms | checkin date | checkout date | adults per room | childs per room | firstname | lastname | address | CCno             | CCType      | expirymonth | expiryyear | CVV |
      | PradeepGT | Pradeep@123 | London    | Hotel Sunshine | Deluxe    | 1 - One     | 25/06/2022   | 26/06/2022    | 1 - One         | 0 - None        | Pradeep   | S        | Chennai | 9876543210123456 | VISA        | July        |       2022 | 123 |
      | PradeepGT | Pradeep@123 | Melbourne | Hotel Creek    | Standard  | 2 - Two     | 25/06/2022   | 26/06/2022    | 2 - Two         | 0 - None        | Pradeep   | S        | Chennai | 9876541230321456 | VISA        | August      |       2022 | 321 |
      | PradeepGT | Pradeep@123 | London    | Hotel Sunshine | Deluxe    | 3 - Three   | 25/06/2022   | 26/06/2022    | 4 - Four        | 0 - None        | Pradeep   | S        | Chennai | 7894561230987456 | Master Card | March       |       2023 | 987 |
      | PradeepGT | Pradeep@123 | New York  | Hotel Hervey   | Deluxe    | 1 - One     | 25/06/2022   | 26/06/2022    | 1 - One         | 0 - None        | Pradeep   | S        | Chennai | 9876543210123456 | VISA        | July        |       2022 | 123 |
      | PradeepGT | Pradeep@123 | Paris     | Hotel Cornice  | Double    | 2 - Two     | 25/06/2022   | 26/06/2022    | 2 - Two         | 2 - Two         | Pradeep   | S        | Chennai | 7789654123085214 | Master Card | July        |       2022 | 123 |
