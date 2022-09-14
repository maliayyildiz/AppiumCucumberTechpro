
  Feature: API Demos Switches
    Background: Switch screen test
      Given App yuklensin
      When kullanici ana ekranda
      And kullanici "API Demos" butununa tikladi
      Then kullanici "API Demos" ekraninda
      And kullanici "Preference" butununa tikladi
      Then kullanici "Preference" ekraninda
      And kullanici "Switches" butununa tikladi

    Scenario: Switch test
      And kullanici check box tikladi
      And kulanici switch butonuna tikladi
      Then screenshot al

    Scenario: Switch button checks
      And check box secili olmali
      And ilk switch butonu kapali
      And ikici switch butonu acik
      Then screenshot al



