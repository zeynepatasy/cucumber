Feature: US1004 Kullanıcı parametre ile configuration file'i kullanabilmeli

  Scenario: TC07 configuration properties dosyasından parametre kullanımı

    Given kullanici "amazonUrl" anasayfaya gider
    And kullanıcı 3 saniye bekler
    And url'in "amazon" içerdiğini test eder
    Then sayfayi kapatir