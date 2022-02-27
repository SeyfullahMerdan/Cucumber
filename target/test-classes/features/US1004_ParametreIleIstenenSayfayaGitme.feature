Feature: US1004 Parametre ile istenen sayfaya gitme

  Scenario: TC06 Eski usul amazona gitme

    Given kullanici amazon sayfasina gider
    # Then kullanici techpreducation sayfasina gider   Parametre olmadıgı için her seferinde Sdefinition istiyor!.


  @parUrl
  Scenario: TC07 parametre ile istenen sayfaya gitme

    Given kullanici "TechproedUrl" sayfasina gider