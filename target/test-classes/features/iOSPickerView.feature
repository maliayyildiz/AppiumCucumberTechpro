
  Feature: Uicatalog
    Scenario: Picker view test
      Given App yuklensin
      When kullanici Picker View tikladi
      Then kullanici Picker View sayfasinda
      And kullanici ilk sutuna "5" yazdi
      And kullanici ikinci sutuna "15" yazdi
      And kullanici ucuncu sutuna "20" yazdi
      Then kullanici yazdigi degerleri "5" "15" "20" gordu

