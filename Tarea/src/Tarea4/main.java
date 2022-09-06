package Tarea4;

import static java.lang.Integer.parseInt;

public class main {
    public static void main(String[] args) {
        OptionParser options = new OptionParser(args);
        options.OptionRegister("repetir");
        options.OptionRegister("texto");
        options.parse();

        for (int i = 0; i < parseInt(options.getOption("repetir"));i++){
        System.out.println(options.getOption("texto"));
        }

    }
}

/*
Las principales caracteristicas de la arquitectura limpia son:

- Las clases deben ser desplegables de manera independiente sin afectar otras clases.
- Agrupar clases que puedan cambiar dentro de un solo componente.
- Una clase esta enfocada a un solo objetivo, de la misma forma que las funciones y metodos.
- Trabajar con clases con metodos de alto nivel que internamente usen metodos de bajo nivel
- Convertir en un solo metodo privado todos los fragmentos de codigo que se utilicen en varios metodos publicos
 */
