Prueba técnica - Curso 2

Se trata de un programa que permite filtrar una lista de vuelos según distintos criterios de búsqueda basados en fechas y que se puedan ver en la terminal.

Para ello, he dividido el proyecto en clases separadas por paquetes:
- El paquete "entities" que contiene la clase "Vuelo" para crear los distintos vuelos con sus datos.
- El paquete "utils" que contiene la clase "UtilsVuelos" con la lógica CRUD del programa y la clase "CargaDeVuelos" con un método que simula la carga de una página web.
- Por separado, la clase "SistemaVuelos" que es la clase principal ejecutbale (UI/Consola).

*Clase "SistemaVuelos"*
Contiene:
- Dos constantes "fechaInicio" y "fechaFin" que serán los parametros para filtrar los vuelos.
- Una lista de vuelos (listaVuelos) hardcodeada para probar el programa.
- Creación y llamada al método "imprimirVuelos" que imprime la lista de vuelos completa.
- Pedida al usuario que introduzca las fechas si lo desea pudiendo dejarlas en blanco.
- Llamada al método "cargarVuelos".
- Llamada al método "filtrarVuelos".

*Clase UtilsVuelos*
Contiene:
- Creación del método

*Clase Vuelo*


*Clase CargaDeVuelos*

# Prueba-t-cnica---Curso-2
