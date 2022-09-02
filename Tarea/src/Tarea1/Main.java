package Tarea1;

public class Main {
    public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance("Instancia 1");
    System.out.println("referencia de la primer instancia " + singleton1);
    Singleton singleton2 = Singleton.getInstance("Instancia 2");
    System.out.println("referencia de la segunda instancia " + singleton2);

    singleton1.AmIEqualTo(singleton2);
    singleton2.AmIEqualTo(singleton1);


    }
}

/*PATRONES CREADORES
* Patron Singleton: - Se podria usar cuando creamos una ventana que no se puede correr 2 veces
*   Su principal funcion es evitar que se cree mas de una instancia, cuando se intenta
*   crear una nueva instancia esta devuelve la referencia de la instancia ya creada.
* Patron Prototype: - Se podria usar para crear una nueva instancia a partir de una ya creada sin modificar esta.
*   Su principal funcion es permitir clonar una instancia ya creada con todos sus
*   parametros, es posible crear el metodo en la clase de forma manual o bien usar
*   la interfaz propia de java, con la unica diferencia de que usando esta libreria
*   debemos usar un try para interceptar posibles errores.
* Patron Factory: - Se usa comunmente para facilitar la creacion de instancias de un mismo tipo
*   Este patron nos permite crear instancias de distintas clases dependiendo de los
*   parametros, dicho de otra forma, es una clase constructora que devuelve una u otra
*   instancia basado en los parametros que le son ingresados.
* Patron Builder: - Se usa para instanciar clases con parametros de una manera fluida
*   Este patron nos permite crear una instancia con parametros definidos, esto utilizando
*   metodos de la instancia builder que devuelven una instancia de la clase builder,
*   hasta que se utiliza el metodo build() el cual devuelve una instancia de la clase esperada.
*
* PATRONES DE ESTRUCTURA
* Patron Adapter: - se usa para adaptar librerias antiguas a codigo nuevo
*   Este patron estandariza metodos de otra clase que han sido creados de forma distinta. La clase
*   crea metodos compatibles utilizando los metodos de la clase deseada creando asi una estructura
*   comun.
* Patron Decorator: - Se usa por ejemplo para mandar correos a varios destinos sin la necesidad de varias instancias.
*   Este patron nos permite ir concatenando funcionalidades de otras clases, instancia una clase dentro
*   de otra clase reutilizando ese codigo y añadiendole funcionalidades propios de la clase que esta
*   instanciando.
* Patron Facade: - Se usa para ocultar codigo y facilitar el uso de varias librerias enfocadas a una accion concreta.
*   Este patron crea metodos los cuales llevan un codigo complejo que queda oculto, solicitando
*   solo los parametros necesarios, dandonos asi un codigo mas limpio.
*
*/

