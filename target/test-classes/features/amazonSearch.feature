@tumu
Feature: Amazon Search
@nutella @ikisi
  Scenario: TC01 kullanici amazonda nutella aratir

    Given kullanici amazon anasayfaya gider
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
@java @ikisi
    Scenario: TC02 kullanıcı amazonda java aratır
      Given kullanici amazon anasayfaya gider
      Then kullanıcı Java için arama yapar
      And sonucların Java içerdiğini test eder
      And sayfayi kapatir
@iphone
      Scenario: TC03 kullanici iphone aratir
        When kullanici amazon anasayfaya gider
        And kullanici iphone icin arama yapar
        Then sonuclarin iphone icerdigini test eder
        And sayfayi kapatir