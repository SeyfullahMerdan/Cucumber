Feature: US1008 Scenario Outline kullanarak farkli degerlerle negative login testi


   Scenario Outline: TC13 farkli kullanici adi ve password

     Given kullanici "HMCUrl" sayfasina gider
     And login linkine tiklar
     Then scenario outline'dan kullanici adi olarak "<username>" yazar
     Then scenario outline'dan password olarak "<password>" yazar
     And Login butonuna basar
     Then giris yapilamadigini test eder


     Examples:
     |username|password|
     |MANAGER|MANAGER1|
     |manager|manager1|
     |MaNaGer|MaNager1|
     |Man ager|Mana ger1|
