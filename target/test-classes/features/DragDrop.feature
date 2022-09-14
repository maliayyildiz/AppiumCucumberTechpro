
  Feature: API demos touch action

    Scenario: Drap and drop
      Given App yuklensin
      And kullanici ana ekranda
      And kullanici API Demos butununa tikladi
      Then kullanici API Demos ekraninda
      And kullanici Views butonuna tikladi
      Then kullanici Views ekraninda
      And kullanici Drag and Drop butonuna tikladi
      When kullanici birinci topu ikici topun ustune brakti
      Then kullanici dorduncu top gorecek
      Then screenshot al
