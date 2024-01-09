#language:es
  Característica: Crear una nota
    Yo como usuario ingreso a un block de notas
    y  realizo diferentes acciones en el

    Antecedentes:
      Dado  que un usuario se encuentra en un block de notas

    @crearNotaSencilla
   Escenario: Crear nota
     Cuando crea una nota
     Entonces puede ver la nota creada de manera exitosa


    @CrearNotaConFormato
    Esquema del escenario: : Crear nota con Formato
      Cuando escribe una nota nueva en <TIPO DE LETRA>
      Entonces puede ver que es el mismo mensaje que escribio <TIPO DE LETRA>
      Ejemplos:
        | TIPO DE LETRA |
        | NEGRITA       |
        | ITALIC        |
        | UNDERLINE     |
        | STRIKETHROUGH |
        | DEFAULT       |







