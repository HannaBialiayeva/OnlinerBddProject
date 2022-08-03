Feature: As a user I want to get ability to use menu sections

  @smoke
  Scenario: "Автобарахолка" section should contains appropriate columns
    Given the user opens Onliner website and find Auto section
    When the user hovers on the 'Автобарахолка' section
    Then section child menu contains columns with price, location, car make

  Scenario: "Дома и квартиры" section should contains appropriate columns
    Given the user opens Onliner website and find House section
    When the user hovers on the 'Houses and apartments' section
    Then section child menu contains columns with price ranges, cities, number of rooms