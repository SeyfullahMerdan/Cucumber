Feature: US1009 Scenario Outline ile editör database sayfasina kayitness

  Scenario Outline: TC14 kullanici yeni kayit ekleyebilmeli

    When kullanici editor anasayfaya gider
    Then new butonuna basar
    And firstname olarak "<firstname>" yazar
    And lastname olarak "<lastname>" yazar
    And Position olarak "<position>" yazar
    And Office olarak "<office>" yazar
    And Extension olarak "<extension>" yazar
    And Start date olarak "<startDate>" yazar
    And Salary olarak "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular


    Examples:

      |  |
