
  Feature: Ios ui catalog test

    Scenario: Alert view
      Given App yuklensin
      When kullanici alert view tikladi
      And okey butonuna tikladi
      Then popup ekran geldi
      And ok butonuna tikladik
