# language:es

  Característica: Eliminar elementos
    Yo como usuario ingreso a un block de notas
    y creo una lista de elementos
    con la cual deseo realizar diferentes acciones

    @CreaUnaListaDeTareas
    Escenario: Crear un elemento
    Dado que un usuario crea una lista de tareas
      | Barrer  |
      | Trapear |
      | Cocinar |
      | Lavar   |
      | Lavar   |
      Y un usuario mueve el elemento 3 de la lista donde de encuentra el elemento 2
      Cuando elimina el elemento 2 de la lista
      Entonces debe ver como resultado 4 elementos





