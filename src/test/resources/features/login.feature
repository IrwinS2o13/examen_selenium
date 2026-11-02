#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado estoy en la página de la tienda
    Y me logueo con mi usuario "racondorib@gmail.com" y clave "N0p455w0rd!26"
    Cuando navego a la categoria Clothes y subcategoria Men
    Y agrego 2 unidades del primer producto al carrito