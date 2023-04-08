Feature: Kullanıcı parametre kullanarak arama yapabilmeli
  @parametre
  Scenario: TC06 kullanıcı parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfaya gider
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    Then sayfayi kapatir