Feature: Pruebas a la pagina de Freetogames

  @test1
  Scenario Outline: Traer juegos de la tienda para pc
    When traemos los juegos de "<plataforma>" y la categoria es de "<cateogria>"
    Then el codigo de respuesta es 200
    And y la respuesta tiene un "id" y "title"
    Examples:
      | plataforma  | cateogria |
      | pc          | shooter   |

  @test2
  Scenario Outline: Traer juegos de la tienda para pc erroneo
    When traemos los juegos de "<plataforma>" y la categoria es de "<cateogria>"
    Then el codigo de respuesta es 404
    Examples:
      | plataforma  | cateogria |
      | pasdfc          | shooter   |