Feature: US1002 Kullanıcı ortak adımları Background ile çalıstırır

  Background: ortak adım
    Given kullanici amazon anasayfaya gider

    Scenario: TC04 amazon nutella arama
      And kullanici Nutella icin arama yapar
      Then sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir

      Scenario: TC05 amazon java arama
        And kullanıcı Java için arama yapar
        Then sonucların Java içerdiğini test eder
        And sayfayi kapatir