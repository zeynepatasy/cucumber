Feature: Amazon Search

  Scenario: TC01 kullanici amazonda nutella aratir

    Given kullanici amazon anasayfaya gider
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayı kapatır

    Scenario: TC02 kullanıcı amazonda java aratır
      Given kullanici amazon anasayfaya gider
      Then kullanıcı Java için arama yapar
      And sonucların Java içerdiğini test eder
      And sayfayı kapatır