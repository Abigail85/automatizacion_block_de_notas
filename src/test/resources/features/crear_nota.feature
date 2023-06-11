#language:es
  Característica: Crear una nota sin ningun formato
    Yo como usuario quiero crear una nota sin ningun tipo de formato

  Escenario: scenario: : Crear nota
    Dado que un usuario ingresa a la opcion "Nota de texto sin formato"
    Cuando escribe el mensaje "¿Hola amiguitos como estan?" y le cambia el titulo a la nota por "Mi primera Nota"
    Entonces puede buscar y ver la nota guardada con el titulo "Mi primera Nota"



