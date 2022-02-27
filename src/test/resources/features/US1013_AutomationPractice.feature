Feature: US1013 Invalid email testi

  Scenario: TC18 Invalid email ile giris yapilmaz

    Given kullanici "Automationpraktice" sayfasina gider
    And user sign in linkine tiklar
    And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
    Then error mesajinin “Invalid email address”  oldugunu dogrulayin