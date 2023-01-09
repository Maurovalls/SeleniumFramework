Feature: Login

  Como usuario me quiero loguear en la aplicacion Sauce Demo

  @Login
  Scenario: Login correcto
    Given El usuario navega al sitio web de sauce demo
    When El usuario ingresa las credenciales correctas
    Then El usuario deberia ver que se logueo correctamente

  @Login
  Scenario: Login incorrecto
    Given El usuario navega al sitio web de sauce demo
    When El usuario ingresa las credenciales incorrectas
    Then El usuario deberia ver que se loguea incorrectamente

