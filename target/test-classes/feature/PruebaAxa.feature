# Creado Por: Javier Leonardo Henao Zarazo
# Fecha creación 03/07/2024
# Feature Caso Uno 


@PruebaAxa
Feature: Prueba Axa
  
  
	@CreacionUsuario
  Scenario Outline: Crear nuevo Usuario exitosamente
  
  	Given Ingreso al sitio
    When Se verifica que se ingrese al sitio PRODUCT STORE
    And Ingreso a la opcion Sign up
    Then Ingreso Username <username> y Password <password>
    

    Examples:
      | username | password |
      ##@externaldata@./src/test/resources/DataDriven/PruebaAxa.xlsx@Caso01
|"Username"|"Password"|


	@RealizarCompra
  Scenario Outline: Realizar una compra, añadiendo productos al carrito.
  
  	Given Ingreso al sitio
    When Se verifica que se ingrese al sitio PRODUCT STORE
    And Seleccionar Categories <categories>
    And Selecciono Producto <producto>
    Then Dar click en el boton Add to cart


    Examples:
      | categories | producto |
      ##@externaldata@./src/test/resources/DataDriven/PruebaAxa.xlsx@Caso02
|"Phones"|"Samsung galaxy s6"|
|"Laptops"|"Sony vaio i5"|
|"Monitors"|"Apple monitor 24"|
|"Phones"|"HTC One M9"|
|"Laptops"|"MacBook Pro"|
|"Monitors"|"ASUS Full HD"|


