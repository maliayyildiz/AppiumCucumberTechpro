Feature: API Demos test

  Scenario Outline: Text box data gonderme
    Given App yuklensin
    And kullanici ana ekranda
    And kullanici API Demos butununa tikladi
    Then kullanici API Demos ekraninda
    And kullanici Preference butununa tikladi
    Then kullanici Preference ekraninda
    And kullanici Preference dependencies tikladi
    And kullanici WiFi check box secmis olacak
    And kullanici WiFi Settings tikladi
    Then WiFi setting popup geldi
    And kullanici "<text>" yazdi
    And kullanci ok butonuna tikladi
    Examples:
      | text |
      | ali  |
      | veli |

