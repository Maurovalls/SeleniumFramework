Feature: Redireccion de todos los modulos

  Como usuario puedo redirigirme a los diferentes modulos

  Scenario Outline: El usuario ingresa aL modulo HOME
    Given El usuario se encuentra en la pagina HOME
    When El usuario hace click en la opcion "<modulo>"
    Then El usuario deberia permanecer en la pagina HOME

    Examples:
      | modulo             |
      | Home               |

  Scenario Outline: El usuario ingresa aL modulo AUTOMATION
    Given El usuario se encuentra en la pagina HOME
    When El usuario hace click en la opcion "<modulo>"
    Then El usuario deberia ver el texto Category: automation

    Examples:
    | modulo             |
    | Automation         |


  Scenario Outline: El usuario ingresa aL modulo SELENIUM
    Given El usuario se encuentra en la pagina HOME
    When El usuario hace click en la opcion "<modulo>"
    Then El usuario deberia ver el texto Category: selenium

    Examples:
      | modulo             |
      | Selenium           |

  Scenario Outline: El usuario ingresa aL modulo SELENIUM TESTING TUTORIALS
    Given El usuario se encuentra en la pagina HOME
    When El usuario hace click en la opcion "<modulo>"
    Then El usuario deberia ver el texto Selenium Testing Tutorials

    Examples:
      | modulo                     |
      | Selenium testing tutorials |

  Scenario Outline: El usuario ingresa aL modulo THE WAITER LIBRARY
    Given El usuario se encuentra en la pagina HOME
    When El usuario hace click en la opcion "<modulo>"
    Then El usuario deberia ver el texto Category: waiter

    Examples:
      | modulo             |
      | The waiter library |
