Feature: US1004 Kullanıcı parametre ile configuration file'i kullanabilmeli

  Scenario: TC07 configuration properties dosyasından parametre kullanımı

    Given kullanici "brcUrl" anasayfaya gider
    And kullanıcı 3 saniye bekler
    And url'in "blue" içerdiğini test eder
    Then sayfayi kapatir