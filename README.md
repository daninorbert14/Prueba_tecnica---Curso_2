Prueba técnica - Curso 2

Se trata de un programa que permite filtrar una lista de vuelos según distintos criterios de búsqueda basados en fechas y que se puedan ver en la terminal.

Para ello, he dividido el proyecto en clases separadas por paquetes:
- El paquete "entities" que contiene la clase "Vuelo" para crear los distintos vuelos con sus datos.
- El paquete "utils" que contiene la clase "UtilsVuelos" con la lógica CRUD del programa y la clase "CargaDeVuelos" con un método que simula la carga de una página web.
- Por separado, la clase "SistemaVuelos" que es la clase principal ejecutbale (UI/Consola).

*Clase SistemaVuelos*
Contiene:
- Dos constantes "fechaInicio" y "fechaFin" que serán los parametros para filtrar los vuelos.
- Una lista de vuelos (listaVuelos) hardcodeada para probar el programa.
- Creación y llamada al método "imprimirVuelos" que imprime la lista de vuelos completa.
- Pedida al usuario que introduzca las fechas a través del método "introducirFecha" si lo desea pudiendo dejarlas en blanco.
- Llamada al método "cargarVuelos".
- Llamada al método "filtrarVuelos".

*Clase UtilsVuelos*
Contiene:
- Creación del método "filtrarVuelos" que filtra la lista de vuelos dada según las fechas recibidas utilizando programación funcional por mayor comodidad y eficiencia:
    Filtra los vuelos cubriendo los 4 posibles casos:
        · Si fechaInicio y fechaFin son null -> devuelve todos.
        · Si solo fechaInicio es null -> hasta fechaFin.
        · Si solo fechaFin es null -> desde fechaInicio.
        · Si ambos contienen un valor -> entre las dos fechas.
- Creación del método "introducirFecha" que lee por Scanner una fecha introducida por el usuario y la formatea para que aparezca en orden.

*Clase Vuelo*
Contiene:
- Parámetros que tendrá cada vuelo como el id, nombre, lugar de salida, etc.
- Su método constructor.
- Sus Getters.
- Un método "toString" para imprimir el vuelo de una forma determinada.

*Clase CargaDeVuelos*
Contiene el método run que simula la carga de una página web usando al función "sleep".

Para instalarlo, ejecuta un "pull" de este repositorio y abre el pryecto en tu IDE.
