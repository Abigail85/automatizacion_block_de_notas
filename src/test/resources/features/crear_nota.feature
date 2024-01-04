#language:es
  Característica: Crear una nota
    Yo como usuario quiero crear una nota

    Antecedentes:
      Dado que un usuario se encuentra en un block de notas

    @crearNotaSencilla
   Escenario: Crear nota
     Cuando crea una nota
     Entonces puede ver la nota creada de manera exitosa


    @CrearNotaEnNegrita
    Escenario: Crear nota con Negrita
      Cuando escribe una nota nueva
      Entonces debe ver como resultado su nota en negrita



